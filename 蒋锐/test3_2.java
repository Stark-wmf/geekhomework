package test3_2;
import java.util.Scanner;
public class test3_2 {
    public static void main(String[] args) {
double a=0.1;
double b=0.2;
double c=0.5;
Scanner input=new Scanner(System.in);
        System.out.println("请输入金额");
        double num=input.nextDouble();
  for(int i=(int)(num/c);i>=0;i--){
      for(int m=(int)((num-i*c)/b);m>=0;m--){
          int p=(int) ((num - (i * c) - (m * b)) / a);

              System.out.println(num + "是由" + i + "张0.5元" + m + "张0.2元" + p + "张0.1元");

      }
  }
    }
}
