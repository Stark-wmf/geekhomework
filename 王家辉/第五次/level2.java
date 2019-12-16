package 王家辉;

import java.util.*;

public class level2 {
    public static void main(String[] args) {
        HashMap<Integer, String> site = new HashMap<>();
        site.put(1, "老厂");
        site.put(2, "幼儿园（招呼站）");
        site.put(3, "文峰公社");
        site.put(4, "吉祥路口");
        site.put(5, "中研所");
        site.put(6, "邮电大学");
        site.put(7, "黄桷垭");
        site.put(8, "崇文路口");
        site.put(9, "上新街");
        site.put(10, "港口医院");
        site.put(11, "海棠溪");
        site.put(12, "海棠晓月");
        site.put(13, "福利社.小米熊儿童医院");
        site.put(14, "南坪大帝学校");
        site.put(15, "上海城嘉德中心");
        site.put(16, "长江村");
        site.put(17, "苏家坝");
        site.put(18, "菜坝火车站");
        Set<Map.Entry<Integer, String>> a = site.entrySet();
        Iterator<Map.Entry<Integer, String>> b = a.iterator();
        while (b.hasNext()) {
            Map.Entry<Integer, String> me = b.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        System.out.println("请输入上车站:");
        Collection<String> valus = site.values();

        ArrayList<String> e = new ArrayList<>();
        e.addAll(valus);
        Scanner number = new Scanner(System.in);
        String o = number.nextLine();
        for (; ; ) {
            if (e.contains(o)) {
                System.out.println("请输入到达站：");
                String p = number.nextLine();
                for (; ; ) {
                    if (e.contains(p)) {
                        int y = Math.abs(e.indexOf(p) - e.indexOf(o));
                        int time = y * 6;
                        if (y <= 3 && y > 0) {
                            System.out.println("从"+o+"到" + p + "共经过" + y + "站收费3元，大约需要" + time + "分钟");
                        }
                        if (y > 3 && y <= 5) {
                            System.out.println("从"+o+"到" + p + "共经过" + y + "站收费4元，大约需要" + time + "分钟");
                        } else {
                            int money = 4 + (y - 5) * 2;
                            if (money > 10) {
                                System.out.println("从"+o+"到" + p + "共经过" + y + "站收费10元，大约需要" + time + "分钟");
                            } else if (money <= 10 && money > 4) {
                                System.out.println("从"+o+"到"+ p + "共经过" + y + "站收费" + money + "元，大约需要" + time + "分钟");
                            }
                        }
                        break;
                    } else {
                        System.out.println("你输入的的到达站：" + p + "不存在,请重新输入");
                        p = number.nextLine();
                    }
                }
                break;
            } else {
                System.out.println("你输入的的上车站：" + o + "不存在,请重新输入");
                o = number.nextLine();
            }
        }
    }
}
