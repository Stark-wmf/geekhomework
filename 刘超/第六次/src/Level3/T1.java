package Level3;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String s = input.next();
        T2  T = new T2();
        T.Bigwriting(s);
        T.Smallwriting(s);
        T.Number(s);
        T.Else(s);

    }
}
