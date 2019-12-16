package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Class class4 = new Class();
        class4.getInfo();
        System.out.println("请输入1来升序排列，2来降序排列");
        Scanner sf = new Scanner(System.in);
        int i = sf.nextInt();
        if(i==1) {
            class4.sortUp();
        }
        else if(i==2) {
            class4.sortDown();
        }
        else
            System.out.println("不排列");
        System.out.println("请输入想要移除的信息序号：");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("删除的信息为：");
        System.out.println(class4.remove(n));
        System.out.println("请输入添加的学生信息：");
      Scanner sd = new Scanner(System.in);
      String student = sd.nextLine();
        System.out.println(class4.add(student));
        System.out.println("最后的顺序为");
        System.out.println(class4.getPersonInfo());

    }
}
