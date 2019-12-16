package 谭浩;

public class StudentMessage implements Comparable<StudentMessage>{
    private String name;
    private int age;
    private int cl;
    private String sex;
    private String id;

    public StudentMessage(){

    }
    public StudentMessage(String name,int age,int cl,String sex,String id){
        this.name=name;
        this.age=age;
        this.cl=cl;
        this.sex=sex;
        this.id=id;
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

    public int getCl() {
        return cl;
    }
    public void setCl(int cl) {
        this.cl = cl;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(StudentMessage o) {
        return this.getId().compareTo(o.getId());
    }
}

