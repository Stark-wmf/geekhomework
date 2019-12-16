package 李彬.zuoye3;

public class Student implements Comparable<Student>{
    // 姓名，性别，年龄
    private int banji;
    private String name;
    private int xuehao;
    private int age;
    private String gender;

    public int getBanji() {
        return banji;
    }

    public void setBanji(int banji) {
        this.banji = banji;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // 无参构造方法
    public Student() {}
    // 有参构造方法

    public Student(int banji, String name, int xuehao, int age, String gender) {
        this.banji = banji;
        this.name = name;
        this.xuehao = xuehao;
        this.age = age;
        this.gender = gender;
    }
    public String toString() {
        return "班级:"+banji+"我叫:" + name + "学号:    "+xuehao+"   ,今年:" + age + "岁"+"性别:" + gender+"\n";
    }

    @Override
    public int compareTo(Student o) {
        return o.getXuehao()-this.getXuehao();
    }


}


