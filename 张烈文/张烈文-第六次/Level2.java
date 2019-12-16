package Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Level2  {
    public  static void  lis(File file) throws IOException {
       List<File> files=new ArrayList<>();
//        String file2="C:java\\src\\kejian";
//        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(file2));
        File[] x = file.listFiles();
        if (x != null && x.length > 0) {
            for (File S : x) {
                if (S.isDirectory()) {
                    lis(S);
                } else {
                    files.add(S);
                }
            }
        }
        for (File o:files) {
            if(o.toString().endsWith(".java")){
//                os.writeObject(o);
//                os.flush();
                System.out.println(o);
            }
          //  os.close();
        }
    }
    public static void main(String[] args) throws IOException{
        File file1=new File("C:\\java");
        lis(file1);
    }
}
