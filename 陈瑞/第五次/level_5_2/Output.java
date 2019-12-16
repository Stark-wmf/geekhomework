package 陈瑞.level_5_2;
import java.util.*;

public class Output {
    public  String Output(HashMap station) {
        //判断输入输出是否正确
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入起点站：");
        String s1 = scanner.nextLine();
        for (int i = 0; i < station.size(); i++) {
            for (int k = 0; k < station.size(); k++)
                if (s1.equals(station.get(k)))
                    a = 1;
            if (a == 0) {
                System.out.println("输入错误重新输入:");
                s1 = scanner.nextLine();
            }
            if (a == 1)
                break;
        }
       return s1;
    }

    public  String Output2(HashMap station2){
        int b=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入终点站：");
        String s2 = scanner.nextLine();
        for (int i = 0; i < station2.size(); i++) {
            for (int k = 0; k < station2.size(); k++)
                if (s2.equals(station2.get(k)))
                    b= 1;
            if (b== 0)
            {
                System.out.println("输入错误重新输入:");
                s2 = scanner.nextLine();
            }
            if(b==1)
                break;
        }
        return s2;
    }
    public void Money(HashMap money,String a,String b){
        Integer n= (Integer) money.get(a);
        Integer m= (Integer) money.get(b);
        if(m-n<=2)
System.out.println("路费3元");
        if(m-n>2&&m-n<=4) {
            int mini=(m-n)*6;
            System.out.println("从" + a + "到" + b +"共经过"+(m-n)+ "站，需要路费4元" + "耗时"+mini+"分钟");
        }
        if(m-n>=5&&m-n<=7) {
            int mini=(m-n)*6;
            System.out.println("从" + a + "到" + b +"共经过"+(m-n)+ "站，需要路费" + (4 + 2 * (m - n - 5)) + "耗时"+mini+"分钟");
        }
        if(m-n>7) {
            int mini=(m-n)*6;
            System.out.println("从" + a + "到" + b +"共经过"+(m-n)+ "站，需要路费10元" + "耗时"+mini+"分钟");
        }
    }
}
