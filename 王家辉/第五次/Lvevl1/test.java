package 王家辉.Lvevl1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
    public class test {
        public static void main(String[] args) {
            TreeSet<Student> a=new TreeSet<>();
            a.add(new Student(2019211300,"小明","男",18,1902));
            a.add(new Student(2019211199,"小红","女",17,1902));
            a.add(new Student(2019211321,"小刚","男",19,1902));
            a.add(new Student(2019211121,"小花","女",18,1902));
            a.add(new Student(2019211381,"小龙","男",19,1902));
            System.out.println("第一种输出方式:集合输出");
            System.out.println(a+"\n"+"*******************");
            System.out.println("第二种输出方式：Iterator");
            Iterator<Student> b=a.iterator();
            while (b.hasNext()){
                System.out.println(b.next()+".");
            }
            System.out.println("*****************"+"\n"+"第三种输出方式：foreach");{
                for (Student c:a
                ) {
                    System.out.println(c);
                }
            }
            ArrayList<Student> e=new ArrayList<>();
            e.addAll(a);
            System.out.println("*******************"+"\n"+"用ListIterator进行升序输出");
            ListIterator<Student> f=e.listIterator();
            while (f.hasNext()){
                System.out.println(f.next());
            }
            System.out.println("********************"+"\n"+"用ListIterator进行降序输出");
            while (f.hasPrevious()){
                System.out.println(f.previous());
            }
        }
    }
