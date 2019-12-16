package filesearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        //System.out.println("输入你要遍历的目录路径：");
       // Scanner input = new Scanner(System.in);无法这样操作
        try {
            FileUtils.listDirectory(new File("D:\\term1\\java练习"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
