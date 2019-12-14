package others;

import java.util.HashMap;

public class CoinCoin {
    //测试用例
    public static void main(String[] args) {
        int m = 1100;
        int[] a = {1,3,5};
        //传入钱的总数目m和可用的币值a,接收一个数组，存储钱数小于等于m的所有凑钱结果
        int[] res = coinCoin(m, a);
        for(int i = 0; i <= m; i++) {  //打印结果
            System.out.println(i + "元最少需要" + res[i] + "个硬币！");
        }
    }
    //找出最少的钱的数目,这个函数起了一个过渡的作用。
    private static int[] coinCoin(int m, int[] a) {
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();  //对代码进行优化
        int[] res = new int[m + 1];  //存储凑够0到N的所有硬币数目
        for(int i = 0; i < m + 1; i++) {  //初始化
            res[i] = i;
        }
        //调用min()函数，完成了对res[]所有元素的赋值，
        res[m] = min(m, a, res, h);  //对该函数返回值，可以接收也可以不接收
        return res;
    }
    //min(m,....)函数返回凑够m所需的最少硬币数目。
    private static int min(int m, int[] a, int[] res,
                           HashMap<Integer, Integer> h) {
        h.put(m, 0);   //把m存入h中，键所对应的值可以随意取。
        if(m == 0) {  //递归结束条件
            res[m] = 0;
            return res[m];
        }
        for (int i = 0; i < a.length; i++) {
            if (m >= a[i]) {  //对当前硬币值和1,3,5做比较，决定循环次数,不可省略。
                if(h.containsKey(m - a[i])) {
                    //h是为了提高效率，降低时间复杂度，如果m - a[i]已经存在于h中，那么min(m)就已知，
                    //就没有必要再次递归，重复求解min(m),但是这样牺牲了空间复杂度。在实际运用中选择合适的方案。
                    if(res[m] > res[m - a[i]] + 1)
                        res[m] = res[m - a[i]] + 1;
                } else {
                    //m - a[i]不存在于h中
                    if(res[m] > min(m - a[i], a, res, h) + 1)
                        res[m] = min(m - a[i], a, res, h) + 1;
                }
            }
        }
        return res[m];
    }
}
