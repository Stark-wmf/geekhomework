package 蔡宇翔.Level1;

import java.util.*;

public class Aclass extends Student{
    public Aclass(String classes, String name, String number, String sex, int age) {
        super(classes, name, number, sex, age);
    }

    public static void main(String[] args) {

        //创建对象
        Student student1=new Student("03011901","小红","2019210901","女",16);
        Student student2=new Student("03011901","小白","2019210903","男",19);
        Student student3=new Student("03011901","小明","2019210902","男",18);
        ArrayList<Student> theclasses=new ArrayList<>();

        //填五个list
        theclasses.add(student1);
        theclasses.add(student2);
        theclasses.add(student3);
        for (Student s:theclasses
             ) {
            System.out.println(s.toString());

        }
        List<String> name=new ArrayList<>();
        name.add(student1.getname());
        name.add(student2.getname());
        name.add(student3.getname());


        List Age=new ArrayList();

        Age.add(student1.getname()+"的年龄:"+student1.getAge());
        Age.add(student2.getname()+"的年龄:"+student2.getAge());
        Age.add(student3.getname()+"的年龄:"+student3.getAge());

        List<String> Class=new ArrayList<>();
        Class.add(student1.getname()+"的班级:"+student1.getClasses());
        Class.add(student2.getname()+"的班级:"+student2.getClasses());
        Class.add(student3.getname()+"的班级:"+student3.getClasses());


        List<String> Number=new ArrayList<>();
        Number.add(student1.getname()+"的学号:"+student1.getNumber());
        Number.add(student2.getname()+"的学号:"+student2.getNumber());
        Number.add(student3.getname()+"的学号:"+student3.getNumber());


        List<String> Sex=new ArrayList<String>();
        Sex.add(student1.getname()+"的性别:"+student1.getSex());
        Sex.add(student2.getname()+"的性别:"+student2.getSex());
        Sex.add(student3.getname()+"的性别:"+student3.getSex());


        //输入
        System.out.println("班里的同学有"+name);
        System.out.println(Age);
        System.out.println(Class);
        System.out.println(Number);
        System.out.println(Sex);

        //增添一个年龄
        Age.add("kk的年龄："+17);

        //删掉第二个名字
        name.remove(1);

        //按倒叙遍历输出+另一种遍历方法
        Collections.reverse(Age);
        ListIterator a=Age.listIterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }



}
