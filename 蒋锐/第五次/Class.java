package 蒋锐;

import java.util.*;

//班级类
public class Class {
    List<Student> Class=new ArrayList<Student>();//利用集合储存学生信息；
    //testAdd()向集合里添加数据的方法；
    public void testAdd(){

        Student stu1=new Student("03011903","小明",2019210952,18,"男");
        Student stu2=new Student("03011903","石头",2019210947,18,"男");
        Student stu3=new Student("03011903","花花",2019210963,18,"女");
        Student stu4=new Student("03011903","小华",2019210976,17,"男");
        Student stu5=new Student("03011903","小美",2019210936,18,"女");
        Class.add(stu1);
        Class.add(stu2);
        Class.add(stu3);
        Class.add(stu4);
        Class.add(stu5);
        System.out.println("是否要继续添加学生信息");
        System.out.println("输入1：是，输入其他数字为否");
        Scanner input=new Scanner(System.in);
    //循环添加学生信息
        while(input.nextInt()==1){
            System.out.println("请按照班级-姓名-学号-年龄-性别的顺序输入，每个部分输入完成后按一下回车");
            Class.add(new Student(input.next(),input.next(),input.nextLong(),input.nextInt(),input.next()));
            System.out.println("是否要继续添加学生信息");
            System.out.println("输入1：是，输入其他数字为否");}
    }
    //用于移除学生信息的方法testRemove();
    public void testRemove(){
        System.out.println("是否要删除学生信息");
        System.out.println("输入1：是，输入其他数字为否");
        Scanner input=new Scanner(System.in);
        if(input.nextInt()==1){
            System.out.println("请输入你要删除学生的学号");
            long mark=input.nextLong();
            for(int i=0;i<Class.size();i++){
                if(mark==Class.get(i).getStuId()){
                    Student st=Class.get(i);
                    Class.remove(st);
                    System.out.println("成功删除该学生");
                    break;
                }

            }
        }
    }
    //方法ergodic()是用于遍历集合的方法；
    public void ergodic(){
       //使用foreach遍历集合;
        for (Student stu:Class
             ) {
            System.out.println(stu);

        }
        System.out.println("---------------------------------------");
        //使用for循环遍历集合;
        for(int i=0;i<Class.size();i++){
            System.out.println(Class.get(i));
        }
        System.out.println("----------------------------------------");
        //使用迭代器遍历集合;
        Iterator it=Class.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    //testsort()方法是用于集合中排序的方法；
    public void testSort(){
        //使用冒泡排序排除升序
    for (int i=0;i<Class.size()-1;i++){
        for (int j=0;j<Class.size()-1;j++){
            if(Class.get(j).getStuId()>Class.get(j+1).getStuId()){
                Student temp=Class.get(j);
                Class.set(j,Class.get(j+1));
                Class.set(j+1,temp);
            }
        }
    }
        System.out.println("---------------将集合升序排出----------------------------------");
        for (Student stu:Class ){
            System.out.println(stu);
        }
        System.out.println("----------------将集合降序排出---------------------------------");
        Collections.reverse(Class);//使用反转将升序变为降序；
        for (Student stu:Class ){
            System.out.println(stu);
        }

    }



}
