package 张烈文.javawork;
public class Student implements Comparable<Student>{
    private  String ban;
    private  String name;
    private  String id;
    private   int year;
    private  String sex;


    public String getBan() {
        return ban;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void setBan(String ban) {
        this.ban = ban;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Student(String ban,String name,String id,int year,String sex){
        this.ban=ban;
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.year=year;

    }


    @Override
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId());
    }
}
