import java.io.File;
import java.util.Scanner;

public class Level1 {
    public void dir(File file){
        if (file.isDirectory()){
            System.out.println("位于"+file.getAbsolutePath()+"下的文件有:");
            String[]a=file.list();
            for (String i:a
            ) {
                System.out.println("  "+i);
            }
            File[] files=file.listFiles();
            for (File i:files)
            {
                dir(i);
            }
        }
        else if (!file.exists()){
            System.out.println("文件不存在");
        }

    }
    public static void main(String[] args) {
        System.out.println("请输入路径:");
        Scanner in=new Scanner(System.in);
        String path=in.nextLine();

        File i=new File(path);
        Level1 a=new Level1();
        if (i.isFile()) System.out.println(i.getAbsolutePath());
        else a.dir(i);
    }
}
