package 蒋锐.双色球;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DoubleBall doubleBall=new DoubleBall();
        int money=0,p=0;
        Set<Integer> myredball=doubleBall.myRedBallNumb();
        int myblueball=doubleBall.myBlueBallNumb();
        for (int i=1;i<=365;i++){
            p++;
            money=money+doubleBall.judge(doubleBall.randomRedBall(i),myredball,doubleBall.randomBlueBall(),myblueball);

        }
        System.out.println("连续购买一年后的资产"+money);
    }
}
