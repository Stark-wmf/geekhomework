package Level3;


import java.io.*;

//Copy类实现文件和文件夹的拷贝
public class Copy {
    //copyFile方法实现文件的拷贝；
    public void copyFile(File A,File B) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(A));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(B));
        byte []buf=new byte[1024*8];//批量拷贝
        int o;//o表示buf数组的有效长度；
        while ((o=bis.read(buf,0,buf.length))!=-1){
            bos.write(buf,0,o);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
    //copyDirectory方法实现文件夹的拷贝；dir1表示源文件夹，dir2表示目标文件夹
    public void copyDirectory(String dir1,String dir2){
        File file=new File(dir2);
        file.mkdir();//创建目标文件夹
        File file3=new File(dir1);//file3表示源文件对象
        File []files=file3.listFiles();//列出源文件夹中的文件夹和文件
        if (files.length>0){
            for (File temp:files) {
                //如果仍然是文件夹则递归copyDirectory方法
                if(temp.isDirectory()){
                    String dir3=dir1+File.separator+temp.getName();//获取源文件夹下的子目录的String对象
                    String dir4=dir2+File.separator+temp.getName();//创造目标文件夹下的子目录String对象
                    //dir3，dir4作为实参递归copyDirectoy方法；
                    copyDirectory(dir3,dir4);
                }
                //如果是文件则进行拷贝；
                if(temp.isFile()){
                    File A=temp;
                    //创建copyFile方法中的实参，B是目标文件夹下的存放文件路径；
                    File B=new File(file.getAbsoluteFile()+File.separator+temp.getName());
                    try {
                        copyFile(A,B);//调用copyFile方法进行拷贝文件
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
