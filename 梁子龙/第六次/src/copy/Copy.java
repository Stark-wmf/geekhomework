package copy;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Copy {
    /**
     * 实现文本文件的批量copy的操作
     */
//    public static void copyFile(File srcFile,File destFile)throws IOException{
//        if(!srcFile.exists()){
//            throw new IllegalArgumentException("文件"+srcFile+"不存在");
//        }
//        if(!srcFile.isFile()){
//            throw new IllegalArgumentException(srcFile+"不是文件");
//        }
//        FileInputStream in=new FileInputStream(srcFile);
//        FileOutputStream out=new FileOutputStream(destFile);
//        byte[] buf =new byte[8*1024];
//        int b;
//        while((b=in.read(buf,0,buf.length))!=-1){
//            out.write(buf,0,b);
//            out.flush();//一般为缓冲流时才写这个，但写在这儿没影响，而且写这个是一个好习惯
//        }
//        in.close();
//        out.close();
//    }
    /**
     * 用带缓冲的字节流copy文本文件---最常用最方便
     */
    public static void copyFileByBuffer(File srcFile,File destFile)throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件"+srcFile+"不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        int c;
        byte[] buf=new byte[8*1024];
        while ((c=bis.read(buf,0,buf.length))!=-1){
            bos.write(buf,0,buf.length);
            bos.flush();//刷新缓冲区
        }
        bis.close();
        bos.close();
    }
    /**
     *单字节不带缓冲copy文本文件
     */
//    public static void copyFileByByte(File srcFile,File destFile)throws IOException{
//        if(!srcFile.exists()){
//            throw new IllegalArgumentException("文件"+srcFile+"不存在");
//        }
//        if(!srcFile.isFile()){
//            throw new IllegalArgumentException(srcFile+"不是文件");
//        }
//        FileInputStream in =new FileInputStream(srcFile);
//        FileOutputStream out=new FileOutputStream(destFile);
//        int c;
//        while ((c=in.read())!=-1){
//            out.write(c);
//            out.flush();
//        }
//        in.close();
//        out.close();
//    }
    /**
     * 复制文件夹
     */
    public static void copy(File srcFile,File destFile)throws IOException{
        File fileSrc=new File(srcFile.getPath());
        File[] files=fileSrc.listFiles();
        File fileDes=new File(destFile.getPath());
        if(!fileDes.exists()){
            fileDes.mkdirs();
        }
        for(File f:files){
            if(f.isFile()){
                copyFileByBuffer(f,new File(destFile.getPath()+"\\"+f.getName()));
            }else if(f.isDirectory()){
                copy(f,new File(destFile.getPath()+"\\"+f.getName()));
            }
        }
    }

//    public static void main(String[] args) throws IOException {
//        copy(new File("G:\\1"),new File("G:\\6"));
//        System.out.println("成功了");
//    }
    }

