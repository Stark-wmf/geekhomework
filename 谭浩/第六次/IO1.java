package com.homework4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class IO1 {
    public static ArrayList<String> dirs=new ArrayList<>();
    public static ArrayList<String> files=new ArrayList<>();
    public static void isDir (File file) {
        if (file.isDirectory()) {
            dirs.add(file.getName());
            File[] file2 = file.listFiles();
            for (File file1 : file2) {
                isDir(file1);
            }
        } else {
            files.add(file.getName());
        }
    }
    public static void main(String[]args){
        System.out.println("请输入目录：");
        Scanner scanner=new Scanner(System.in);
        String f=scanner.nextLine();
        File file=new File(f);
        isDir(file);
        System.out.println("文件夹有："+IO1.dirs.size()+"个");
        int countDir=0;
        int countFile=0;
        for (String dir:IO1.dirs
             ) {
            countDir++;
            System.out.printf("%s;",dir);
            if(countDir%5==0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("文件有："+IO1.files.size()+"个");
        for (String fi:IO1.files
        ) {
            countFile++;
            System.out.printf("%30s;",fi);
            if(countFile%4==0){
                System.out.println();
            }
        }
    }
}
