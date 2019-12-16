package com.company;

import java.io.*;

public class myFile {
    private File tMyFile;
    private File nMyFile;
    public myFile(String oldPath, String newPath){
        this(new File(oldPath),new File(newPath));
    }
    public myFile(File d, File s){
        this.tMyFile =d;
        this.nMyFile =s;
    }
public  void copyPath(File file) throws IOException {
        if(file.isDirectory()){
            File results[] = file.listFiles();
            for(int i=0;i<results.length;i++){
                copyPath(results[i]);
            }
        }else{
            if(file.isFile()){
                String newFile = file.getPath().replace(tMyFile.getPath()+File.separator,"");
                File newFiles = new File(this.nMyFile, newFile);
                copyFile(file,newFiles);
            }
        }
}
public void copyFile(File file,File newFile) throws IOException {
    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {
        inputStream = new FileInputStream(file);
        outputStream = new FileOutputStream(newFile);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }finally {
        inputStream.close();
        outputStream.close();
    }
}
public void copy(){
        try {
            copyPath(tMyFile);
}catch (Exception e){
            e.printStackTrace();
        }
}
}
