import java.util.Scanner;
public class level3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double m;
        m = Sc.nextDouble();
        for (int a = 0; a <= (m / 1); a++) {
            for (int b = 0; b <= (m / 2); b++) {
                for (int c = 0; c <= (m / 5); c++) {
                    for (int d = 0; d <= (m / 0.1); d++) {
                        for (int e = 0; e <= (m / 0.2); e++) {
                            for (int f = 0; f <= (m / 0.5); f++) {
                                if (1 * a + 2 * b + 5 * c + 0.1 * d + 0.2 * e + 0.5 * f == m) {
                                    System.out.printf("1元钱数量：%s,2元钱数量：%s，5元钱数量：%s,0.1元钱数量；%s,0.2元钱数量；%s,0.5元钱数量%s\n", a, b, c, d, e, f);

                                }
                            }

                        }

                    }

                }

            }
        }
    }
}

