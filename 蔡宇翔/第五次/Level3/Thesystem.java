package 蔡宇翔.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thesystem {
    private static List systemnumber=new ArrayList();
    private static Random rand=new Random();


    //重写equals
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        return true;
    }


    //建立双色球系统
    public static List setSystem(){
        //六个红球的号码
        for(int i=0;i<6;i++){
            int n=rand.nextInt(33)+1;
            int f=n;
            if(systemnumber.contains(f)){
                i--;
            }
            else systemnumber.add(n);
        }
        //一个蓝球的号码
        systemnumber.add(rand.nextInt(15)+1);
        System.out.println(systemnumber.get(6));

        return systemnumber;
    }


    //是否中奖及中几等奖
    public static int WinOrNot(List a,List b){
        int w,red=0,blue=0;

        //判断红球相等的个数
        for(int i=0;i<a.size()-1;i++){
            for(int n=0;n<a.size();n++){
                if(a.get(i).equals(b.get(n))){
                   red++;
                }
            }
        }

        //判断蓝球相等的个数

        if(a.get(6).equals(b.get(6))) blue=1;


        //中奖情况
        if(red==6&&blue==1) return w=1;
        else if(red==6&&blue==0) return w=2;
        else if(red==5&&blue==1) return w=3;
        else if(red==5&&blue==0) return w=4;
        else if(red==4&&blue==1) return w=4;
        else if(red==4&&blue==0) return w=5;
        else if(red==3&&blue==1) return w=5;
        else if(red<3&&blue==1) return w=6;
        else return w=0;
    }

}
