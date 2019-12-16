package 第六次作业;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class catalog {
    private static ArrayList<String> Files =new ArrayList<>();
    public static void main(String args[]) throws Exception{
        System.out.println("请输入你要查询的目录");
        String catalog="c://root";
        getlg(catalog);


    }
    private static void getlg(String catalog){
        File roots= new File(catalog);
        File[] filers =roots.listFiles();
        for(File file :filers){
            if(file.isDirectory()){
                getlg(file.getAbsolutePath());
                Files.add(file.getAbsolutePath());
                System.out.println("显示"+catalog+"下的所有目录及文件"+file.getAbsolutePath());
            } else{
                System.out.println("@"+file.getAbsolutePath()+";");
            }
        }
    }
}
