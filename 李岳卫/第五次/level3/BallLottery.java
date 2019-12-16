package 李岳卫.level3;

import java.util.HashSet;
import java.util.Random;

public class BallLottery {
    private HashSet<Integer> rednumberarray ;
    private int money;
    private Random random ;
    private int bluenumber;
    private Integer guessnumber[];
    private int guessbluenumber;

    public BallLottery(){
        money = 0;
        bluenumber = 0;
        guessbluenumber = 0;
        random = new Random();
        rednumberarray = new HashSet<Integer>();
        guessnumber = new Integer[]{0, 0, 0, 0, 0, 0};
    }
    public void rules(){
        System.out.println("--------------------------------------------<规则>------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("                  一等奖：投注号码与当期开奖号码全部相同（顺序不限)--（一百万元）");
        System.out.println("                 二等奖：投注号码与当期开奖号码中的6个红色球号码相同--（五十万元）");
        System.out.println("         三等奖：投注号码与当期开奖号码中的任意5个红色球号码和1个蓝色球号码相同--（二十万元） ");
        System.out.println("四等奖：投注号码与当期开奖号码中的任意5个红色球号码相同，或与任意4个红色球号码和1个蓝色球号码相同--（十万元）");
        System.out.println("五等奖：投注号码与当期开奖号码中的任意4个红色球号码相同，或与任意3个红色球号码和1个蓝色球号码相同--（一万元）");
        System.out.println("                      六等奖：投注号码与当期开奖号码中的1个蓝色球号码相同（十元）");
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    public void choosenumber(){
        HashSet<Integer> guessnum = new HashSet<Integer>();
        while (guessnum.size()<6)
            guessnum.add(random.nextInt(33)+1);
        guessnum.toArray(guessnumber);
        guessbluenumber = random.nextInt(15)+1;
        money -= 2;
    }
    public void producenumber(){
       while (rednumberarray.size()<6)
            rednumberarray.add(random.nextInt(33)+1);
       bluenumber = random.nextInt(15)+1;
    }
    public void drawlottery(){
        int redcount = 0,bluecount = 0;
        if(bluenumber == guessbluenumber)
            bluecount = 1;
        for (int x = 0;x<guessnumber.length;x++){
            if (rednumberarray.contains(guessnumber[x])){
                redcount++;
            }
        }
        int count = redcount + bluecount;
        if(count == 7){
            System.out.println("hsy中了一等奖！！！！！");
            money = money + 1000000;
        }
        else if (redcount == 6){
            System.out.println("hsy中了二等奖！！！！！");
            money = money + 500000;
        }
        else if (count ==6){
            System.out.println("hsy中了三等奖！！！！！");
            money = money + 200000;
        }
        else if (count == 5){
            System.out.println("hsy中了四等奖！！！！！");
            money = money + 100000;
        }
        else if(count == 4){
            System.out.println("hsy中了五等奖！！！！！");
            money = money + 10000;
        }
        else if (redcount == 1){
            System.out.println("hsy中了六等奖！！！！！");
            money = money+10;
        }
    }

    public int getMoney() {
        return money;
    }
}
