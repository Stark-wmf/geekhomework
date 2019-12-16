package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String getOn;
        boolean flag;
       int up,down;
	    LinkedHashMap<String,Integer> busstop=new LinkedHashMap<>();
        busstop.put("老厂",1);
        busstop.put("幼儿园",2);
        busstop.put("文峰公社",3);
        busstop.put("吉祥路口",4);
        busstop.put("中研所",5);
        busstop.put("邮电大学",6);
        busstop.put("黄桷垭",7);
        busstop.put("崇文路口",8);
        busstop.put("上新街",9);
        busstop.put("港口医院",10);
        busstop.put("海棠溪",11);
        busstop.put("海棠晓月",12);
        busstop.put("福利社·小米熊儿童医院",13);
        busstop.put("南坪大帝学校",14);
        busstop.put("上海城嘉德中心",15);
        busstop.put("长江村",16);
        busstop.put("苏家坝",17);
        busstop.put("菜园坝火车站",18);
       busstop.forEach((String,Integer)-> System.out.println("第"+Integer+"站："+String));
        JuageExsit juageExsit = new JuageExsit();
        Count count=new Count();
        up = (int)juageExsit.judageUp(busstop);
      down = (int)juageExsit.judageDowm(busstop);
      juageExsit.tell();
        System.out.println("一共需要"+count.priceCount(up, down)+"元"+count.timeCount(up,down)+"分钟");

    }
}
