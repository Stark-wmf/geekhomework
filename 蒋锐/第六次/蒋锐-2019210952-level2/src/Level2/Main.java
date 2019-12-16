package Level2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ListJava listJava=new ListJava();
        listJava.list(new File("E:" + File.separator + "蒋锐-2019210952-level2"));
        ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream(new File("E:"+File.separator+"student.txt")));
        Student student=new Student(18,"123455");
        oos.writeObject(student);
        oos.close();
    }
}
