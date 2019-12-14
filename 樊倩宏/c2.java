import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a=scanner.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("a="+a);
                break;
            }else{
                System.out.println("不是素数");
                break;

            }
        }
    }
}
