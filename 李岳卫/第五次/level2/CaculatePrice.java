package 李岳卫.level2;

import java.util.*;

public class CaculatePrice {
    private int lowprice;
    private int commonprice;
    private int extraprice;
    private int stationcount;
    private int maxprice;
    private int eachtime;
    private String aboradstation;
    private String arrivalstation;
    Map<Integer,String> map = new TreeMap<Integer,String>();

    public CaculatePrice(Map<Integer, String> map){
        this.lowprice = 3;
        this.commonprice = 4;
        this.extraprice = 2;
        this.stationcount = 0;
        this.maxprice = 10;
        this.eachtime = 6;
        this.aboradstation = null;
        this.arrivalstation = null;
        this .map = map;
    }
    public void getinfo(Map<Integer, String> map) {
        String copymap[] = new String[map.size()];
        for (int x = 1;x<=map.size();x++)
            copymap[x-1] = map.get(x);
        String station1,station2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入上车站：");
        station1 = scanner.nextLine();
        while(!Arrays.asList(copymap).contains(station1)){
            System.out.println("您输入的上车站："+station1+"不存在，请重新输入上车站：");
            station1 = scanner.nextLine();
        }
        System.out.println("到达站为："+station1);
        System.out.println("------------------");
        aboradstation = station1;
        System.out.println("请输入到达站：");
        station2 = scanner.nextLine();
        while(!Arrays.asList(copymap).contains(station2)){
            System.out.println("您输入的到达站："+station2+"不存在，请重新输入到达站：");
            station2 = scanner.nextLine();
        }
        System.out.println("到达站为："+station2);
        arrivalstation = station2;
    }
    public void printprice(){
        int key1 = 0,key2 = 0,stationnumber = 0;
        Set<Map.Entry<Integer,String>> s = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = s.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> m = it.next();
            if (m.getValue().equals(aboradstation))
                key1 = m.getKey();
            if (m.getValue().equals(arrivalstation))
                key2 = m.getKey();
        }
        stationnumber = Math.abs(key1-key2);
        int yourprice,totaltime = eachtime*stationnumber;
        int m = 5;
        switch (stationnumber)
        {
            case 1:{}
            case 2:{}
            case 3: {
                yourprice = lowprice;
                break;
            }
            case 4:{}
            case 5:{
                yourprice = commonprice;
                break;
            }
            case 6:{}
            case 7:{}
            case 8:{
                yourprice = commonprice+(stationnumber-m)*extraprice;
                break;
            }
            default:{
                yourprice = maxprice;
                break;
            }
        }
        System.out.println("从"+aboradstation+"到"+arrivalstation+"共经过"+stationnumber+"站收费"+yourprice+"元，大约需要 "+totaltime+"分钟");
    }
}
