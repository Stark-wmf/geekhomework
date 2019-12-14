package level3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        System.out.println("请输入金额：");
        Scanner scanner = new Scanner(System.in);
        int PRICE = scanner.nextInt();
        int num = 0;
        int x,y,z;
        for (x = 0;x<=PRICE;++x)
            for (y = 0;y<=PRICE/2;++y)
                for (z = 0;z<=PRICE/5;++z){
                    if (PRICE==x+2*y+5*z){
                        System.out.println(PRICE+"元由"+x+"个一元"+y+"个二元"+z+"个五元组成");
                        ++num;
                    }
                }
        System.out.println("一共有"+num+"方法");
    }
}
