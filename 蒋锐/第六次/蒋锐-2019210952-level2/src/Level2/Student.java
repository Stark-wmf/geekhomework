package Level2;

import javax.swing.text.html.parser.TagElement;
import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private String numb;
    public Student(int age,String numb){
        this.age= age;
        this.numb=numb;
    }
}
