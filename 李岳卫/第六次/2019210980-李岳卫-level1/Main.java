package fifth.level1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String FileName ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名");
        FileName = scanner.nextLine();
        File file = new File("C:"+File.separator+FileName);
        FilesList filesList = new FilesList();
        filesList.putfiles(file);
    }
}
