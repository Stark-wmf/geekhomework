package 柳思远;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public List studentIn;
    public Main() {this.studentIn = new ArrayList(); }


    /**
     * 添加
     */
    public void studentAdd() {
        Student s1 = new Student("杨柳","2019210008","female","18");
        studentIn.add(s1);

        Student s2 = new Student("杨洋","2019210002","male","18");
        studentIn.add(s2);

        Student s3 = new Student("张伟","2019210017","male","18");
        studentIn.add(s3);

        Student s4 = new Student("严嵩","2019210004","male","18");
        studentIn.add(s4);

        Student s5 = new Student("吴磊","2019210036","male","18");
        studentIn.add(s5);

        System.out.println("成功添加");
    }


    /**
     * 删除
     */
    public void studengRemove(){
        studentIn.remove(2);
        System.out.println("成功删除");
    }


    /**
     * 通过迭代器来遍历List
     */
    public void studentIterator(){
        //通过集合的iterator方法，取得迭代器的实例
        Iterator it = studentIn.iterator();
        System.out.println("有以下学生（通过迭代器访问）");
        while(it.hasNext()){
            Student cr = (Student) it.next();
            System.out.println("班级："+cr.classmate+" 学号: "+cr.id+" : "+cr.name+" : "+cr.sex+" : "+cr.age);
        }
    }


    /**
     * 通过for each方法访问集合元素
     */
    public  void studentForEach(){
        for(Object obj: studentIn){
            Student cr = (Student) obj;
            System.out.println("班级："+cr.classmate+" 学号： "+cr.id+" : "+cr.name+" : "+cr.sex+" : "+cr.age);
        }
    }

    /*public void studentSour(){
        studentIn.sort(Student.id);
    }*/


    public static void main(String[] args) {
        Main m = new Main();
        m.studentAdd();
        m.studentForEach();

    }

}
