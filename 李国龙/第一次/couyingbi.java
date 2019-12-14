import java.util.Scanner;

public class couyingbi {
    public static void main(String[] args) {
        System.out.println("请输入面值:");
        Scanner in = new Scanner(System.in);
        int shuru = in.nextInt();
        for (int yi = 0; yi <= shuru; yi++) {
            for (int er = 0; er <= shuru / 2; er++) {
                for (int wu = 0; wu <= shuru / 5; wu++) {
                    if (1 * yi + 2 * er + 5 * wu == shuru)
                        System.out.println(shuru + "元可由" + yi + "张一元" + er + "张二元" + wu + "张五元凑成");
                }
            }
        }

    }
}
