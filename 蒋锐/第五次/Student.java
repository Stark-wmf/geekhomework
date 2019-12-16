package 蒋锐;

import java.util.Comparator;

//学生类用于定义学生属性；
public class Student {
    private String name,classNub,sex;
    private int age;
    private long  stuId;
    public Student(String classNub,String name,long stuId,int age,String sex){
        this.age=age;
        this.classNub=classNub;
        this.name=name;
        this.stuId=stuId;
        this.sex=sex;
        toString();
    }
   public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassNub(String classNub) {
        this.classNub = classNub;
    }

    public String getClassNub() {
        return classNub;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public long getStuId() {
        return stuId;
    }

    @Override
    public String toString() {
        return " 班级:"+classNub+" , 姓名:" +name+" 学号:"+stuId+" , 年龄:"+age+" , 性别:"+sex+"    ";
    }

}
