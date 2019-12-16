package 张烈文.javawork;

import java.util.*;

//利用集合相关知识存储学生信息，学生信息包括：班级、姓名、学号、年龄，性别
//
//        例：班级：03011802；姓名：羊咩咩；学号：2018210868；年龄：18；性别：女
//
//        要求：
//
//        1. 创建一个班级，存储至少5条学生信息，要求可以添加、删除和按序遍历输出（*自己可以尝试多种遍历的方式，可以加分哟
//
//        （1）遍历时可以采用 Iterator has next（），foreach； for
//
//        2. 再此基础上，要求可以通过学号 对班内学生进行排序（降序升序都要*）
public class Level1 {
    public List<Student> information;

    public void add() {
        this.information = new ArrayList();
        Student student1 = new Student("03011902", "小明", "2019210915", 17, "男");
        Student student2 = new Student("03011902", "康康", "2019210910", 19, "男");
        Student student3 = new Student("03011902", "小王", "2019210911", 18, "女");
        Student student4 = new Student("03011902", "小张", "2019210925", 20, "男");
        Student student5 = new Student("03011902", "小李", "2019210920", 18, "女");
        information.add(student1);
        information.add(student2);
        information.add(student3);
        information.add(student4);
        information.add(student5);
    }

    public void get() {
        System.out.println("学生信息如下:");
//      方法一通过get方法
        Student temp = information.get(0);
        Student temp1 = information.get(1);
        Student temp2 = information.get(2);
        Student temp3 = information.get(3);
        Student temp4 = information.get(4);
        System.out.println("班级:" + temp.getBan() + "；" + "姓名:" + temp.getName() + "；" + "学号:" + temp.getId() + "；" + "年龄:" + temp.getYear() + "；" + "性别:" + temp.getSex() + "；");
        System.out.println("遍历方法一--------------------------------------------------------------------------");
//        temp1-4都是这样来输出
//      方法二for循环遍历
        for (int i = 0; i < information.size(); i++) {
            Student A = (Student) information.get(i);
            System.out.println("班级:" + A.getBan() + "；" + "姓名:" + A.getName() + "；" + "学号:" + A.getId() + "；" + "年龄:" + A.getYear() + "；" + "性别:" + A.getSex() + "；");
        }
        System.out.println("遍历方法二--------------------------------------------------------------------------");
//      方法三通过迭代器遍历Iterator
        Iterator it = information.iterator();
        while (it.hasNext()) {
            Student K = (Student) it.next();
            System.out.println("班级:" + K.getBan() + "；" + "姓名:" + K.getName() + "；" + "学号:" + K.getId() + "；" + "年龄:" + K.getYear() + "；" + "性别:" + K.getSex() + "；");
        }
        System.out.println("遍历方法三--------------------------------------------------------------------------");
//        方法四 foreach
        for(Student student:information){
            System.out.println("班级:" +student.getBan() + "；" + "姓名:" + student.getName() + "；" + "学号:" + student.getId() + "；" + "年龄:" + student.getYear() + "；" + "性别:" + student.getSex() + "；");
        }
        System.out.println("遍历方法四--------------------------------------------------------------------------");
    }

    public void ways() {
//        删除处理
        information.remove(0);
        Student k = (Student) information.get(0);
        System.out.println("班级:" + k.getBan() + "；" + "姓名:" + k.getName() + "；" + "学号:" + k.getId() + "；" + "年龄:" + k.getYear() + "；" + "性别:" + k.getSex() + "；");
//        替换处理
        information.set(0, new Student("03011903", "李明", "2019210936", 25, "男"));
        Student X = (Student) information.get(0);
        System.out.println("班级:" + X.getBan() + "；" + "姓名:" + X.getName() + "；" + "学号:" + X.getId() + "；" + "年龄:" + X.getYear() + "；" + "性别:" + X.getSex() + "；");
    }
//    升序
    public void sort() {
//        升序
        System.out.println("升序--------------------------------------------------------------------------");
        Collections.sort(information);
        Iterator it = information.iterator();
        while (it.hasNext()) {
            Student O = (Student) it.next();
            System.out.println("班级:" + O.getBan() + "；" + "姓名:" + O.getName() + "；" + "学号:" + O.getId() + "；" + "年龄:" + O.getYear() + "；" + "性别:" + O.getSex() + "；");
        }
        System.out.println("降序--------------------------------------------------------------------------");
//        降序
        Collections.reverse(information);
        for (int i = 0; i < information.size(); i++) {
            Student D=(Student)information.get(i);
            System.out.println("班级:" + D.getBan() + "；" + "姓名:" + D.getName() + "；" + "学号:" + D.getId() + "；" + "年龄:" + D.getYear() + "；" + "性别:" + D.getSex() + "；");
        }
    }

    public static void main(String[] args) {
        Level1 le = new Level1();
        le.add();
        le.get();
//        le.ways();
        le.sort();

    }
}
