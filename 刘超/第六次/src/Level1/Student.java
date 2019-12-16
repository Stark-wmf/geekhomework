package Level1;
/*
利用集合相关知识存储学生信息，学生信息包括：班级、姓名、学号、年龄，性别
例：班级：03011802；姓名：羊咩咩；学号：2018210868；年龄：18；性别：女
要求：
1. 创建一个班级，存储至少5条学生信息，要求可以添加、删除和按序遍历输出（*自己可以尝试多种遍历的方式，可以加分哟*）
2. 再此基础上，要求可以通过学号对班内学生进行排序（*降序升序都要*）
 */


import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String classnumber;
    private String name;
    private int Studentnumber;
    private int age;
    private String sex;

    public Student(String classnumber, int Studentnumber, String name, int age, String sex) {
        this.classnumber = classnumber;
        this.name = name;
        this.Studentnumber = Studentnumber;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStudentnumber() {
        return Studentnumber;
    }

    public void setStudentnumber(int studentnumber) {
        Studentnumber = studentnumber;
    }

    public String toString() {
        return "班级：" + classnumber + "\t学号：" + Studentnumber+"\t姓名：" + name +"\t年龄：" + age + "\t性别：" + sex;
    }

    @Override
    public int compareTo(Student i) {
        return this.Studentnumber-i.getStudentnumber();
    }
}
