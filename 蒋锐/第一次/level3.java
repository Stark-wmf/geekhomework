package test3;

import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
int a=1;
int b=2;
int c=5;
Scanner input=new Scanner(System.in);
        System.out.println("请输入整数金额");
int num=input.nextInt();
for(int i=num/c;i>=0;i--){
    for(int m=(num-c*i)/b;m>=0;m--){
        int p=(num-c*i-m*b);
        System.out.println(num+"由"+i+"张五元"+m+"张两元"+p+"张一元构成");
    }
}


    }



}
