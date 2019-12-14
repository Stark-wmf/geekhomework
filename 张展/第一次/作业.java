package com.company;
import java.util.Scanner;
public class main {
public static void main(String[] args) {
        double foot;
        double inch;
        double meter;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the foot:");
        foot = in.nextDouble();
        System.out.print("Please input the inch:");
        inch = in.nextDouble();
        System.out.println("The reasult is as follow");
        meter = (foot + inch / 12) * 0.3048;
        System.out.println(meter);
    }

}

