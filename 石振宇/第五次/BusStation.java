package 石振宇;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BusStation {
    public static void main(String[] args) {
        HashMap <Integer,String> station = new HashMap<>();
        station.put(1,"老厂");
        station.put(2,"幼儿园(招呼站)");
        station.put(3,"文峰公社");
        station.put(4,"吉祥路口");
        station.put(5,"中研所");
        station.put(6,"邮电大学");
        station.put(7,"黄桷垭");
        station.put(8,"崇文路口");
        station.put(9,"上新街");
        station.put(10,"港口医院");
        station.put(11,"海棠溪");
        station.put(12,"海棠晓月");
        station.put(13,"福利社·小米熊儿童医院");
        station.put(14,"南坪大帝学校");
        station.put(15,"上海城嘉德中心");
        station.put(16,"长江村");
        station.put(17,"苏家坝");
        station.put(18,"菜园坝火车站");
        Set <Integer> s = station.keySet();
        for (Integer i : s)
        {
            System.out.println(i + "---" + station.get(i));
        }
        Scanner sc = new Scanner(System.in);
        String start;
        String end;
        while (true){
            System.out.println("请输入上车站:");
            start = sc.nextLine();
            if (station.containsValue(start)){
                break;
            } else {
                System.out.println("站点不存在，请重新输入");
            }
        }
        while (true){
            System.out.println("请输入下车站:");
            end = sc.nextLine();
            if (station.containsValue(end)){
                break;
            }else{
                System.out.println("站点不存在，请重新输入");
            }
        }
        int istart = 0;
        int iend = 0;
        int isub;
        Set <Integer> z = station.keySet();
        for (Integer i : z){
            if (start.equals(station.get(i))){
                iend = i;
            }
        }
        if (istart > iend){
            isub = istart - iend;
        }else{
            isub = iend - istart;
        }
        int price;
        if (isub <= 3){
            price = 3;
        }
        else if (isub <= 5){
            price = 4;
        }else{
            price = 4 + (isub - 5) * 2;
        }
        price = price > 10 ? 10 : price;
        int time = isub * 2;
        System.out.println("从"+start+"到"+end+"共经过"+isub+"站收费"+price+"元，大约需要"+time+"分钟");
    }
}
