package 赵嘉怡.level2;

import java.util.HashMap;
import java.util.Map;

public class Guide {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"老厂");
        map.put(2,"幼儿园（招呼站）");
        map.put(3,"文峰公社");
        map.put(4,"吉祥路口");
        map.put(5,"中研所");
        map.put(6,"邮电大学");
        map.put(7,"黄桷垭");
        map.put(8,"崇文路口");
        map.put(9,"上新街");
        map.put(10,"港口医院");
        map.put(11,"海棠溪");
        map.put(12,"海滩晓月");
        map.put(13,"福利社·小米熊儿童医院");
        map.put(14,"南坪大帝学校");
        map.put(15,"上海城嘉德中心");
        map.put(16,"长江村");
        map.put(17,"苏家坝");
        map.put(18,"菜园坝火车站");

        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("第"+entry.getKey()+"站："+entry.getValue());
        }
        Money.station((HashMap) map);
    }
}
