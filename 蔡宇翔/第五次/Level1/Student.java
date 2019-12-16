package 蔡宇翔.Level1;

public class Student {
    private String classes;
    private String name;
    private String number;
    private String sex;
    private int age;


    public Student(String classes, String name, String number, String sex, int age){
        this.classes= classes;
        this.name= name;
        this.number= number;
        this.sex= sex;
        this.age= age;
    }


    public String getSex() {
        return sex;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClasses() {
        return classes;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classes='" + classes + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
