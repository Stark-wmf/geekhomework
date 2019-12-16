package Level3;

import java.io.File;
import java.util.Scanner;

//主函数调用Copy类中的copyDirectory实现文件拷贝，通过Scanner对象传递实参；
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入源文件的磁盘名(如E:)");
        String sourcedisk=input.nextLine();
        System.out.println("请输入源文件名如(Demo)或者(Demo\\\\example)");
        String sourcename=input.nextLine();
        System.out.println("请输入目标的磁盘名(如E:)");
        String targetdisk=input.nextLine();
        System.out.println("请输入目标文件名如(Demo)或者(Demo\\\\example)");
        String targetname=input.nextLine();
        Copy copy=new Copy();
        copy.copyDirectory(sourcedisk+ File.separator+sourcename,targetdisk+File.separator+targetname);

    }
}
