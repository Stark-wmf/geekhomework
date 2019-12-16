package 陈瑞;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        List<Integer> num1=new ArrayList<>();
        People people=new People();
     Ball ball=new Ball();
     num=people.People1();
     num1=ball.Ball();
     ball.reward(num,num1);

    }
}
