package Work;

import com.sun.xml.internal.bind.v2.TODO;

import javax.swing.*;
import java.io.*;

//输入两个文件夹名称，将A文件夹内容全部拷贝到B文件夹
public class Level3 {
    public static void main(String[] args) throws IOException {
        File f=new File("\\java");
        String s="\\s";
        fofile(f,s);
    }
    public static void fofile(File f,String s){
        File[] file=f.listFiles();
        for(File fi:file){
            if(fi.isDirectory()){
                new File(s+"\\"+fi.getName()).mkdirs();
                String news=s+"\\"+fi.getName();
                fofile(fi,news);
            }else{
                String fs=fi.getName();
                copy(fi,s+"\\"+fs);
            }
        }
    }
    private static void copy(File fi1, String fo1) {
        FileInputStream fi=null;
        FileOutputStream fo=null;
        try{
            fi=new FileInputStream(fi1);
            fo=new FileOutputStream(fo1);
            int len=0;
            byte[] by=new byte[1024];
            while((len =fi.read(by))!=-1){
                fo.write(by,0,len);
            }
        }catch(IOException ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }finally {
            try{
                if(fi!=null)
                    fi.close();
            }catch(Exception e){
                //TODO:handle exception
            }
        }
    }
}
