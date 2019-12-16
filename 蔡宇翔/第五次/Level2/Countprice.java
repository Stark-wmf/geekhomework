package 蔡宇翔.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static 蔡宇翔.Level2.Station.setMap;


public class Countprice {

    //输入车站名
    public static String getStation(){
        Scanner s=new Scanner(System.in);
        String station=s.next();
        List map=new ArrayList();
        map=setMap();
        boolean res;
        do{
            res=map.contains(station);
            if(res==true) break;
            System.out.println("您输入的车站："+station+"不存在，请重新输入车站：");
            station=s.next();
        }while(res!=true);
        return station;
    }

    //改写equals
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
        return true;
        return true;
    }

    //计算车站数
    public static int CountStation(String upstation,String downstation){
        int i,n;

        //上站位置
        for(i=0;i<setMap().size();i++){
            boolean res=upstation.equals(setMap().get(i));
            if(res) break;
        }

        //下站位置
        for(n=0;n<setMap().size();n++){
            boolean res=downstation.equals(setMap().get(n));
            if(res) break;

        }
        return n-i;
    }

    //计算车费
    public static int getPrice(int n){
        int price=0;
        /*if(n<=3) price=3;
        else if(n>3&&n<=5) price=4;
        else {
            price =4+(n-5)*2;
            if(price>10) price =10;
        }*/
        if (n <= 3){
            price = 3;
        }else if (n > 3 && n <= 5){
            price=4;
        }else {
            price = 4+(n-5)*2;
            if (price>10){
                price =10;
            }
        }
        return price;
    }

    //计算时间
    public static int getTime(int n){
        int time=0;
        time=n*6;
        return time;
    }
}
