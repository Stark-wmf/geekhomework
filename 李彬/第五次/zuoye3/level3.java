package 李彬.zuoye3;
import java.util.Random;


import java.util.Scanner;
public class level3 {
    long k=0;//统计花费的钱
    public static void main(String[] arg) {
        int j,n=-2;
        level3 test=new level3();//调用方法365次
        for (j=1;j<=356;j++){
            test.kk();

        }

    }
    public void kk(){

        int sysblueballnum;  //系统生成的篮球号
        int[] sysredballnum = new int[6];  //系统生成的红球号
        int userblueballnum;  //用户选择的蓝球号
        int[] userredballnum = new int[6]; //用户红球号码
        int blueball = 0;//蓝球号码是否正确
        int redballcount = 0; //红球号码是否正确
        //初始化随机类
        Random r = new Random();
        //获取输入流
        Scanner s = new Scanner(System.in);
        //蓝球赋值
        sysblueballnum = r.nextInt(16) + 1;
        //红球初始值
        int[] rednum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        //随机生成红球号码
        for (int i = 0; i < sysredballnum.length; i++) {
            while (true) {
                int index = r.nextInt(33);
                if (rednum[index] != 0) {
                    sysredballnum[i] = rednum[index];
                    rednum[index] = 0;
                    break;
                }
            }
        }
        userblueballnum = r.nextInt(16) + 1;
        for (int i = 0; i < userredballnum.length; i++) {
            while (true) {
                int index = r.nextInt(33);
                if (rednum[index] != 0) {
                    userredballnum[i] = rednum[index];
                    rednum[index] = 0;
                    break;
                }
            }
        }



        //判断用户选择 跟系统号码 是否匹配
        if (userblueballnum == sysblueballnum) {
            blueball = 1;
        }
        //验证后求
        for (int i = 0; i < userredballnum.length; i++) {
            for (int j = 0; j < sysredballnum.length; j++) {
                //如果用户红球和系统红球相等 那么就累加
                if (userredballnum[i] == sysredballnum[j]) {
                    redballcount++;
                    break;
                }

            }
        }


        //判断是否中奖
        if (blueball == 1 && redballcount == 6) {
            k=k+5000000;
            System.out.println("恭喜你中了500W！");
        } else if (redballcount == 6) {
            k=k+2000000;
            System.out.println("恭喜你中了2等奖,100W");
        } else if (blueball == 1 && redballcount == 5) {
            k=k+3000;
            System.out.println("恭喜你中了3等奖,3000");
        } else if (redballcount == 5 || (blueball == 1 && redballcount == 4)) {
            k=k+200;
            System.out.println("恭喜你中了4等奖,200快");
        } else if (redballcount == 4 || (blueball == 1 && redballcount == 3)) {
            k=k+10;
            System.out.println("恭喜你中了5等奖,10快");
        } else if ((blueball == 1 && redballcount == 1) || blueball == 1 || (blueball == 1 && redballcount == 2)) {
            k=k+5;
            System.out.println("恭喜你中了6等奖,5快");
        } else {
            k=k-2;
            //  System.out.println("很遗憾，您没中奖！");
        }
        System.out.println("收入"+k);

    }


}



