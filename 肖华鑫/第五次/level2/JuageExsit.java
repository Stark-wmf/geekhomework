package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class JuageExsit {
    private boolean flag;
    private String getOn,getOff;
    public JuageExsit(){
        System.out.println("请输入上车地点");
    }
    public Object judageUp(HashMap hm){
        do{
            Scanner scanner = new Scanner(System.in);
            getOn = scanner.nextLine();
            flag = hm.containsKey(getOn);
            if(!flag) {
                System.out.println(getOn+"站不存在，请重新输入车站");
            }
        }while (!flag);
        return hm.get(getOn);
    }
    public Object judageDowm(HashMap hm){
        System.out.println("请输入下车车站");
        do{
            Scanner scanner = new Scanner(System.in);
            getOff = scanner.nextLine();
            flag = hm.containsKey(getOff);
            if(!flag) {
                System.out.println(getOff+"站不存在，请重新输入车站");
            }
        }while (!flag);
        return hm.get(getOff);
    }
    public void tell(){
        System.out.print("从"+getOn+"到"+getOff);
    }
}
