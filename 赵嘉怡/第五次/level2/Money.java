package 赵嘉怡.level2;

import java.util.*;

class Money {
    static void station(HashMap map) {
        int temp1 = 0, temp2=0, money=0,spot,time;
        String input1 = null,input2 = null;
        System.out.println("请输入上车站:");
        Scanner sca = new Scanner(System.in);
        String input = sca.next();
        boolean a = true;
        boolean b = true;
        while(a) {
            do {
                if (map.containsValue(input)) {
                    //调用map集合方法中的keySet，所有的键存储到Set集合中
                    //遍历集合，获取Set集合中的所有的元素(就是map的键)
                    //返回的是set集合元素，也就是map的键
                    Set keys = map.keySet();
                    for (Object temp : keys) {//调用map集合方法get
                        if (map.get(temp).equals(input)) {
                            System.out.println("上车站：" + input);
                            temp1 = (int) temp;
                            input1 = input;
                            b = false;
                        }
                    }
                } else {
                    {
                        System.out.println("您输入的上车站：" + input + "不存在，请重新输入上车站：");
                        input = sca.next();
                    }
                }

            } while (b);
            System.out.println("请输入到达站:");
            input=sca.next();
            if (map.containsValue(input)) {
                Set keys = map.keySet();
                for (Object temp : keys) {
                    if (map.get(temp).equals(input)) {
                        System.out.println("到达站：" + input);
                        temp2 = (int) temp;
                        input2 = input;
                        b = false;
                    }
                }
            } else {
                {
                    System.out.println("您输入的到达站：" + input + "不存在，请重新输入到达站：");
                    input = sca.next();
                }
            }
            a=false;
        }
        spot=temp2-temp1;
        spot=Math.abs(spot);
        time=spot*6;
        if(0<=spot&&spot<=3){
            money=3;
            System.out.println("从"+input1+"到"+input2+"共经过"+spot+"站，收费"+money+"元，大约需要"+time+"分钟");
        }else if(3<spot&&spot<=5){
            money=4;
            System.out.println("从"+input1+"到"+input2+"共经过"+spot+"站，收费"+money+"元，大约需要"+time+"分钟");
        }else if(5<spot&&spot<=8){
            for(int i=4;i<=spot;i+=2){
                money=i;
            }
            System.out.println("从"+input1+"到"+input2+"共经过"+spot+"站，收费"+money+"元，大约需要"+time+"分钟");
        }else {
            money=10;
            System.out.println("从"+input1+"到"+input2+"共经过"+spot+"站，收费"+money+"元，大约需要"+time+"分钟");
        }
    }
}

