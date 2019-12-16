package 陈瑞;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class People {
    public List People1() {
        HashSet<Integer> num = new HashSet<>();
        List list=new ArrayList();
        //每一次输入;
        for (int k = 0; k < 365; k++) {
            for (; ; ) {
                //添加红球的数值
                num.add((int) (Math.random() * 33 + 1));
                if (num.size() == 6) {
                    List list2=new ArrayList(num);
                    num.clear();
                    //添加篮球
                    num.add((int) (Math.random() * 16 + 1));
                    //把蓝球的值放入新的集合
                    List list1 = new ArrayList(num);
                    num.clear();
                   list.add(list1);
                   list.add(list2);
                    break;
                    }
                    }
                }
    System.out.println(list.size());
        return list;
            }
    }
//添加蓝球的数值
//Iterator it1 = num.iterator();
//while (it1.hasNext()) {
//  number.add((Integer) it1.next());
//num.clear();
//break;
