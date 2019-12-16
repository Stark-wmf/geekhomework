package fifth.level1;

import java.io.File;

public class FilesList {
    public static void putfiles(File file){
        if (file.exists()){
            if (file.isDirectory()){
                File results [] = file.listFiles();
                if (results != null){
                    for (int x = 0 ; x <results.length ; x ++){
                        putfiles(results[x]);
                    }
                }
            }else {
                System.out.println(file);
            }
        }else {
            System.out.println("文件名不存在");
            putfiles(file);
        }
    }
}
