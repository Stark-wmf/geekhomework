package 蒋锐.双色球;


import java.util.*;

//假设双色球一等奖为100000元，二等奖为80000元，三等奖为50000元，四等奖为30000元，五等奖为10000元，六等奖为5000元
public class DoubleBall {
    public Set<Integer> randomRedBall(int i){
        Set<Integer> redball=new HashSet<Integer>();
        Random random=new Random(i);
        while(redball.size()<6){

            redball.add(random.nextInt(33)+1);
        }

        return redball;
    }
    public int randomBlueBall(){
        Random random=new Random();
        int blueball=random.nextInt(15)+1;

        return blueball;
    }
    //myredBallNumb()是用于选球号码的方法；
    public Set<Integer>  myRedBallNumb(){
        Set<Integer> myredball=new HashSet<Integer>();
        Scanner input=new Scanner(System.in);
        int i=1;
        while (myredball.size()<6){
            System.out.println("请输入第"+i+"红球号码");
            int temp=input.nextInt();
            if (myredball.contains(temp)){
                System.out.println("请不要输入重复数字请重新输入");
                continue;
            }else if (temp>=1&&temp<=33){
            myredball.add(temp);
            i++;}

        }

        return myredball;
}
    public int myBlueBallNumb(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入蓝球号码(1~15)");
        int temp=input.nextInt();
        int myblueball;
        for (;;){
        if (temp>0&&temp<=15){
            myblueball=temp;
            break;
        }else {
            System.out.println("输入错误请重新输入");
            temp=input.nextInt();
        }
        }
        return myblueball;
    }
    //judge()用于判断是否中奖并计算连续购买一年后的资产,
    //参数set1是用于接受随机生成的红球中奖号码的参数，参数set2是用于接收用户自己选择的红球号码的参数；
    //参数blueball1是用于接收随机生成的蓝球中奖号码的参数，参数blueball2是用于接受用户自己悬着的蓝球号码的参数；
    public int judge(Set<Integer> set1,Set<Integer> set2,int blueball1,int blueball2){
        int count=0;
        for (Integer set:set1) {
            if (set2.contains(set)){
                count++;
            }

        }
        if (count==6&&blueball1==blueball2){
            System.out.println("恭喜您中了一等奖");
            return 100000;
        }else if(count==6){
            System.out.println("恭喜您中了二等奖");
            return 80000;
        }else if (count==5&&blueball1==blueball2){
            System.out.println("恭喜您中了三等奖");
            return 50000;
        }else if(count==5||count==4&&blueball1==blueball2){
            System.out.println("恭喜您中了四等奖");
            return 30000;
        }else if (count==4||count==3&&blueball1==blueball2){
            System.out.println("恭喜您中了五等奖");
            return 10000;
        }else if (blueball1==blueball2){
            System.out.println("恭喜您中了六等奖");
            return 5000;
        }else return 0;
    }

}
