package 李国龙.Level2;

import java.util.Map;
import java.util.Scanner;

public class Station {
    public void Setnum(Map<Integer,String> k){
        k.put(1,"老厂");
        k.put(2,"幼儿园");
        k.put(3,"文峰公社");
        k.put(4,"吉祥路口");
        k.put(5,"中研院");
        k.put(6,"邮电大学");
        k.put(7,"黄桷垭");
        k.put(8,"崇文路口");
        k.put(9,"上新街");
        k.put(10,"港口医院");
        k.put(11,"海棠溪");
        k.put(12,"海棠晓月");
        k.put(13,"福利社·小米熊儿童医院");
        k.put(14,"南坪大帝学校");
        k.put(15,"上海城嘉德中心");
        k.put(16,"长江村");
        k.put(17,"苏家坝");
        k.put(18,"菜园坝火车站");
    }
    public void Output(Map<Integer,String> k){
        for (Map.Entry y:k.entrySet()
             ) {
            System.out.println("第"+y.getKey()+"站"+":"+y.getValue());
        }
    }
    public void GetStation(Map<Integer,String> k,StringBuffer num1,StringBuffer num2){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入上车站:");
        num1 = new StringBuffer(in.nextLine());
        //num1.append(in.nextLine());
        while (!k.containsValue(new String(num1))){
            System.out.println("您输入的上车站:"+num1+"不存在,请重新输入上车站:");
            num1 = new StringBuffer(in.nextLine());
            //num1.append(in.nextLine());
        }
        num1.append(num1);
        System.out.println("请输入到达站:");
        num2.append(in.nextLine());
        while (!k.containsValue(new String(num2))){
            System.out.println("您输入的到达站:"+num2+"不存在,请重新输入到达站:");
            num2.append(in.nextLine());
        }
    }
    public void Last(Map<Integer,String> k,StringBuffer num1,StringBuffer num2){
        int key1=0,key2=0,Cha,Time;
        for (Map.Entry<Integer,String> y:k.entrySet()
             ) {
            if (y.getValue().equals(new String(num1))){
                key1=y.getKey();
            }
            else if (y.getValue().equals(new String(num2))) {
                key2 = y.getKey();
            }
        }
        Cha=key2-key1;
        Time=6*Cha;
        System.out.println("从"+num1+"到"+num2+"共经过"+Cha+"站,收费"+Money(Cha)+"元,大约需要"+Time+"分钟");
    }
    public int Money(int n){
        int money=0;
        if (n<=3){
            money=3;
        }
        else if (n>3&&n<=5){
            money=4;
        }
        else if (n>5){
            money=4+(n-5)*2;
        }
        if (money<=10)
        return money;
        else return 10;
        }
}
