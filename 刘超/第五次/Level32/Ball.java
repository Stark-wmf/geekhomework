package 刘超.Level32;
import java.util.ArrayList;
import java.util.Random;

public class Ball {
   public static int money = 0;
   public static int Yumoney;
   public static ArrayList<Integer> redball = new ArrayList<>();
   public static int blutball ;
   public static ArrayList<Integer>box = new ArrayList<>();
   public static ArrayList<Integer>userad = new ArrayList<>();
   public static int useblue ;

    public static void kai(){
        for (int i = 0; i <33 ; i++) {
            box.add(i);
        }
        Random r = new Random();

        for (int i = 0 ; i<=6;i++){
            int x = r.nextInt(box.size());
            int redbox  = box.get(x);
            box.remove(x);
            System.out.print(redbox+" ");
            redball.add(redbox);
        }
        blutball = r.nextInt(15)+1;
        System.out.println("蓝色球号码是："+blutball);
    }
}
