package javaWinPrize;

public class MainTest extends Ball {
    public static void main(String[] args) {
        Ball x = new Ball();

        for (int i = 1; i <=365; i++) {
            System.out.println("-----第" +i+ "天抽奖-----");
            x.listAdd();
            x.presonListAdd();
            x.winPrize();
            x.redList.clear();
            x.blueList.clear();
        }
    }
}