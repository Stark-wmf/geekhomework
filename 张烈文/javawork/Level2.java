package 张烈文.javawork;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Level2  {
    public  Map<String, Integer> stations;
    public Level2(){
        this.stations=new HashMap<String, Integer>();
    }
//    Station L=new Station();
    int j,money;
    public void add(){
        stations.put("老厂",1);
        stations.put("幼儿园",2);
        stations.put("文峰公社",3);
        stations.put("吉祥路口",4);
        stations.put("中研所",5);
        stations.put("邮电大学",6);
        stations.put("黄桷垭",7);
        stations.put("崇文路口",8);
        stations.put("上新街",9);
        stations.put("港口医院",10);
        stations.put("海棠溪",11);
        stations.put("海棠晓月",12);
        stations.put("福利社·小米熊儿童医院",13);
        stations.put("南坪大帝学校",14);
        stations.put("上海城嘉德中心",15);
        stations.put("长江村",16);
        stations.put("苏家坝",17);
        stations.put("菜园坝火车站",18);
    }
    public void a(){
        for(String key:stations.keySet()){
            System.out.println(stations.get(key)+":"+key);
        }
    }
    public void Input() {
        int m,n;
        System.out.println("请输入上车站:");
        Scanner in = new Scanner(System.in);
        String X = in.next();
        stations.containsKey(X);
        while(stations.containsKey(X)!=true){
            System.out.println("请输入上车站:");
            X = in.next();
        }
        System.out.println("请输入到达站:");
        Scanner scanner=new Scanner(System.in);
        String N=scanner.next();
        stations.containsKey(N);
        while(stations.containsKey(N)!=true) {
            System.out.println("请输入终点站:");
            N=scanner.next();
        }
        m=stations.get(X);
        n=stations.get(N);
        j=Math.abs(m-n);
        System.out.println("乘客将要乘坐:"+j+"站");
        }
        public void Money() {
            if (j <= 3) {
                System.out.println("你需要支付:3元！！！"+",大约需要花费:"+6*j+"分钟");
            } else if (j > 3 && j <= 5) {
                System.out.println("你需要支付:4元"+",大约需要花费:"+6*j+"分钟");

            } else if (j > 5) {
                money = 4 + (j - 5) * 2;
                if (money >= 10) {
                    System.out.println("你需要支付:10元"+",大约需要花费:"+6*j+"分钟");
                } else System.out.println("你需要支付:" + money+"元"+",大约需要花费:"+6*j+"分钟");
            }
        }
        public void sr(){
            for(String key:stations.keySet()){
                System.out.println(stations.get(key)+":"+key);
            }
        }
    public static <stations> void main(String[] args) {
        Level2 m=new Level2();
        m.add();
        m.sr();
        System.out.println("----------------------------------------------------------------------------------------");
        m.Input();
        m.Money();
    }
}
