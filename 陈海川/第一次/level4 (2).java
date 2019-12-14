package main4;
import java.util.Scanner;
public class level4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num=new int[10];
        int x=in.nextInt();
        while(x!=-1) {
            if(x>=0&&x<=9) {
                num[x]++;
            }
            x=in.nextInt();
        }
        for (int y=0;y<=num.length;y++) {
            System.out.println(y+"出现的次数是"+num[y]);
        }
    }
}
