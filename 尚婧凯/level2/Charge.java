package 尚婧凯.level2;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Charge {
    public Map<Integer,Station> station;

    public Charge() {
        this.station = new HashMap<Integer, Station>();
    }

    public void stationPut(){
        Station newStation1=new Station("老厂");
        Station newStation2=new Station("幼儿园(招呼站)");
        Station newStation3=new Station("文峰公社");
        Station newStation4=new Station("吉祥路口");
        Station newStation5=new Station("中研所");
        Station newStation6=new Station("邮电大学");
        Station newStation7=new Station("黄桷垭");
        Station newStation8=new Station("崇文路口");
        Station newStation9=new Station("上新街");
        Station newStation10=new Station("港口医院");
        Station newStation11=new Station("海棠溪");
        Station newStation12=new Station("海棠晓月");
        Station newStation13=new Station("福利社·小米熊儿童医院");
        Station newStation14=new Station("南坪大帝学校");
        Station newStation15=new Station("上海城嘉德中心");
        Station newStation16=new Station("长江村");
        Station newStation17=new Station("苏家坝");
        Station newStation18=new Station("菜园坝火车站");

        station.put(1,newStation1);
        station.put(2,newStation2);
        station.put(3,newStation3);
        station.put(4,newStation4);
        station.put(5,newStation5);
        station.put(6,newStation6);
        station.put(7,newStation7);
        station.put(8,newStation8);
        station.put(9,newStation9);
        station.put(10,newStation10);
        station.put(11,newStation11);
        station.put(12,newStation12);
        station.put(13,newStation13);
        station.put(14,newStation14);
        station.put(15,newStation15);
        station.put(16,newStation16);
        station.put(17,newStation17);
        station.put(18,newStation18);
    }

    public Integer stationNumber(String a,String b) {
        Set<Map.Entry<Integer, Station>> entrySet = station.entrySet();
        Integer na=0;
        Integer nb=0;
        Integer number=0;

        for (Map.Entry<Integer, Station> entry : entrySet) {
            String i = entry.getValue().name;
            if (i.equals(a)) {
                na = entry.getKey();
            }
            if (i.equals(b)) {
                nb = entry.getKey();
            }
        }
        number=nb-na;
        return number;
    }

    public static void main(String[] args){
        Charge charge=new Charge();
        Scanner arrival=new Scanner(System.in);
        Scanner destination=new Scanner(System.in);
        charge.stationPut();
        System.out.println("请输入上车站！");
        String ar=arrival.next();
        System.out.println("请输入下车站！");
        String de=destination.next();

        int stationNumber=charge.stationNumber(ar,de);
        int time=6*stationNumber;
        int pay=0;
        if(stationNumber<=3){
            pay=3;
        }else if(stationNumber<=5){
            pay=4;
        }else if (stationNumber<=8){
            pay=4+(stationNumber-5)*2;
        }else if (stationNumber<=18){
            pay=10;
        }

        System.out.println("从"+ar+"到"+de+"共经过"+stationNumber+"站"+"收费"+pay+"元"+"，大约需要"+time+"分钟！");
    }
}
