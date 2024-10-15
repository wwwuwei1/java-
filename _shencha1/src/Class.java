import java.util.ArrayList;//同上
import java.util.List;

public class Class {//定义Class这个类
    String name;//一个属性为name
    List<Group> groups;//包含groups这个属性
    List<Student> students;//包含students这个属性

    public Class(String name) {//初始化Class中的name这个属性
        this.name = name;
        this.groups = new ArrayList<>();//创建一个新的ArrayList来储存groups中的元素
        this.students = new ArrayList<>();//同上
    }

    public void addGroup(Group group) {//定义一个方法将传入的小组元素添加到新的集合中
        groups.add(group);
    }

    public void addStudent(Student student) {//同上
        students.add(student);
    }

    //定义一个静态方法，用传入的小组和学生信息创建班级列表
    public static List<Class> createClasses(List<Group> groups, List<Student> students) {
        List<Class> classes = new ArrayList<>();//创建一个新的列表用于储存班级列表
        Class classroom1 = new Class("七班");
        Class classroom2 = new Class("八班");

        classroom1.addGroup(groups.get(0));//传入groups列表中的第1个元素，也就是第一个小组
        classroom1.addGroup(groups.get(1));
        classroom2.addGroup(groups.get(2));
        classroom2.addGroup(groups.get(3));

        //遍历整个学生列表，根据名字把学生分配到不同班级
        for (Student student : students) {
            if (student.name.equals("吴玮") || student.name.equals("李默涵") ||
                    student.name.equals("周耀东") || student.name.equals("潘成宇")) {
                classroom1.addStudent(student);
            } else {
                classroom2.addStudent(student);
            }
        }

        classes.add(classroom1);//把班级添加到创建的班级列表中
        classes.add(classroom2);
        return classes;//返回班级列表
    }
}