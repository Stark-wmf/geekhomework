package 蔡宇翔.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hsy {
    private static long captial=0;
    private static List buynumber=new ArrayList();
    private  static Random rand1=new Random();
    private static long prize;

    //重写equals
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        return true;
    }

    //猜的双色球号
    public static List setBuynumber(){

        for(int ii=0;ii<7;ii++){
            int nn=rand1.nextInt(33)+1;
            int ff=nn;
            if(buynumber.contains(ff)){
                ii--;
            }
            else buynumber.add(nn);
        }

        return buynumber;
    }

    //买彩票花费
    public static void Buy(){
        captial-=2;
    }

    //奖金
    public static void Win(int w,int i) {
        switch (w) {
            case 1:
                prize = 10000;
                break;
            case 2:
                prize = 5000;
                break;
            case 3:
                prize = 2500;
                break;
            case 4:
                prize = 1250;
                break;
            case 5:
                prize = 500;
                break;
            case 6:
                prize = 250;
                break;
            case 0:
                prize = 0;
                break;
        }
        captial += prize;
        //告示天下
        if (w != 0) {
            System.out.println("热烈恭喜热烈恭喜hsy在第"+i+"天中了双色球" + w + "等奖，获得奖金" + prize + "元！");
        }}

        //返回资金
        public static void getCaptial () {
            System.out.println("hsy的资金：" + captial);
            System.out.println();
        }

    }