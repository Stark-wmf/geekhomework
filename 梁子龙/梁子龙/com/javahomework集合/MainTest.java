package com.javahomework集合;

public class MainTest extends GradeStudent {
    public static void main(String[] args) {
        GradeStudent i=new GradeStudent();
        i.claStudentAdd();
        i.wherever2();
        //i.cusAdd();有点问题，我怀疑是我重写equals方法出了问题，我没有具体写equals是让系统自动生成的
        i.claStudentRemove();
        i.Sort();
    }
}
