package filesearch;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    /**
     * 列出指定目录下（包括其子目录）的所有文件
     * @param dir
     * @throws IOException
     */
    public static  void  listDirectory(File dir)throws IOException {
     if(!dir.exists()){
         throw new IllegalArgumentException("目录"+dir+"不存在");
     }
     if(!dir.isDirectory()){
         throw new IllegalArgumentException(dir+"不是目录");
     }
     File[] files=dir.listFiles();
        for (File file:files) {
            System.out.println(file);
        }
        //严谨点在此判断只是一种好的编程习惯，其实在上面的exists（）已经判断过了
     if(files!=null&&files.length>0){
         for (File file:files){
             if(file.isDirectory()){
                 listDirectory(file);
             }
             else {
                 System.out.println(file);
             }
         }
     }
    }
}
