import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高");
        double inch = scanner.nextDouble();
        System.out.println(inch + "米=" + inch * 3.2804 + "英尺");
        scanner.close();
    }
}





