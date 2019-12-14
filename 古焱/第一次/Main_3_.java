package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] c=new int[10][10];
        for (int i = 1; i <c.length; ++i) {
            c[i] =new int[11-i];
            for (int j =1; j<c[i].length; j++)
            {
                c[i][j] = (i) * (10-j);
                if (c[i][j]<10)
                {
                    System.out.print((i) + "*" + (10 - j) + "= " + c[i][j] + "\t");
                }
                else
                    {
                    System.out.print((i) + "*" + (10 - j) + "=" + c[i][j] + "\t");
                    }
            }
            System.out.println();
        }
    }
}


