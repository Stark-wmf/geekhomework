package Dem;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("是否是素数：" + isPrime(number));
        scanner.close();
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
