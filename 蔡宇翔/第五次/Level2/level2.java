package 第五次作业;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//最新的
public class level2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "老厂");
        map.put(2, "幼儿园（招呼站）");
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
        map.put(13, "福利社.小米熊儿童医院");
        map.out(14,"南坪大帝学校");
        map.out(15,"上海城嘉德中心");
        map.out(16,"长江村");
        map.out(17,"苏家坝");
        map.out(18,"菜园坝火车站");
        System.out.println("遍历车站");

        String up;
        String down;
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+"   value="+entry.getValue());
        }

        Scanner a = new Scanner(System.in);
        int beforeKey = 0, afterKey = 0;
        for (; ; ) {
            System.out.println("请输入上车的车站:");
            up = a.nextLine();
            if (map.containsValue(up)) {
                System.out.println("上车");
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(up)) {
                        beforeKey = entry.getKey();

                    }
                }
                break;
            }
            else {
                System.out.println(up + "不存在,请重新输入上车站:");
            }

        }
        for (; ; ) {
            System.out.println("请输入下车的车站:");
            down = a.nextLine();
            if (map.containsValue(down)) {
                System.out.println("上车");
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(down)) {
                        afterKey = entry.getKey();

                    }
                }
                break;
            }
            else {
                System.out.println(down + "不存在,请重新输入下车站:");
            }

        }

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
            if (prize>=10)
                prize=10;
        }
        else
            prize=10;
        System.out.printf("从%s到%s经过%d站收费%d元,大约需要%d分钟\n",upStation,downStation,value,prize,value*2);

    }
}