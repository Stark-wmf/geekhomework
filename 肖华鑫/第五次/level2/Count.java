package com.company;

public class Count {
    private int price,length;
public int priceCount(int a,int b){
     length=Math.abs(a-b);
     if(length<=3){
         price=3;
     }
     else if(length<=5){
         price=4;
     }
     else if(length<=11){
         price=4-(length-5);
     }
     else
         price=10;
     return price;
}
public int timeCount(int a,int b){
    return length*6;
}
}
