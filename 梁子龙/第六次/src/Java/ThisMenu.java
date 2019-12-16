package Java;

import filesearch.FileUtils;

import java.io.File;
import java.io.IOException;

public class ThisMenu extends FileUtils {
    public static void main(String[] args) throws IOException {
        ThisMenu.listDirectory(new File("D:\\term1\\java练习\\java-io作业"));
    }
}
