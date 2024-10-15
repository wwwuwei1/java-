import java.util.ArrayList;//同Student类中用法
import java.util.List;

public class Group {//定义group类为小组
    String name;//其中一个属性为name，定义小组名
    List<Student> students;//创建一个List<Student>类型的属性students，储存小组内的对象

    public Group(String name) {//用于初始化name属性
        this.name = name;
        this.students = new ArrayList<>();//把students属性初始化为一个新的ArrayList对象
    }

    public void addStudent(Student student) {//定义一个方法，用于向小组中添加一个学生
        students.add(student);//调用了ArrayList中的add方法，把学生添加到students这个列表中
    }

    public static List<Group> createGroups(List<Student> students) {//定义一个静态方法，接受List<Student>并且储存返回一个新的列表
        List<Group> groups = new ArrayList<>();

        //创建第一个小组，命名为1组，并且添加两个学生
        Group group1 = new Group("1组");
        group1.addStudent(students.get(0));
        group1.addStudent(students.get(1));
        groups.add(group1);//将group1添加到groups列表中

        //同上
        Group group2 = new Group("2组");
        group2.addStudent(students.get(2));
        group2.addStudent(students.get(3));
        groups.add(group2);

        //同上
        Group group3 = new Group("3组");
        group3.addStudent(students.get(4));
        group3.addStudent(students.get(5));
        groups.add(group3);

        //同上
        Group group4 = new Group("4组");
        group4.addStudent(students.get(6));
        group4.addStudent(students.get(7));
        groups.add(group4);

        return groups;//返回填充了小组信息的groups列表
    }
}