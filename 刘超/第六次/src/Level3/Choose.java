package Level3;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
        List<Integer>list = new ArrayList<>();
        System.out.println("在1到33之间选择红色球号码，号码不可重复选择.");
        for (int i = 1; i <=6 ; i++) {
            System.out.println("请输入hsy想购买的第"+i+"个红色球的号码：");
            int useredball = input.nextInt();
                Ball.userad.add(useredball);
                    list.add(useredball);
        }
        System.out.println("请输入hsy想购买的蓝色球号码，在1到15之间选择");
        Ball.useblue = input.nextInt();

        Ball.kai();

        Ball.money-=2;//每注两元
        Ball.userad.retainAll(Ball.redball);
        int num = Ball.userad.size();
        int bnum = 0;

        if (Ball.blutball == Ball.useblue){
            bnum++;
        }
        if (num == 6 && bnum == 1){
            System.out.println("恭喜hsy中了一等大奖！！！");
            Ball.Yumoney = Ball.money+100000000;
        }else if (num ==6 && bnum == 0){
            System.out.println("恭喜hsy中了二等奖！！！");
            Ball.Yumoney = Ball.money+1000000;
        }else if (num == 5 && bnum == 1){
            System.out.println("恭喜hsy中了三等奖！！！");
            Ball.Yumoney = Ball.money+100000;
        }else if ((num == 5 && bnum == 0)||(num == 4 && bnum == 1)){
            System.out.println("恭喜hsy中了四等奖！！！");
            Ball.Yumoney = Ball.money+=10000;
        }else if ((num == 4 && bnum == 0)||(num == 3 && bnum == 1)){
            System.out.println("恭喜hsy中了五等奖！！！");
            Ball.Yumoney = Ball.money+1000;
        }else if (num < 3 && bnum == 1){
            System.out.println("恭喜hsy中了六等奖！！！");
            Ball.Yumoney = Ball.money+100;
        }else {
            System.out.println("很遗憾hsy你运气不太好，没有中奖。");
        }
        }
        System.out.println(Ball.Yumoney);
}
}
