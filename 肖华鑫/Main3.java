package com.company;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
	System.out.println("请输入有多少元");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	for(int a=0;a<=num1;a+=5){
	    for(int i=0;i<=(num1-a);i+=2){
	        int b=(num1-a-i);
	            System.out.println("需要"+(a/5)+"张5元"+(i/2)+"张2元"+b+"张1元");

        }

        }
    }
}
