package Level1;

import java.io.File;
//使用递归遍历输出文件和文件夹名称
public class Directory {
    public void listDirectory(File dir){
        if (!dir.exists()){
            System.out.println("文件"+dir+"不存在");
        }
        if(!dir.isDirectory()){
            System.out.println(dir+"不是文件");
        }
        File []files=dir.listFiles();
        if (files.length>0){
            for (File name:files) {
                if (name.isDirectory()){
                    listDirectory(name);//实行递归
                }
                    System.out.println(name);
            }
        }

    }
}
