package 蔡宇翔.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Station {

    //车站集合
    public static List setMap(){
        List<String> map=new ArrayList();
        map.add("老厂");
        map.add("幼儿园");
        map.add("文峰公社");
        map.add("吉祥路口");
        map.add("中研所");
        map.add("邮电大学");
        map.add("黄桷垭");
        map.add("崇文路口");
        map.add("上新街");
        map.add("港口医院");
        map.add("海棠溪");
        map.add("海棠晓月");
        map.add("福利社");
        map.add("南坪大帝学校");
        map.add("上海城嘉德中心");
        map.add("长江村");
        map.add("苏家坝");
        map.add("菜园坝火车站");

        return map;
    }

    //遍历集合
    public static void getMap(){
       for(int i=0; i<setMap().size();i++){
           System.out.println("第"+(i+1)+"位："+setMap().get(i));
       }
    }

//    public static void main(String[] args) {
//
//        储存数据
//        map.add("第1站：老厂");
//        map.add("第2站：幼儿园");
//        map.add("第3站：文峰公社");
//        map.add("第4站：吉祥路口");
//        map.add("第5站：中研所");
//        map.add("第6站：邮电大学");
//        map.add("第7站：黄桷垭");
//        map.add("第8站：崇文路口");
//        map.add("第9站：上新街");
//        map.add("第10站：港口医院");
//        map.add("第11站：海棠溪");
//        map.add("第12站：海棠晓月");
//        map.add("第13站：福利社");
//        map.add("第14站：南坪大帝学校");
//        map.add("第15站：上海城嘉德中心");
//        map.add("第16站：长江村");
//        map.add("第17站：苏家坝");
//        map.add("第18站：菜园坝火车站");

        //遍历打印
//        ListIterator a=map.listIterator();
//        while(a.hasNext()){
//            System.out.println(a.next());
//        }
//    }
//
//    public static List getmap(){
//        return map;
//    }
}
