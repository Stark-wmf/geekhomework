import java.io.File;
import java.util.Scanner;


public class LV1 {
    public static void main(String[] args) {
        System.out.println("请输入一个正确且存在的目录");
        Scanner k=new Scanner(System.in);
        String p=k.nextLine();
        File a=new File(p);
        print(a);
    }
    private static void print(File a) {
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

