package com.javahomework集合;

import java.util.*;

/**
 *学生信息储存类
 */
public class GradeStudent {

    /**
     * 1.用于存放学生信息的List
     * 2.创建一个供给输入的对象
     */
    public List<StuInformation> claStudent;
    private Scanner input=new Scanner(System.in);
    public GradeStudent(){
        this.claStudent=new ArrayList();
       // input=new Scanner(System.in);
    }

    /**
     * 用于往claStudent中添加学生信息
     */
    public void claStudentAdd(){
        StuInformation[] stu={new StuInformation("03","xiaoyi","01",18,"boy"),new StuInformation("03","xiaoer","02",18,"boy"),
                new StuInformation("03","xiaosan","03",18,"boy"),new StuInformation("03","xiaosi","04",18,"girl"),
                };//方法一
        StuInformation stu5= new StuInformation("03","xiaowu","05",18,"girl");//方法二
        claStudent.addAll(Arrays.asList(stu));
        claStudent.add(stu5);
        System.out.println("学生信息添加完毕");
    }

    /**
     * 用于执行用户添加学生信息
     */
    public void cusAdd(){
        StuInformation stu5=claStudent.get(0);
        System.out.println("请输入你要添加的学生id信息：");
        String id= input.next();
       // stu.setId(id);
        StuInformation stu=new StuInformation("",stu5.getName(),id,stu5.getAge(),stu5.getSex());
        //(claStudent.contains(stu))
        while ((claStudent.contains(stu))){
            System.out.println("添加学生已存在，请重新输入！");
            id = input.next();

        }
        System.out.println("添加学生成功！");
        System.out.println("请输入学生班级信息：");
         String cla = input.next();
        System.out.println("请输入学生姓名信息：");
        String name = input.next();
        System.out.println("请输入学生年龄信息：");
        int age = input.nextInt();
        System.out.println("请输入学生性别信息：");
        String sex = input.next();
        StuInformation newStudent=new StuInformation(cla,name,id,age,sex);
        claStudent.add(newStudent);
        System.out.println("新学生添加成功!");
    }

    /**
     * 删除List中的学生信息
     */
    public void claStudentRemove(){
        System.out.println("请输入要删除的学生号：");
        int who=input.nextInt()-1;
        claStudent.remove(who);
        System.out.println("删除成功！");
    }
    /**
     * 遍历输出1---数组式遍历
     */
    public void wherever1(){
        int size=claStudent.size();
        System.out.println("有如下学生信息！");
        for(int i=0;i<size;i++){
            StuInformation in=(StuInformation) claStudent.get(i);
            System.out.println("班级："+in.getCla()+",姓名:"+in.getName()+",id:"+in.getId()+",年龄:"+in.getAge()+",性别:"+in.getSex());
        }
    }
    /**
     * 遍历输出2---迭代器式遍历
     */
    public void wherever2(){
        Iterator it=claStudent.iterator();
        System.out.println("有如下学生信息！");
        while(it.hasNext())
        {
            StuInformation in=(StuInformation)it.next();
            System.out.println("班级："+in.getCla()+",姓名:"+in.getName()+",id:"+in.getId()+",年龄:"+in.getAge()+",性别:"+in.getSex());
        }
    }
    /**
     * 遍历输出3---for each式遍历
     */
    public void wherever3(){
        System.out.println("有如下学生信息！");
        for(Object obj:claStudent){
            StuInformation in=(StuInformation)obj;
            System.out.println("班级："+in.getCla()+",姓名:"+in.getName()+",id:"+in.getId()+",年龄:"+in.getAge()+",性别:"+in.getSex());
        }
    }
    /**
     * 根据序号升序排序
     */
    public void Sort(){
        Collections.sort(claStudent);
        for(Object obj:claStudent){
            StuInformation i=(StuInformation)obj;
            System.out.println(i);
        }
        System.out.println("-----倒序-----");
        Comparator cmp=Collections.reverseOrder();
        Collections.sort(claStudent,cmp);
        for(Object obj:claStudent){
            StuInformation i=(StuInformation)obj;
            System.out.println(i);
        }
    }


}
