package ObjectOuSt;

import java.io.*;

public class ObjectSeria {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
   File file1 = new File("Deom");
      if (!file1.exists())
      file1.mkdirs();
        String file = "Deom/objectSeria1";
       //ObjectSeria.Out(file);
        ObjectSeria.Inp(file);
    }

    /**
     * 序列化
     */
        public static void Out(String file) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
        Student stu=new Student("01","xiaoming",01);
            System.out.println("我是"+stu);
        oos.writeObject(stu);
        oos.flush();//习惯
        oos.close();}
        /**
         * 反序列化
         */
    public static void Inp(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
        Student stu =(Student)ois.readObject();
        System.out.println("我是"+stu);
        ois.close();}
    }

