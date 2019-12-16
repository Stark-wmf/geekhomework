package 陈瑞.level_5_2;
import java.util.HashMap;
public class Guide {
    public HashMap Guide() {
        HashMap<Integer, String> station = new HashMap<>();
        station.put(1, "老厂");
        station.put(2, "幼儿园");
        station.put(3, "文峰公社");
        station.put(4, "吉祥路口");
        station.put(5, "中研所");
        station.put(6, "邮电大学");
        station.put(7, "黄桷垭");
        station.put(8, "崇文路口");
        station.put(9, "上新街");
        station.put(10, "港口医院");
        station.put(11, "海棠溪");
        station.put(12, "海棠晓月");
        station.put(13, "福利社-小米熊儿童医院");
        station.put(14, "南坪大帝学校");
        station.put(15, "上海城嘉德中心");
        station.put(16, "长江村");
        station.put(17, "苏家坝");
        station.put(18, "菜园坝火车站");
        for (int i = 1; i <= station.size(); i++) {
            System.out.println(station.get(i));
        }
        return station;
    }

    public HashMap Num() {
        HashMap<String, Integer> num = new HashMap<>();
        num.put("老厂", 1);
        num.put("幼儿园", 2);
        num.put("文峰公社", 3);
        num.put("吉祥路口", 4);
        num.put("中研所", 5);
        num.put("邮电大学", 6);
        num.put("黄桷垭", 7);
        num.put("崇文路口", 8);
        num.put("上新街", 19);
        num.put("港口医院", 10);
        num.put("海棠路", 11);
        num.put("海棠晓月", 12);
        num.put("福利社—小米熊儿医院", 13);
        num.put("南坪大帝学校", 14);
        num.put("上海城嘉德中心", 15);
        num.put("长江村", 16);
        num.put("苏家坝", 17);
        num.put("菜园坝火车站", 18);
        return num;

    }
}

