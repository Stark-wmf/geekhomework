package LV2;

import java.io.Serializable;

class Student extends Person implements Serializable {
    private String Address;

    public Student(String name, int age, String Address) {
        super(name, age);
        this.Address = Address;
    }

    public String getAddress() {
        return this.Address;
    }

    public String toString() {
        return "名字:" + super.getName() + " " + "年龄:" + super.getAge() + " " + "地址" + getAddress();
    }
}


