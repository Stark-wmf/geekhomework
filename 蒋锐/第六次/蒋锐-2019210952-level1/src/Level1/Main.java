package Level1;

import java.io.File;
import java.util.Scanner;
//主函数调用Diretory类中的listDiretory方法，并通过Scanner对象传入实参；
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入需要遍历的磁盘名(如E:)");
        String diskname=input.nextLine();
        System.out.println("请输入你要遍历的文件名如(Demo)或者(Demo\\\\example)");
        String filename=input.nextLine();
        Directory directory=new Directory();
        directory.listDirectory(new File(diskname+File.separator+filename));//使用分隔符提高程序的可移植性


    }
}
