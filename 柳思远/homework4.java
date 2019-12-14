import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        int number = in.nextInt();
        while (number != -1) {
            if (number >= 0 && number <= 9) {
                a[number]++;
            }
            number = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+"的票数为" + a[i]);
        }
    }
}

