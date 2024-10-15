import java.util.ArrayList;//导入一个ArrayList类，ArrayList是List接口的一个具体实现，用于储存对象集合
import java.util.List;//导入List接口

public class Student {//定义Student这个类
    String name;//其中的一个属性为name，储存姓名
    int age;//另一个属性age，用于储存年龄
    public Student(String name, int age) {//构造初始化Student对象的方法
        this.name = name;
        this.age = age;
    }

    public static List<Student> createStudents() {//创建一个静态方法createStudents，创建并返回多个对象的List集合
        List<Student> students = new ArrayList<>();//创建一个空的ArrayList对象，用于储存Student对象
        students.add(new Student("吴玮", 18));//以下为创建多个实例
        students.add(new Student("李默涵", 19));
        students.add(new Student("周耀东", 20));
        students.add(new Student("潘成宇", 21));
        students.add(new Student("胡智颖", 22));
        students.add(new Student("李斌", 23));
        students.add(new Student("乔洲", 23));
        students.add(new Student("高一凡", 23));
        return students;//返回
    }
}

