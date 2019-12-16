package Level2;

import java.io.File;

public class ListJava {
    //list()方法实现遍历和输出.java文件
    public void list(File file){
        File []files=file.listFiles();
        if (files.length>0){
            for (File name:files){
                if(name.isDirectory()){
                    list(name);
                }else if (name.toString().endsWith(".java")){
                    System.out.println(name);
                }
            }
        }
    }
}
