package javaWinPrize;

import java.util.*;

public class Ball {
    /**
     * 创建两个装球的集合,和dsy集合
     * 创建一个输入对象
     */
    Scanner input=new Scanner(System.in);
    List<Integer>redList=new ArrayList<Integer>();
    List<Integer>blueList=new ArrayList<Integer>();
    List<Integer>dsy1=new ArrayList<Integer>();
    List<Integer>dsy2=new ArrayList<Integer>();
    /**
     * 分别进行装数的操作
     */
    public void listAdd(){
        Random random=new Random();
        Integer red,blue;

        for(int i=0;i<6;i++) {
        do{
            red=random.nextInt(33)+1;
        }while (redList.contains(red));
            redList.add(red);
           // System.out.println(red);
        }
        blue=random.nextInt(15)+1;
        //System.out.println(blue);
        blueList.add(blue);}


public  void input(){
    Scanner input=new Scanner(System.in);
}
    /**
     * dsy猜球
     */
    public void presonListAdd(){
        System.out.println("请输入第一颗红球的号码:");
        int red1=input.nextInt();
        System.out.println("请输入第二颗红球的号码:");
        int red2=input.nextInt();
        System.out.println("请输入第三颗红球的号码:");
        int red3=input.nextInt();
        System.out.println("请输入第四颗红球的号码:");
        int red4=input.nextInt();
        System.out.println("请输入第五颗红球的号码:");
        int red5=input.nextInt();
        System.out.println("请输入第六颗红球的号码:");
        int red6=input.nextInt();
        Integer [] red={red1,red2,red3,red4,red5,red6};
        dsy1.addAll(Arrays.asList(red));
        System.out.println("请输入蓝球号码：");
        int blue=input.nextInt();
        dsy2.add(blue);
        System.out.println("填写完成！");


    }
//            Random random=new Random();
//            Integer red,blue;
//        for(int i=0;i<6;i++) {
//            do{
//                red=random.nextInt(33)+1;
//            }while (redList.contains(dsy1));
//            dsy1.add(red);}
//        blue=random.nextInt(15)+1;
//        dsy2.add(blue);}
//            for(Integer a:redList){
//                System.out.println("球里面的"+a);}
//        System.out.println("------------");
//            for(Integer a:dsy1){
//                System.out.println("dsy1的"+a);}
    /**
     * 中奖种类
     */
    public void winPrize(){
        redList.retainAll(dsy1);
        //System.out.println(redList);
        int num1=redList.size();
        blueList.retainAll(dsy2);
        int num2=blueList.size();
        int result=num1*10+num2;
        switch (result){
            case 61:
                System.out.println("dsy中了一等奖！");
                break;
            case 60:
                System.out.println("dsy中了二等奖！");
                break;
            case 51:
                System.out.println("dsy中了三等奖！");
                break;
            case 50:
            case 41:
                System.out.println("dsy中了四等奖！");
                break;
            case 40:
            case 31:
                System.out.println("dsy中了五等奖！");
                break;
            case 1:
            case 11:
            case 21:
                System.out.println("dsy中了六等奖！");
                break;
            default:
                System.out.println("未中奖");
        }
    }
}




