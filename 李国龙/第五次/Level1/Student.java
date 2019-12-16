package 李国龙.Level1;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String classnum;
    private int ID;
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    @Override
    public String toString() {
        return
                "班级:" + classnum + ';' +
                "学号:" + ID + ';' +
                "姓名:" + name + ';' +
                "年龄:" + age +';'+
                "性别:" + sex + ';'
                ;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String classnum, int ID, String name, int age, String sex) {
        this.classnum = classnum;
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ID<o2.ID)
            return -1;
        else if (o1.ID>o2.ID)
            return 1;
        else if (o1.ID==o2.ID)
            return 0;
        return 0;
    }
}
