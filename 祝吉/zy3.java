import java.util.Scanner;

public class zy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int m,n,p;
        for (p = 0;p <= a/5; p++) {
            for (n = 0; n <= (a-5*p)/2; n++) {
                for (m = 0; m <= a; m++) {
                    m = a - p * 5 - n * 2;
                    System.out.println("五元："+p+ "   二元："+n    + "   一元："+m);
                    break;
                }
            }
        }
    }
}