package 石振宇.sss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    public List <Student> Class;
    public Classroom()
    {
        this.Class = new ArrayList<Student>();
    }
    public void ClassAdd()
    {
        Student stu1 = new Student("03011904","小张",2019210970,"18",'男');
        Student stu2 = new Student("03011904","阿宁",2019210974,"20",'女');
        Student stu3 = new Student("03011904","千夜",2019210972,"18",'男');
        Student stu4 = new Student("03011904","罗辑",2019210971,"19",'男');
        Student stu5 = new Student("03011904","阿卡丽",2019210975,"19",'女');
        Class.add(stu1);
        Class.add(stu2);
        Class.add(stu3);
        Class.add(stu4);
        Class.add(stu5);
        for (Student y : Class)
        {
            System.out.println(y);
        }
    }
    public void Add()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入班级:");
        String classnum1 =  scanner.nextLine();
        System.out.println("请输入姓名:");
        String name1 =  scanner.nextLine();
        System.out.println("请输入学号:");
        long num1 =  scanner.nextLong();
        System.out.println("请输入年龄:");
        String age1 =  scanner.nextLine();
        System.out.println("请输入性别:");
        char sex1 = scanner.next().charAt(0);
        Student stu = new Student(classnum1,name1,num1,age1,sex1);
        Class.add(stu);
        System.out.println(Class);
    }
    public void Remove()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入班级:");
        String classnum1 =  scanner.nextLine();
        System.out.println("请输入姓名:");
        String name1 =  scanner.nextLine();
        System.out.println("请输入学号:");
        long num1 =  scanner.nextLong();
        System.out.println("请输入年龄:");
        String age1 =  scanner.nextLine();
        System.out.println("请输入性别:");
        char sex1 = scanner.next().charAt(0);
        Student stu = new Student(classnum1,name1,num1,age1,sex1);
        Class.remove(stu);
        System.out.println(Class);
    }
    public void sort()
    {
        long a;
        long b;
        for (int i = 0;i<Class.size()-1;i++)
        {
            for (int j = 0;j<Class.size()-1;j++)
            {
                a = Class.get(j).getNum();
                b = Class.get(j+1).getNum();
                if (a < b)
                {
                    Class.get(j).setNum(b);
                    Class.get(j+1).setNum(a);
                }
            }
        }
        System.out.println("-----------降序输出-------------");
        for (Student s : Class)
        {
            System.out.println(s);
        }
        System.out.println("-----------升序输出-------------");
        Collections.reverse(Class);
        for (Student x : Class)
        {
            System.out.println(x);
        }
    }
}
