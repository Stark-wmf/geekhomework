package 蔡宇翔.Level3;

import java.util.ArrayList;
import java.util.List;

import static 蔡宇翔.Level3.Hsy.*;
import static 蔡宇翔.Level3.Thesystem.WinOrNot;
import static 蔡宇翔.Level3.Thesystem.setSystem;

public class Main {
    public static void main(String[] args) {
        List a=new ArrayList() ;
        List b=new ArrayList();
        int w;
        for(int d=1;d<=365;d++){
            System.out.println("第"+d+"天");
            a.clear();
            b.clear();
            a=setSystem();
            b=setBuynumber();
            System.out.println("hsy购买的彩票号为："+b);
            System.out.println("双色球号为："+a);
            Buy();
            w=WinOrNot(a,b);
            Win(w,d);
//            getCaptial();

        }
        getCaptial();
    }
}
