package 石振宇;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dcball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Rb = new int[7];//系统随机生成
        int[] rb = new int[7];//用户输入
        int totalmoney = 0;
        int price = 2;
        int redCount = 0;
        int bluecount = 0;
        System.out.println("请输入6个红色球号码（号码在1~33中选）");
        for (int j = 0; j < 6; j++) {
            rb[j] = scanner.nextInt();
        }
        System.out.println("请输入蓝色球号码（号码在1~15中选）");
        rb[6] = scanner.nextInt();
        for (int i = 1; i <= 365; i++) {
            Random random = new Random();
            for (int j = 0; j < 6; j++) {
                Rb[j] = random.nextInt(33);
            }
            Rb[6] = random.nextInt(15) + 1;
            for (int x = 0; x < Rb.length - 1; x++) {
                for (int y = 0; y < rb.length - 1; y++) {
                    if (Rb[x] == rb[y]) {
                        redCount++;
                    }
                }
            }
            if (rb[6] == Rb[6]) {
                bluecount++;
            }
            if (redCount == 6 && bluecount == 1) {
                System.out.println("第"+i+"天"+"中了一等奖，奖金100万");
                totalmoney += 1000000;
            } else if (redCount == 6 && bluecount == 0) {
                System.out.println("第"+i+"天"+"中了二等奖，奖金50万");
                totalmoney += 500000;
            } else if (redCount == 5 && bluecount == 1) {
                System.out.println("第"+i+"天"+"中了三等奖，奖金3000元");
                totalmoney += 3000;
            } else if (redCount == 5 || redCount == 4 && bluecount == 1) {
                System.out.println("第"+i+"天"+"中了四等奖，奖金200元");
                totalmoney += 200;
            } else if (redCount == 4 || redCount == 3 && bluecount == 1) {
                System.out.println("第"+i+"天"+"中了五等奖，奖金10元");
                totalmoney += 10;
            } else if (bluecount == 1) {
                System.out.println("第"+i+"天"+"中了六等奖，奖金5元");
                totalmoney += 5;
            }
        }
        totalmoney = totalmoney - price * 365;
        System.out.println("连续买一年后，hsy的资产为"+totalmoney+"元");
    }
}