package com.geek;

import java.util.Scanner;

public class lv4 {
    private static Scanner in;
    public static void main(String[] args) {
        in =new Scanner(System.in);
        int x;
        int[] number=new int[10];
        x =in.nextInt();
        while(x!=-1){
            if(x>=0&&x<=9){
                number[x]++;
            }
            x=in.nextInt();
        }
        for(int i=0;i<number.length;i++){
            System.out.println(i+":"+number[i]);
        }


    }
}
