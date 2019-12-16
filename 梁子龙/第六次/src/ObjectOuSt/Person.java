package ObjectOuSt;

import java.io.Serializable;

public class Person /*implements Serializable*/ {
   private String name;
    public Person(){
        System.out.println("我执行了！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Person(String name) {
        this.name = name;
    }

    public void talk(){
        System.out.println("人有说话的能力！");
    }
}
