package ObjectOuSt;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private static final long serialVersionUID = 123456789L;//
    private String num;
    private String name;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* private static final long serialVersionUID = 123456789L;*/
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Address=" + address +
                '}';
    }

    public Student(String num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.address = new Address();

    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

}
