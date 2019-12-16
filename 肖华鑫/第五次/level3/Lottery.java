package com.company;

import java.util.HashSet;
import java.util.Random;

public class Lottery {
    private int n = 6;
   private int myLottery[] = new int[7];
    HashSet<Integer> hashRed = new HashSet<>();
    HashSet<Integer> hashBlue = new HashSet<>();
    Random random = new Random();
    Random random1 = new Random();
    Random random2 = new Random();
    public HashSet<Integer> lotteryRed () {
        for (int i = 1; i <= n; i++) {
            int number = random.nextInt(32) + 1;
            hashRed.add(number);
            if (!hashRed.contains(number)) {
                n++;
            }
        }
        return  hashRed;
    }
    public HashSet<Integer> lotteryBule(){
        int number = random1.nextInt(15)+1;
        hashBlue.add(number);
        return  hashBlue;
    }
    public int[] myLottery(){
        for(int i=1;i<=6;i++){
        int number = random2.nextInt(33)+1;
        for (int j=0;j<=i-1;j++) {
            if(number==myLottery[j]){
                break;
            }
            myLottery[i - 1] = number;
        }
    }
        int number = random2.nextInt(15)+1;
        myLottery[6]=number;
   return myLottery;
}
}
