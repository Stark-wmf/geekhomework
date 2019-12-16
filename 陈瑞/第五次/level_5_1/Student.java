package 陈瑞.level_5_1;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int number;
    private String sex;
    ArrayList<Grade> list = new ArrayList<>();

    public Student() { }
    public Student(String name, int number, int age, String sex) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.sex = sex;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public int getNumber(int index) {
        return number;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getName(int index) {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void add(String name, int number, int age, String sex) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.sex = sex;
    }

    public void remove(int index) {
        list.remove(index);
    }

}
