package com.company;
import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        int Array [] =new int[10];
        int num2,num3;
	do {
        System.out.println("请输入一个数字");
        Scanner num1 = new Scanner(System.in);
        num2 = num1.nextInt();
        if(num2<=9&&num2>=0){
        Array[num2]++;
        }
        else if(num2==-1){
            System.out.println("投票结束！");
        }
        else{
            System.out.println("您输入了一个错误的数字");
        }
    }while(num2!=-1);
	for(int i=0;i<=9;i++){
	    System.out.println(i+"出现的次数为"+Array[i]);
    }

    }
}


