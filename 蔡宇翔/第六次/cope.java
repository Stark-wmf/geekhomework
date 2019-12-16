package 第六次作业;

import javax.sound.midi.SoundbankResource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class cope {public static void copyFile(String oldPath, String newPath) throws Exception {
    try {
        int bytes = 0;
        int by = 0;
        File ol = new File(oldPath);
        if (ol.exists()) {
            InputStream inputStream = new FileInputStream(oldPath);
            FileOutputStream fileOutputStream = new FileOutputStream(newPath);
            byte[] buffer = new byte[1024];
            while ((by = inputStream.read(buffer)) != -1) {
                bytes += by;
                System.out.println(by);
                fileOutputStream.write(buffer, 0, by);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
        } else {
            System.out.println("文件不存在！");
        }
    } catch (Exception e) {
        System.out.println("复制文件出错！");
        throw new Exception("copy file error !" + "\r\n" + e);
    }

}
}

