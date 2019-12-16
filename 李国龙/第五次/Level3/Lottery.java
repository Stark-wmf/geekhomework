package 李国龙.Level3;

import java.util.Random;
import java.util.Set;

class A{
    public double money;

    public A(double money) {
        this.money = money;
    }
}

public class Lottery {

    public void SET(Set<Integer> red,Set<Integer> blue){
        Random t=new Random();
       while (red.size()<=5){
           red.add(t.nextInt(33)+1);
       }
        blue.add(t.nextInt(15)+1);
    }
    public String Judge(A a, Set<Integer> red, Set<Integer> blue, Set<Integer> red1, Set<Integer> blue1){
        if ((red.equals(red1))&&(blue.equals(blue1))){

            return "恭喜获得一等奖";
        }
        else if (red.equals(red1)&&!blue.equals(blue1)){

            return "恭喜获得二等奖";
        }
        red1.retainAll(red);
        if (red1.size()==5&&blue.equals(blue1)){

            return "恭喜获得三等奖";
        }
        else if (red1.size()==5||red1.size()==4&&blue.equals(blue1)){

            return "恭喜获得四等奖";
        }
        else if (red1.size()==4||red1.size()==3&&blue.equals(blue1)){

            return "恭喜获得五等奖";
        }
        else if (blue.equals(blue1)){

            return "恭喜获得六等奖";
        }
       return "";
    }

    public void move(Set<Integer> red,Set<Integer> blue,Set<Integer> red1,Set<Integer> blue1){
        red.clear();
        red1.clear();
        blue.clear();
        blue1.clear();
    }
    public void ChangeMoney(A a, String q){

            switch (q){
                case "恭喜获得一等奖":a.money+=5000000;
                break;
                case "恭喜获得二等奖":a.money+=500000;
                break;
                case "恭喜获得三等奖":a.money+=3000;
                break;
                case "恭喜获得四等奖":a.money+=200;
                break;
                case "恭喜获得五等奖":a.money+=10;
                break;
                case "恭喜获得六等奖":a.money+=5;
                break;
            }
    }
    public void Last(A a, Set<Integer> red, Set<Integer> blue, Set<Integer> red1, Set<Integer> blue1){
        Lottery w=new Lottery();
        for (int i=0;i<365;i++) {
            w.SET(red,blue);
            w.SET(red1,blue1);
            a.money-=2;
            if (!w.Judge(a,red,blue,red1,blue1).equals("")) {
                System.out.println("第"+(i+1)+"天:");
                w.ChangeMoney(a,w.Judge(a,red, blue, red1, blue1));
                System.out.println(w.Judge(a,red, blue, red1, blue1));
                System.out.println("总资产还剩:"+a.money);
            }
            w.move(red,blue,red1,blue1);
        }
    }


    }

