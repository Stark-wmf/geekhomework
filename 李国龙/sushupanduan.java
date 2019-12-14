import java.util.Scanner;

public class sushupanduan {
    public static void main(String[] args) {
        System.out.println("这是一个判断素数的程序");
        System.out.println("请输入一个整数:");
        int i,a;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        if (a==1||a==2){
            System.out.println("请输入其他整数!");
        }
        for (i=2;i<=a;i++){
            if (a%i==0&&i!=a){
                System.out.println(a+"不是素数!");
                break;
            }
            else if(i==a) {
                System.out.println(a+"是素数");
            }
        }
    }
}
