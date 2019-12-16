package 李岳卫.level1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Information> all = new ArrayList<Information>();
        List<Information> sort,ReverseOrder;
        all.add(new Information("03011904","lyw",2019210980,18,"男"));
        all.add(new Information("03011904","chc",2019210981,18,"男"));
        all.add(new Information("03011904","zz ",2019210977,18,"男"));
        all.add(new Information("03011904","szy",2019210974,18,"男"));
        all.add(new Information("03011904","ljy",2019210978,18,"男"));
        all.add(new Information("03011904","xhx",2019210979,18,"男"));
        all.add(new Information("03011904","hkw",2019210967,18,"男"));
        all.add(new Information("03011904","wlh",2019210976,18,"男"));
        System.out.println(all+"\n");
        System.out.println("\n");
        all.forEach(System.out::println);
        System.out.println("\n");
        all.remove(new Information("03011904","lyw",2019210980,18,"男"));
        sort = Information.sort(all);
        for (int x = 0;x<all.size();x++)
            System.out.println(sort.get(x));
        ReverseOrder = Information.ReverseOder(all);
        System.out.println("\n");
        ReverseOrder.forEach(System.out::println);
    }
}
