package 李国龙.Level2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> s=new HashMap<>();
        StringBuffer Go =new StringBuffer();
        StringBuffer Return=new StringBuffer();
        Station i=new Station();
        i.Setnum(s);
        i.Output(s);
        i.GetStation(s,Go,Return);
        i.Last(s,Go,Return);
    }
}
