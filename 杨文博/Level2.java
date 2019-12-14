import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner scanner = new Scanner(System.in);{
        System.out.print("请输入需判断的数据n：");
            n = scanner.nextInt();
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print("不是素数");
                } else {
                    System.out.print(n);
                }
                break;
            }
        }
    }
}
