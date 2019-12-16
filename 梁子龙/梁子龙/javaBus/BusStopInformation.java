package javaBus;
import java.util.*;
import java.lang.String;

public class BusStopInformation {

    public Map<Integer,String> busStop;
    public BusStopInformation(){
        busStop=new HashMap<Integer, String>();
    }
    /**
     * 将信息装入busStop中
     */
    public void stopAdd(){
        busStop.put(1,"老厂");
        busStop.put(2,"幼儿园(招呼站)");
        busStop.put(3,"文峰公社");
        busStop.put(4,"吉祥路口");
        busStop.put(5,"中研所");
        busStop.put(6,"邮电大学");
        busStop.put(7,"黄桷垭");
        busStop.put(8,"崇文路口");
        busStop.put(9,"上新街");
        busStop.put(10,"港口医院");
        busStop.put(11,"海棠溪");
        busStop.put(12,"海棠晓月");
        busStop.put(13,"福利社·小米熊儿童医院");
        busStop.put(14,"南坪大帝学校");
        busStop.put(15,"上海城嘉德中心");
        busStop.put(16,"长江村");
        busStop.put(17,"苏家坝");
        busStop.put(18,"菜园坝火车站");
    }
    /**
     * 遍历
     */
    public void wherever(){
        Set<Integer>KeySet=busStop.keySet();
        System.out.println("-----有以下公交站-----");
        for (Integer bus:KeySet){
            String busIn=busStop.get(bus);
            System.out.println(bus+"."+busIn);
        }
    }
    /**
     * 计算票价
     */
    public void price() {
        Scanner col = new Scanner(System.in);
        int sta = 0;//为什么一定要赋初值
        System.out.println("请输入初始站站名：");
        String start = col.next();
        while (!(busStop.containsValue(start))) {
            System.out.println("未找到匹配项，请重新输入：");
            start = col.next();
        }
        for (Map.Entry<Integer, String> mapStop : busStop.entrySet()) {
            if (start.equals(mapStop.getValue())) {
                sta = mapStop.getKey();
                System.out.println("找到了匹配项，请输入终点站站名：");
                break;
            }
        }
        int end = 0;
        String end1 = col.next();
        while (!(busStop.containsValue(end1))) {
            System.out.println("未找到匹配项，请重新输入：");
            end1 = col.next();
        }
        for (Map.Entry<Integer, String> mapStop : busStop.entrySet()) {
            if (end1.equals(mapStop.getValue())) {
                end = mapStop.getKey();
                break;
            }
        }//从邮电大学到南坪大帝学校共经过8站收费10元，大约需要 48分钟
        int result = end - sta;
        int minute = result * 6;
        if (result <= 3) {
            System.out.println("从"+start+"到"+end1+"一共经历了"+result+"站,收费3元,大约需要"+minute+"分钟");
        }
        if (result >= 3 && result <= 5) {
            System.out.println("从"+start+"到"+end1+"一共经历了"+result+"站,收费4元,大约需要"+minute+"分钟");
        }
        if (result > 5) {
            int conlude = 4 + (end - 5) * 2;
            if (result >= 10) {
                System.out.println("从"+start+"到"+end1+"一共经历了"+result+"站,收费10元,大约需要"+minute+"分钟");
            } else {
                System.out.println("从"+start+"到"+end1+"一共经历了"+result+"站,收费"+conlude+"元大约需要"+minute+"分钟");
            }
        }

    }
}
