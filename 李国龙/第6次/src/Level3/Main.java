package Level3;

import java.io.*;
import java.util.Scanner;
public class Main {

    private static  void copy(File anything,File note) throws IOException {
        FileReader any=new FileReader(anything);
        FileWriter Note=new FileWriter(note);
        int i=any.read();

        while (i!=-1){
            Note.write(i);
            i=any.read();
        }
        any.close();
        Note.close();
        System.out.println("拷贝成功!!!");
    }
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入源文件:");
        String ReadFrom=in.nextLine();
        System.out.println("请输入存入路径:");
        String receive=in.nextLine();
        File a=new File(ReadFrom);
        if (!a.exists()) System.out.println("源文件不存在");
        File b=new File(receive);
        if (!b.exists()) System.out.println("所指存入路径不存在,存入路径已新建");
        copy(a,b);
    }
}
