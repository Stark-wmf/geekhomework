package 蔡宇翔.Level2;


import static 蔡宇翔.Level2.Countprice.*;
import static 蔡宇翔.Level2.Station.getMap;

public class Main2 {
    public static void main(String[] args) {
        String upstation,downstastion;
        int n=0;
        System.out.println("车站列表如下：");
        getMap();

        System.out.println("\n请输入上车站：");
        upstation=getStation();

        System.out.println("请输入下车站：");
        downstastion=getStation();

        n=CountStation(upstation,downstastion);
        System.out.println("从"+upstation+"到"+downstastion+"共经过"+n+"站收费"+getPrice(n)+"元，大约需要 "+getTime(n)+"分钟");

    }
}
