package 李国龙.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Classroom {
    public static void main(String[] args) {
        List<Student> class1 = new ArrayList<>();
        class1.add(new Student("03011901", 2019210877, "李四", 18, "男"));
        class1.add(new Student("03011901", 2019210874, "张三", 17, "男"));
        class1.add(new Student("03011901", 2019210886, "王五", 19, "男"));
        class1.add(new Student("03011901", 2019210879, "美羊羊", 10, "女"));
        class1.add(new Student("03011901", 2019210890, "金咕咕", 23, "男"));
        System.out.println("------------------------foreach遍历-------------------");
        for (Student o : class1
        ) {
            System.out.println(o);
        }
        class1.remove(4);
        System.out.println("------------------------删除后-------------------");
        System.out.println("------------------------迭代器遍历-------------------");
        Iterator<Student> k = class1.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }
        class1.sort(new Student());
        System.out.println("---------------按学号升序排序后-------------------------");
        for (Student o : class1
        ) {
            System.out.println(o);
        }
        Collections.reverse(class1);
        System.out.println("-----------------按学号降序排序后-------------------");
        for (Student o : class1
        ) {
            System.out.println(o);
        }
    }
}