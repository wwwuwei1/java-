import java.util.List;//导入List接口，储存对象集合
import java.util.Random;//Random类，生成随机数

public class Main {
    public static void main(String[] args) {
        List<Student> students = Student.createStudents();//调用静态方法createStudents()生成学生列表
        List<Group> groups = Group.createGroups(students);//同理
        List<Class> classes = Class.createClasses(groups, students);//同理

        Random random = new Random();//创建一个对象用于生成随机数
        int randomClassIndex = random.nextInt(classes.size());//生成随机0~classes.size()-1范围内的整数用于作为班级的编号
        Class randomClassroom = classes.get(randomClassIndex);//根据编号获取对象

        int randomGroupIndex = random.nextInt(randomClassroom.groups.size());//同理用于生成随机数并且作用于小组
        Group randomGroup = randomClassroom.groups.get(randomGroupIndex);

        int randomStudentIndex = random.nextInt(randomGroup.students.size());//作用于随机抽取的小组中的学生
        Student randomStudentFromGroup = randomGroup.students.get(randomStudentIndex);

        int randomStudentIndexFromAll = random.nextInt(randomClassroom.students.size());//作用于随机抽取的班级中的学生
        Student randomStudentFromAll = randomClassroom.students.get(randomStudentIndexFromAll);

        System.out.println("抽取的班级为： " + randomClassroom.name);//输出
        System.out.println("抽取的小组为： " + randomGroup.name);
        System.out.println("抽取的小组学生为： " + randomStudentFromGroup.name);
        System.out.println("抽取的全班学生为： " + randomStudentFromAll.name);
    }
}
