package 谭浩;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StudentList {
    public List Student;

    public StudentList() {
        this.Student = new ArrayList();

    }

    public void StudentAdd() {
        //String name,int age,int cl,String sex,String id
        StudentMessage s1 = new StudentMessage("小明", 18, 2, "boy ", "1001");
        StudentMessage s2 = new StudentMessage("小红", 17, 2, "girl", "1004");
        StudentMessage s3 = new StudentMessage("小白", 18, 2, "boy ", "1005");
        StudentMessage s4 = new StudentMessage("小黑", 19, 2, "boy ", "1002");
        StudentMessage s5 = new StudentMessage("小黄", 17, 2, "girl", "1006");
        Student.add(s1);
        Student.add(s2);
        Student.add(s3);
        Student.add(s4);
        Student.add(s5);
        System.out.println("通过for循环");
        for (int x = 0; x <= Student.size() - 1; x++) {
            StudentMessage s = (StudentMessage) Student.get(x);
            System.out.println("name:" + s.getName() + " age:" + s.getAge() + " cl:" + s.getCl() + " sex:" + s.getSex() + " id:" + s.getId());
        }
    }

        public void StudentIterator(){
        Iterator it=Student.iterator();
        System.out.println("通过迭代器访问");
        while(it.hasNext()){
            StudentMessage s= (StudentMessage) it.next();
            System.out.println("name:"+s.getName()+" age:"+s.getAge()+" cl:"+s.getCl()+" sex:"+s.getSex()+" id:"+s.getId());
        }
    }

    public void StudentForeach(){
        System.out.println("通过for each访问");
        for(Object obj:Student){
            StudentMessage s= (StudentMessage) obj;
            System.out.println("name:"+s.getName()+" age:"+s.getAge()+" cl:"+s.getCl()+" sex:"+s.getSex()+" id:"+s.getId());
        }
    }

    public void StudentModify() {
        Student.set(4, new StudentMessage("小蓝", 23, 2, "gril", "1003"));
        System.out.println("更改第五位学生信息");
        for (int x = 0; x <= Student.size() - 1; x++) {
            StudentMessage s = (StudentMessage) Student.get(x);
            System.out.println("name:" + s.getName() + " age:" + s.getAge() + " cl:" + s.getCl() + " sex:" + s.getSex() + " id:" + s.getId());
        }
    }

    public void StudentRemove() {
        Student.remove(3);
        System.out.println("删除第四位学生");
        for (int x = 0; x <= Student.size() - 1; x++) {
            StudentMessage s = (StudentMessage) Student.get(x);
            System.out.println("name:" + s.getName() + " age:" + s.getAge() + " cl:" + s.getCl() + " sex:" + s.getSex() + " id:" + s.getId());
        }
    }
    public void StudentSort(){
        Collections.sort(Student);
        for (int x = 0; x <= Student.size() - 1; x++) {
            StudentMessage s = (StudentMessage) Student.get(x);
            System.out.println("name:" + s.getName() + " age:" + s.getAge() + " cl:" + s.getCl() + " sex:" + s.getSex() + " id:" + s.getId());
        }
    }

    public static void main(String[]args){
        StudentList S=new StudentList();
        S.StudentAdd();
        System.out.println("----------------------");
        S.StudentIterator();
        System.out.println("排序后");
        S.StudentSort();
        System.out.println("----------------------");
        S.StudentModify();
        System.out.println("----------------------");
        S.StudentRemove();
        System.out.println("----------------------");
        S.StudentForeach();
    }

}


/**
 * Arrarlist Student=new ArrayList();
 *
 */
