package 李国龙.Level3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Lottery w=new Lottery();
        A a=new A(0);
        System.out.println("hsy的起始资产为0");
        Set<Integer> red=new HashSet<>();
        Set<Integer> blue=new HashSet<>();
        Set<Integer> red1=new HashSet<>();
        Set<Integer> blue1=new HashSet<>();
        w.Last(a,red, blue, red1, blue1);

    }
}
