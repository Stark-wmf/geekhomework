package 尚婧凯.leve1;

public class Student implements Comparable<Student>{
    public int Class;
    public String name;
    public String id;
    public int age;
    public String sexual;

    public Student(int Class, String name, String id, int age, String sexual){
        this.Class=Class;
        this.name=name;
        this.id=id;
        this.age=age;
        this.sexual=sexual;
    }

    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
