package 尚婧凯.leve1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {

    public Class(){
        this.studentToAdd=new ArrayList();
    }

    public List studentToAdd;

    public void studentList(){
        Student st1=new Student(1,"桃谷绘里香","13",18,"女");
        Student st2=new Student(1,"大桥未久","26",19,"女");
        Student st3=new Student(1,"饭岛爱","05",18,"女");
        Student st4=new Student(1,"濑亚美莉","08",18,"女");
        Student st5=new Student(1,"北条麻妃","32",19,"女");

        studentToAdd.add(0,st1);
        Student temp1=(Student)studentToAdd.get(0);
        System.out.println("添加了："+temp1.id+"号"+temp1.name);
        studentToAdd.add(1,st2);
        Student temp2=(Student)studentToAdd.get(1);
        System.out.println("添加了："+temp2.id+"号"+temp2.name);
        studentToAdd.add(2,st3);
        Student temp3=(Student)studentToAdd.get(2);
        System.out.println("添加了："+temp3.id+"号"+temp3.name);
        studentToAdd.add(3,st4);
        Student temp4=(Student)studentToAdd.get(3);
        System.out.println("添加了："+temp4.id+"号"+temp4.name);
        studentToAdd.add(4,st5);
        Student temp5=(Student)studentToAdd.get(4);
        System.out.println("添加了："+temp5.id+"号"+temp5.name);
    }

    public void studentGet(){
        System.out.println("一班学生有：");
        int size=studentToAdd.size();
        for(int i=0;i<size;i++){
            Student student=(Student) studentToAdd.get(i);
            System.out.println(student.id+"号"+student.name);
        }
    }

    public void studentGet1() {
        System.out.println("一班学生有(通过for each访问)：");
        for (Object obj : studentToAdd) {
            Student student = (Student) obj;
            System.out.println(student.id+"号"+student.name);
        }
    }

    public void studentRemove(){
        Student temp=(Student)studentToAdd.get(4);
        System.out.println("删除了："+temp.id+"号"+temp.name);
        studentToAdd.remove(4);
        studentGet();
    }

    public void studentSort(){
        Collections.sort(studentToAdd);
        System.out.println("按学号排序后：");
        studentGet();
        System.out.println();
        Collections.reverse(studentToAdd);
        System.out.println("按学号排序后(降序)：");
        studentGet();
    }

    public static void main(String[] args){
        Class cs=new Class();
        cs.studentList();
        System.out.println();
        cs.studentGet();
        System.out.println();
        cs.studentGet1();
        System.out.println();
        cs.studentRemove();
        System.out.println();
        cs.studentSort();
    }
}
