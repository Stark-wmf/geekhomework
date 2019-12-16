package 陈瑞.level_5_2;
import java.util.HashMap;
public class Main  {
    public static void main(String[] args) {
        HashMap<Integer, String> station = new HashMap<>();
        HashMap<String,Integer> num=new HashMap<>();
        //创建输出对象
       Guide guide=new Guide();
        Output output=new Output();
        station=guide.Guide();
        num=guide.Num();
        //判断是否输入正确
       String a= output.Output(station);
        String b=output.Output2(station);
        //获取价格和时间
        output.Money(num,a,b);

    }


            }



