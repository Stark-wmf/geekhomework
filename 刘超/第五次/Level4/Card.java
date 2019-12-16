package 刘超.Level4;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
    public   ArrayList<String>list = new ArrayList<>();
    public  Card (){
    String num1 [] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String num2 [] = {"♦", "♣", "♥", "♠"};

        list.add("大王");
        list.add("小王");
        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j <num2.length ; j++) {
                String a = num1[i];
                String b = num2[j];
                list.add(b+a);
            }
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
