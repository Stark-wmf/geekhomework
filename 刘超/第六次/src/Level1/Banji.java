package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Banji {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList();
        list.add(new Student("03011802", 2018210868,"美羊羊"
               ,18,"女"));

        list.add(new Student("03011802", 2018210860,"懒羊羊"
               ,18,"男"));

        list.add(new Student("03011802",  2018210861,
              "喜羊羊",18,"男"));

        list.add(new Student("03011802",2018210862,"沸羊羊"
                ,18,"男"));

        list.add(new Student("03011802",2018210869,"慢羊羊"
                ,80,"男"));
        System.out.println(list);//直接输出数组

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//传统for遍历
        }

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("正向排序");
        Collections.sort(list);
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());//通过迭代器遍历
        }
        System.out.println("逆向输出");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        }
    }

