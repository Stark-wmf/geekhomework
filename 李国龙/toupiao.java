import java.util.Scanner;

public class toupiao {
    public static void main(String[] args) {
        System.out.println("请输入一到十进行投票,输入-1结束:");
        int[] numbers = new int[10];
        Scanner in = new Scanner(System.in);
        int piaohao = in.nextInt();
        while (piaohao != -1) {
            if (piaohao >= 0 && piaohao <= 9) {
                numbers[piaohao]++;
                piaohao = in.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"  有"+numbers[i]+"票");
        }
    }
}