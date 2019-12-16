package 陈瑞.level_5_1;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                Student student1=new Student("王大妹", 2019210930, 18, "女");
                Student student2=new Student("王二妹", 2019210931, 17, "女");
                Student student3=new Student("大牛", 2019210965, 19, "男");
                Student student4=new Student("二牛", 2019210956, 18, "男");
                Student student5=new Student("超级飞侠", 2019210948, 19, "男");
                ArrayList<Student> list=new ArrayList<>();
                list.add(student1);
                list.add(student2);
                list.add(student3);
                list.add(student4);
                list.add(student5);
                Grade grade=new Grade(list);
                grade.Output();
        }

}

