package 陈瑞.level_5_1;
import java.util.ArrayList;
public class Grade {
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Grade(ArrayList list) {
        studentList = list;
    }

    //增序
    public void Up() {

    }

    //降序
    public void Down() {

    }
    //移除
    public void remove(int index){
        studentList.remove(index);
    }

    //遍历输出
    public void Output() {
        for (int i = 0; i < studentList.size(); i++) {
            Student stu = studentList.get(i);
            System.out.println("姓名" + stu.getName() + ",学号" + stu.getNumber() + ",年龄" + stu.getAge() + ",性别" + stu.getSex());
        }
        System.out.println("===============================================");
        for (Student k : studentList) {
            System.out.println("姓名" + k.getName() + ",学号" + k.getNumber() + ",年龄" + k.getAge() + ",性别" + k.getSex());
        }
    }
}



