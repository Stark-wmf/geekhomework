package Level2;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private  String Address;
    public Student(int age ,String name, String Address){
        super(age,name);
        this.Address = Address;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String toString(){
        return "姓名："+super.getName()+"\t年龄："+super.getAge()+"\t地址："+getAddress();
    }
}
