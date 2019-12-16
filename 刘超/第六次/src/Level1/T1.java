package Level1;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class T1 {
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            String s = input.nextLine();
            List<File> file = getAllfile(s);
            for(File fs : file){
                System.out.println(fs);
            }
        }
        private static void RecursionFile(File file, List<File> files){
            if(file==null){
                return;
            }else{
                File [] filelist = file.listFiles();
                for(File fs : filelist){
                    files.add(fs);
                    if(!fs.isFile()){
                        RecursionFile(fs,files);
                        //递归，层层向下(注意递归逻辑：在递归中如果遇到文件,在进行向下递归时就会发生NullpointException,因为无向下的文件夹)
                    }else{
                        continue;
                    }
                }
            }
        }
    public static List<File> getAllfile(String path){
        List<File> files = new Vector<File>();
        File file = new File(path);
        if(file.exists() && file.isDirectory()){
            RecursionFile(file,files);
        }
        return files;
    }
    }

