package 李彬.zuoye3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        /*创建一个LinkedHashMap用来存储地铁站编号 以及 地铁站名称*/
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "老厂");
        map.put(2, "幼儿园(招呼站)");
        map.put(3, "文峰公社");
        map.put(4, "吉祥路口");
        map.put(5, "中研所");
        map.put(6, "邮电大学");
        map.put(7, "黄桷垭");
        map.put(8, "崇文路口");
        map.put(9, "上新街");
        map.put(10, "港口医院");
        map.put(11, "海棠溪");
        map.put(12, "海棠晓月");
        map.put(13, "福利社·小米熊儿童医院");
        map.put(14, "南福利社·小米熊儿童医院大帝学校");
        map.put(15, "上海城嘉德中心");
        map.put(16, "长江村");
        map.put(17, "苏家坝");
        map.put(18, "菜园坝火车站");

        //声明上车时的地铁站 和 下车时的地铁站
        String upStation;
        String downStation;

        Scanner sc = new Scanner(System.in);
        //声明上车时的key,下车时的key
        int beforeKey = 0, afterKey = 0;
        //无限循环判断用户输入
        // 1.如果输入不合法继续请求用户输入
        // 2.如果输入合法就记录 上车的地铁站名称 以及 上错车的地铁站编号
        // break跳出无限循环.
        for (; ; ) {
            System.out.println("请输入上车的车站:");
            upStation = sc.nextLine();
            if (map.containsValue(upStation)) {
                System.out.println("请上车!");
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(upStation)) {
                        //记录本次车站的key值
                        beforeKey = entry.getKey();

                    }
                }
                // System.out.println(beforeKey);
                break;
            }
            else {
                System.out.println(upStation + "不存在,请重新输入上车站:");
            }

        }
        //==============================================
        //当上车的地铁站输入正确,并正确记录后
        //请求用户输入
        for (; ; ) {
            System.out.println("请输入下车的车站:");
            downStation = sc.nextLine();
            if (map.containsValue(downStation)) {
                System.out.println("请上车!");
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(downStation)) {
                        //记录本次车站的key值
                        afterKey = entry.getKey();

                    }
                }
                // System.out.println(beforeKey);
                break;
            }
            else {
                System.out.println(downStation + "不存在,请重新输入下车站:");
            }

        }
        /*
         * 总行程 3站内（包含3站）收费3元，
          3站以上但不超过5站（包含5站）的收费4元，
          5站以上的，在4元的基础上，每多1站增加2元，
          10元封顶；

        * */
        int value = afterKey - beforeKey;
        int prize=0;
        int time=0;
        if (value<=3)
        {
            prize=3;

        }
        else if(value>3 &&value<=5)
        {
            prize=4;

        }
        else if (value>5 && value<=9)
        {
            prize=(value-5)*2+4;
            //如果prize计算的价格超过了10R,则将10赋值给prize
            if (prize>=10)
                prize=10;
        }
        else
            prize=10;
        System.out.printf("从%s到%s经过%d站收费%d元,大约需要%d分钟\n",upStation,downStation,value,prize,value*2);

    }
}