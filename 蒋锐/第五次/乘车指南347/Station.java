package 蒋锐.乘车指南347;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

//车站类用来存放车站信息；
public class Station {
    Map<String,Integer> stations=new HashMap<String,Integer>();
    //addStation()方法用于存储站名和编号
    public void addStation(){
        stations.put("老厂",1);
        stations.put("幼儿园(招呼站)",2);
        stations.put("文峰公社",3);
        stations.put("吉祥路口",4);
        stations.put("中研所",5);
        stations.put("邮电大学",6);
        stations.put("黄桷娅",7);
        stations.put("崇文路口",8);
        stations.put("上新街",9);
        stations.put("港口医院",10);
        stations.put("海棠溪",11);
        stations.put("海棠晓月",12);
        stations.put("福利社*小米熊儿童医院",13);
        stations.put("南坪大帝学校",14);
        stations.put("上海城嘉徳中心",15);
        stations.put("长江村",16);
        stations.put("苏家坝",17);
        stations.put("菜园坝火车站",18);
    }
    //display()用于遍历打印车站信息；
    public void display(){
        Set<Map.Entry<String,Integer>> entrySet=stations.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet) {
            System.out.println("站名 :"+entry.getKey()+"\t编号 :"+entry.getValue());

        }
    }
    //该方法用于计算票价和时间；
    public void ticketPriceAndTime(){
        System.out.println("请输入上车站：");
        Scanner input=new Scanner(System.in);
        String temp=input.next();
        while (!stations.containsKey(temp)){
            System.out.println(temp+"不存在，请重新输入上车站：");
            temp=input.next();
        }
        System.out.println("请输入下车站");
        String temp2=input.next();
        while (!stations.containsKey(temp2)){
            System.out.println(temp2+"不存在，请重新输入下车站：");
            temp2=input.next();
        }
        int numb1=stations.get(temp);//numb1,numb2分别表示上车站和下车站的编号；
        int numb2=stations.get(temp2);
        int totalnumb=numb2-numb1;//totalnumb表示总行程站数；
        if (totalnumb<=3){
            System.out.println("从"+temp+"到"+temp2+"共经过"+totalnumb+"站"+"收费3元,大约需要"+totalnumb*6+"分钟");
        }else if (totalnumb<=5){
            System.out.println("从"+temp+"到"+temp2+"共经过"+totalnumb+"站"+"收费4元,大约需要"+totalnumb*6+"分钟");
        }else if(totalnumb<=8){
            System.out.println("从"+temp+"到"+temp2+"共经过"+totalnumb+"站"+"收费"+(2*totalnumb-6)+"元,大约需要"+totalnumb*6+"分钟");
        }else {
            System.out.println("从"+temp+"到"+temp2+"共经过"+totalnumb+"站"+"收费10元,大约需要"+totalnumb*6+"分钟");
        }


    }



}
