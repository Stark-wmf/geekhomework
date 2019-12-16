package 李彬.zuoye3;


import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

/**
 * 使用ArrayList泛型添加5个学生对象，然后遍历打印5位学生的自我介绍方法。
 * （需创建学生类）Student.java包含 name,age,gender属性，printer()介绍方法
 * @author Administrator
 *
 */
public class StudentList {


    public static void main(String[] args) {
        //StudentList st = new StudentList();
        // 创建ArrayList泛型数组
        List<Student> alist = new ArrayList<Student>();
        // 创建5个学生对象并初始化
        Student s1 = new Student(01,"张三",2019,18, "男");
        Student s2 = new Student(02,"李四",2017, 15, "女");
        Student s3 = new Student(02,"王五", 2021,20,"男" );
        Student s4 = new Student(03,"陆六", 2020,20,"女");
        Student s5 = new Student(01,"赵丽",2055,19, "女");

        // 将学生对象添加到泛型数组中
        alist.add(s1);
        alist.add(s2);
        alist.add(s3);
        alist.add(s4);
        alist.add(s5);
        System.out.println("排序前的结果："+"\n"+alist);
        Collections.sort(alist, new Comparator<Student>(){



            /*

             * int compare(Person p1, Person p2) 返回一个基本类型的整型，

             * 返回负数表示：p1 小于p2，

             * 返回0 表示：p1和p2相等，

             * 返回正数表示：p1大于p2

             */

            public int compare(Student p1, Student p2) {

                //按照Person的年龄进行升序排列

                if(p1.getXuehao() > p2.getXuehao()){

                    return 1;

                }

                if(p1.getXuehao() == p2.getXuehao()){

                    return 0;

                }

                return -1;

            }

        });
        System.out.println("从小到大排序后的结果："+"\n"+alist);
        Collections.sort(alist);
        for (int i = 0; i <alist.size() ; i++) {
            System.out.println(alist.get(i).toString());
        }

    }
}
