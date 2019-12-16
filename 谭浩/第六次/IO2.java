package com.homework4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IO2 {
    public static void main(String[]args){
        System.out.println("请输入你要查询的位置：");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        List<File> list=Test1.getAllFiles(a);
        for (File file:
                list
             ) {
            if(file.toString().endsWith(".java")){
                System.out.println(file.getName());
            }
        }
    }
}
