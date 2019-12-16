package 李岳卫.level1;

import java.util.List;

public class Information {
    private String classinfo;
    private String nameinfo;
    private int stunumber;
    private int ageinfo;
    private String sexinfo;

    public Information(String classinfo, String nameinfo, int stunumber, int ageinfo, String sexinfo) {
        this.classinfo = classinfo;
        this.nameinfo = nameinfo;
        this.stunumber = stunumber;
        this.ageinfo = ageinfo;
        this.sexinfo = sexinfo;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Information))
            return false;
        Information information = (Information) obj;
        return this.nameinfo.equals(information.nameinfo) && this.sexinfo.equals(information.sexinfo) && this.classinfo.equals(information.classinfo) && this.ageinfo == information.ageinfo && this.stunumber == information.stunumber;
    }

    public String toString() {
        return "班级；" + this.classinfo + "姓名；" + this.nameinfo + "学号；" + this.stunumber + "年龄；" + this.ageinfo + "性别；" + this.sexinfo;
    }

    public static List<Information> sort(List<Information> all) {
        String a[] = new String[all.size()];
        for (int x = 0; x < all.size(); x++)
            a[x] = String.valueOf(all.get(x));
        for (int x = 0; x < a.length; x++) {
            int minIndex = x;
            for (int y = x; y < a.length; y++) {
                int m = a[y].substring(20, 30).compareTo(a[minIndex].substring(20, 30));
                if (m < 0)
                    minIndex = y;
            }
            Information temp = all.get(minIndex);
            all.set(minIndex,all.get(x));
            all.set(x, temp);
            String temp1 = a[minIndex];
            a[minIndex] = a[x];
            a[x] = temp1;
        }
        return all;
    }
    public static List<Information> ReverseOder(List<Information> all) {
        String a[] = new String[all.size()];
        for (int x = 0; x < all.size(); x++)
            a[x] = String.valueOf(all.get(x));
        for (int x = 0; x < a.length; x++) {
            int minIndex = x;
            for (int y = x; y < a.length; y++) {
                int m = a[y].substring(20, 30).compareTo(a[minIndex].substring(20, 30));
                if (m > 0)
                    minIndex = y;
            }
            Information temp = all.get(minIndex);
            all.set(minIndex,all.get(x));
            all.set(x, temp);
            String temp1 = a[minIndex];
            a[minIndex] = a[x];
            a[x] = temp1;
        }
        return all;
    }
}




