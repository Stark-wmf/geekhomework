package 李岳卫.level3;

public class Main {
    public static void main(String[] args) {
        final int datetime = 365;
        BallLottery ballLottery = new BallLottery();
        ballLottery.rules();
        for(int x = 0;x<datetime;x++){
        ballLottery.choosenumber();
        ballLottery.producenumber();
        ballLottery.drawlottery();
        }
        ballLottery.rules();
        System.out.println(datetime+"天后hsy有"+ballLottery.getMoney()+"元");
    }
}
