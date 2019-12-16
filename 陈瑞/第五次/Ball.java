package 陈瑞;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ball {
    public List Ball() {
        //放产生的红球
        HashSet<Integer> num1 = new HashSet<>();
        //放总共产生的中奖号码
        List list = new ArrayList();
        //每一次输入;
        for (int k = 0; k < 365; k++) {
            for (; ; ) {
                //添加红球的数值
                num1.add((int) (Math.random() * 33 + 1));
                if (num1.size() == 6) {
                    List list2 = new ArrayList(num1);
                    num1.clear();
                    //添加篮球
                    num1.add((int) (Math.random() * 16 + 1));
                    //把蓝球的值放入新的集合
                    List list1 = new ArrayList(num1);
                    num1.clear();
                    list.add(list1);
                    list.add(list2);
                    break;
                }
            }
        }
        System.out.println(list.size());
        return list;
    }

    public void reward(List a, List b) {
        int money = -730;
        for (int i = 0; i < 730; i = i + 2) {
            if (a.get(i).equals(b.get(i)) && a.get(i + 1).equals(b.get(i + 1))) {
                System.out.println("hsy得了一等奖，让我们恭喜他");
                money = money + 100;
            }
            if (a.get(i).equals(b.get(i)) && !a.get(i + 1).equals(b.get(i + 1))) {
                System.out.println("hsy得了二等奖，这真是厉害了");
                money = money + 50;
            }
            /* 下面的是我准备写3,4,5，6等奖，但是集合里面元素我不能变成数组。我真的放弃了。
            int m=0;
            for(int c=0;c<730;c=c+2) {
               int []n=new int[6];
                int [] n1=new int[6];
               n = (int[]) a.get(c);
                 n1=(int[])b.get(c);
                for(int d=0;d<6;d++){
                    if(n[d]==n1[d]){
                        m++;
                    }
                    if(m==5&&a.get(c+1).equals(b.get(c+1))){
                        System.out.println("hsy得了三等奖,不错不错");
                        money=money+20;
                        m=0;
                    }
                    if(m==5||(m==4&&a.get(c+1).equals(b.get(c+1)))){
                        System.out.println("hsy得了四等奖，手气一般");
                        m=0;
                        money=money+10;
                    }
                    if(m==4||(m==3&&a.get(c+1).equals(b.get(c+1)))){
                        System.out.println("hsy得了五等奖，有奖就不错了");
                        m=0;
                        money=money+5;
                    }
                    if(a.get(c+1).equals(b.get(c+1))){
                        System.out.println("hsy得了六等奖，该去洗洗手了");
                        money=money+2;
                    }
                }
            }
            System.out.println("hsy最后钱为:"+money);
        }
        */
        }
    }
}




