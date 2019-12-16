package copy;

import java.io.File;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
        Copy.copy(new File("G:\\1"),new File("G:\\7"));
        System.out.println("成功了");
    }
}
