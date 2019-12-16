package com.company;

import java.util.HashSet;

public class Judge {
    int number1=0,number2=0;

    private boolean flag1,flag2;
    public void  judge(int my[], HashSet red,HashSet blue){
        for(int i=0;i<=5;i++){
           flag1 = red.contains(my[i]);
           if(flag1){
               number1++;
           }
        }
        flag2 = blue.contains(my[6]);
        if(flag2){
            number2++;
        }
    }
    public String price(){
        if(number2==1&&number1==6){
            number2=0;
            number1=0;
            return "一等奖";
        }
       else if(number1==6){
            number2=0;
            number1=0;
            return "二等奖";
        }
       else if(number1==5&&number2==1){
            number2=0;
            number1=0;
            return "三等奖";
        }
       else if(number1==5||(number1==4&&number2==1)){
            number2=0;
            number1=0;
            return "四等奖";
        }
     else if(number1==4||(number1==3&&number2==1)){
            number2=0;
            number1=0;
            return "五等奖";
        }
        else if(number2==1) {
            number2=0;
            number1=0;
            return "六等奖";
        }
        else {
            number2=0;
            number1=0;
            return "没中奖";
        }
        }

    }

