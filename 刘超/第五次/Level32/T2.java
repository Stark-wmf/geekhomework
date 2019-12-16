package 刘超.Level32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T2 {
    public int t = 0;
    public int y = 0;
    public int u = 0;
    public int o = 0;

    public void  Bigwriting(String s) {
        char a[] = s.toCharArray();
        ArrayList<Byte> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            char b = a[i];
            if (b >= 'A' && b <= 'Z') {
                list.add((byte) a[i]);
                t++;
            }
        }
        System.out.println("大写字母出现的次数："+t);
        final int size = list.size();
        Byte q[] = (Byte[]) list.toArray(new Byte[size]);
        Arrays.sort(q);
        System.out.println(Arrays.toString(q));
//        for (int i = 0; i < q.length; i++) {
//            if (q[i] >= q[i + 1]) {
//                byte f = q[i + 1];
//                q[i + 1] = q[i];
//                q[i] = f;
//            }
//            System.out.println(q[i]);
//        }
    }

    public void Smallwriting(String s) {
        char a[] = s.toCharArray();
        ArrayList<Byte> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            char b = a[i];
            if (b >= 'a' && b <= 'z') {
                list.add((byte) a[i]);
                y++;
            }
        }
        System.out.println("小写字母出现的次数："+y);
        final int size = list.size();
        Byte q[] = (Byte[]) list.toArray(new Byte[size]);
        Arrays.sort(q);
        System.out.println(Arrays.toString(q));
    }

    public void Number(String s) {
        char a[] = s.toCharArray();
        ArrayList<Byte> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            char b = a[i];
            if (b >= '0' && b <= '9') {
                list.add((byte) a[i]);
                u++;
            }
        }
        System.out.println("数字出现的次数："+u);
        final int size = list.size();
        Byte q[] = (Byte[]) list.toArray(new Byte[size]);
        Arrays.sort(q,Collections.reverseOrder());
        System.out.println(Arrays.toString(q));
    }

    public void Else(String s) {
        char a[] = s.toCharArray();
        ArrayList<Byte> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            char b = a[i];
            if (b < '0' ||(b>'9' && b<'A')||(b>'Z' && b<'a')||(b>'z')) {
                list.add((byte) a[i]);
                o++;
            }
        }
        System.out.println("其他字符出现的次数："+o);
        final int size = list.size();
        Byte q[] = (Byte[]) list.toArray(new Byte[size]);
        Arrays.sort(q,Collections.reverseOrder());
        System.out.println(Arrays.toString(q));
    }
}
