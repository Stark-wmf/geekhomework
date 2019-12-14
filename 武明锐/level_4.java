import java.util.Scanner;
public class level_4 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
       int i=1;//数组长度  (下标问题)
        int i1=0;//1
        int i2=0;//2
        int i3=0;//3
        int i4=0;//4
        int i5=0;//5
        int i6=0;//6
        int i7=0;//7
        int i8=0;//8
        int i9=0;//9
            while (i>=0){
                System.out.println("请输入1——9之间任意整数,输入-1结束");
                 int socre=input.nextInt();
                 i++;

            if (socre==1){
              i1++;
          }
          if (socre==2){
              i2++;
            }
            if (socre == 3) {
            i3++;}
            if (socre==4){
                i4++;
            }
            if (socre==5){
                i5++;
            }
            if (socre==6){
                i6++;
            }
            if (socre==7){
                i7++;
            }
            if (socre==8){
                i8++;
            }
            if (socre==9){
                i9++;
            }
            if (socre==-1){
                break;
            }
            }

        System.out.println("1出现了"+i1+"次");
        System.out.println("2出现了"+i2+"次");
        System.out.println("3出现了"+i3+"次");
        System.out.println("4出现了"+i4+"次");
        System.out.println("5出现了"+i5+"次");
        System.out.println("6出现了"+i6+"次");
        System.out.println("7出现了"+i7+"次");
        System.out.println("8出现了"+i8+"次");
        System.out.println("9出现了"+i9+"次");
    }

}



