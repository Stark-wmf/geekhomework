package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int monney=0;
    Lottery lottery=new Lottery();
    Judge judge = new Judge();
    for(int i=1;i<=365;i++) {
        HashSet red = lottery.lotteryRed();
        HashSet blue = lottery.lotteryBule();
        int my[] = lottery.myLottery();
        judge.judge(my, red, blue);
        System.out.println(judge.price());
        monney=monney-2;
        red.clear();
        blue.clear();
    }
        System.out.println("资产为"+monney);
        System.out.println(lottery.lotteryRed());
    }

}
