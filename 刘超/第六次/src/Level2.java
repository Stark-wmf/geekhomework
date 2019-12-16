
import java.util.*;

public class Level2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
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
        map.put(14, "南坪大帝学校");
        map.put(15, "上海城嘉德中心");
        map.put(16, "长江村");
        map.put(17, "苏家坝");
        map.put(18, "菜园坝火车站");

        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>(map.values());
        for (; ; ) {
            System.out.println("请输入上车站：");
            String a = input.next();//上车
                if (list.contains(a)) {
                    System.out.println("请输入下车站：");
                    String b = input.next();//下车
                    int z = Math.abs(list.indexOf(a)-list.indexOf(b));//经过的站数
                    int p = 0;//要花费的钱
                    int t = 0;//经过的时间
                    if (list.contains(b)){
                        if (z<=3)
                        {
                            p =3;
                        }else if (z>3 && z<=5)
                        {
                            p =4;
                        }else if (z>5){
                            p =4+(z-5)*2;
                            if (p>=10)
                            {
                            p = 10;
                            }
                        }
                        t = z*6;
                        System.out.println("从"+a+"到"+b+"共经过"+z+"站\t收费："+p+"元\t大约需要："+t+"分钟");
                        break;
                    }else{
                        System.out.println("您输出的下车站" + b + "不存在,请重新输入下车站！");
                        b = input.next();
                    }
                    break;
                } else {
                    System.out.println("您输出的上车站" + a + "不存在,请重新输入上车站！");
                    a = input.next();
                }
            }
        }
    }

