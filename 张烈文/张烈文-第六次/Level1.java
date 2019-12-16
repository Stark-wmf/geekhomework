package Work;

import java.io.File;

public class Level1 {
    public static void main(String[] args) {
        File file=new File("\\java");
        Lis(file);
    }
    public static void Lis (File file ) {
        try {
            File[] name = file.listFiles();
            if (name.length > 0 && name != null) {
                for (File s : name) {
                    if (s.isDirectory()) {
//                    µÝ¹é
                        Lis(s);
                    } else {
                        System.out.println(s);
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Ä¿Â¼²»´æÔÚ£¡");
        }

    }
}
