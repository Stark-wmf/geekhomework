package Level2;

import java.io.File;

public class Serchjava {
    private void dir(File file){
        if (file.isDirectory()&&file.exists()) {
            System.out.println("位于" + file.getAbsolutePath() + "下的Java文件或文件夹有:");
            String[] a = file.list();
                for (String i : a
                ) {
                    if ((i.indexOf(".java") != -1) || (i.indexOf(".") == -1)) System.out.println("  " + i);
                }
                File[] files = file.listFiles();
                for (File i : files) {
                    dir(i);
                }

        }
        else if (!file.exists()){
            System.out.println("文件不存在");
        }

    }
    public static void main(String[] args) {
        File i=new File("src");
        Serchjava a=new Serchjava();
        a.dir(i);
    }
}
