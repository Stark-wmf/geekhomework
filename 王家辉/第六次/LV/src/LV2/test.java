package LV2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class test {
    public static void main(String[] args)throws Exception {
        File a=new File("C:\\Users\\王家辉\\IdeaProjects\\new start\\LV\\src");
        print(a);
        String newfilepath=a.getAbsolutePath();
        ObjectOutputStream c=null;
        OutputStream out=new FileOutputStream(newfilepath+File.pathSeparator);
        c =new ObjectOutputStream(out);
        c.writeObject(new Student("小明",18,"邮电大学"));
        c.close();
    }
    public static void print(File a) {
        if(a!=null){
            if(a.isDirectory()){
                System.out.println(a);
                File c[]=a.listFiles();
                if(c!=null){
                    for (int i = 0; i<c.length ; i++) {
                        print(c[i]);
                    }
                }
            }else {
                System.out.println(a);
            }
        }
    }
}