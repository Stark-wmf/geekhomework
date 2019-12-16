package Level2;

import java.io.*;

public class T {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\LL");
        print(f);
        String newfilepath = f.getAbsolutePath();
        ObjectOutputStream o = null;
        OutputStream out = new FileOutputStream(newfilepath+File.pathSeparator);
        o = new ObjectOutputStream(out);
        o.writeObject(new Student(18,"刘超","重庆邮电大学"));
        o.close();
    }

    private static void print(File f) {
        if (f != null){
            if (f.isDirectory()){
                System.out.println(f);
                File o [] = f.listFiles();
                if (o != null){
                    for (int i = 0; i <o.length; i++) {
                        print(o[i]);
                    }
                }
            }else {
                System.out.println(f);
            }
        }
    }
}
