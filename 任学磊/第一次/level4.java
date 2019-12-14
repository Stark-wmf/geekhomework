package WERR;

import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        Scanner ins=new Scanner(System.in);
        int [] num=new int[10];
        int x;
        x=ins.nextInt();
        while(x != -1){
            if(x >=0 && x<=9 ){
                num[x]++;
            }
            x=ins.nextInt();
        }
        for(int i=0;i<num.length;i++){

            System.out.println(x+"出现了"+num[x]+"次");
        }

    }
}


