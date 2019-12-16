package Level2;

import java.io.*;

public class ObjectSer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File a=new File("a.txt");
        if (!a.exists()) a.createNewFile();
        Student lgl=new Student("李国龙",18,"2019210878",new Address("Cqupt"));
        ObjectOutputStream l=new ObjectOutputStream(new FileOutputStream(a));
        ObjectInputStream p=new ObjectInputStream(new FileInputStream(a));
        l.writeObject(lgl);
        l.close();
        Student o=(Student) p.readObject();
        System.out.println(o);
        p.close();
    }

}
