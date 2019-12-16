package 尚婧凯.level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class doubleColorBall {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] pm=new int[7];
        int[] rb=new int[7];

        System.out.println("请输入六次红色球号码(号码在1-33中选)");
        for(int i=0;i<6;i++){
            pm[i]=input.nextInt();
        }
        System.out.println("请输入蓝色球号码(号码在1-15中选)");
        pm[6]=input.nextInt();
        System.out.println("mp:"+Arrays.toString(pm));

        Random random=new Random();
        for(int i=0;i<6;i++){
            rb[i]=random.nextInt(33)+1;
        }
        rb[6]=random.nextInt(15)+1;
        System.out.println("rb:"+Arrays.toString(rb));
        int number=0;

        boolean boo=false;
        if(rb[6]==pm[6]){
            boo=true;
        }
        for(int i=0;i<6;i++){
            if(rb[i]==pm[i]){
                number++;
            }
        }
        switch (number){
            case 6:
                if(boo){
                    System.out.println("恭喜你hsy中了一等奖你，奖金为1亿");
                }else{
                    System.out.println("恭喜你中了二等奖你，奖金为30000000");
                }
                break;
            case 5:
                if(boo){
                    System.out.println("恭喜你中了三等奖你，奖金为3000");
                }else{
                    System.out.println("恭喜你中了四等奖你，奖金为200");
                }
                break;
            case 4:
                if(boo){
                    System.out.println("恭喜你中了四等奖你，奖金为200");
                }else{
                    System.out.println("恭喜你中了五等奖你，奖金为10");
                }
                break;
            case 3:
                if(boo){
                    System.out.println("恭喜你中了五等奖你，奖金为10");
                }else{
                    System.out.println("你一个毛也没中<*_*>");
                }
                break;
            case 2:
                if(boo){
                    System.out.println("恭喜你中了六等奖你，奖金为5");
                }else{
                    System.out.println("你一个毛也没中<*_*>");
                }
                break;
            case 1:
                if(boo){
                    System.out.println("恭喜你中了六等奖你，奖金为5");
                }else{
                    System.out.println("你一个毛也没中<*_*>");
                }
                break;
            case 0:
                if(boo){
                    System.out.println("恭喜你中了六等奖你，奖金为5");
                }else{
                    System.out.println("你一个毛也没中<*_*>");
                }
                break;

        }
    }

}
