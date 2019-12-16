package Level2;


public class Student extends Person  {
    private String name;
    private int age;
    private String id;
    private Address address;

    @Override
    public String toString() {
        return "name:"+name+","+"age:"+age+","+"id:"+id+","+"Address:"+address.toString();
    }

    public Student(String name, int age, String id, Address address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }


}
