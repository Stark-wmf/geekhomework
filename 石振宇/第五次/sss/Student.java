package 石振宇.sss;

public class Student {
    private String classnum;
    private String name;
    private long num;
    private String age;
    private char sex;
    public Student( String classnum,String name,long num,String age,char sex)
    {
        this.classnum = classnum;
        this.name = name;
        this.num = num;
        this.age = age;
        this.sex = sex;
    }


    public void setNum(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "班级："+classnum+"\t姓名："+name+"\t学号："+num+"\t年龄："+age+"\t性别："+sex;
    }
}
