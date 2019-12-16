package LV3;

import java.io.*;

public class Copy {

    public void copyFile(File file, String filepath) {
        String newFilepath = filepath + file.getAbsolutePath().split(":")[1];
        File newFile = new File(newFilepath);
        File[] files = file.listFiles();
        if (files != null) {
            newFile.mkdir();
            if (files.length != 0) {
                for (File subFile : files) {
                    copyFile(subFile, filepath);
                }
            }
        }
         else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new FileInputStream(file);
                out = new FileOutputStream(newFile);
                int len;
                byte[] b = new byte[1024];
                while ((len = in.read(b)) != -1) {
                    out.write(b, 0, len);
                    out.flush();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (out != null) {
                        out.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
