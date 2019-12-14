public class level5{
    public static void main(String[] args) {
//右上三角形
        for (int a = 9; a >= 1; a--) {
            for (int b = 9; b >= 1; b--) {
                if (b > a) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(a + "*" + b + "=" + a * b + "\t");
                }
            }
            System.out.println();
        }

//左上三角形
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                int sum = i * j;
                System.out.print(i + "*" + j + "=" + sum + "\t");
            }
            System.out.println();
        }
//右下角三角形
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= 1; j--) {
                if (j > i) {
                    System.out.print("\t\t");
                } else {
                    System.out.print(i + "*" + j + "=" + i * j + "\t");
                }
            }
            System.out.println();
        }
        //左下角三角形
        int j = 1;
        for (int i = 1; i <= j && j <= 9; i++) {
            System.out.print(i + "*" + j + "=" + (j * i) + "\t");
            if (i == j) {
                j++;
                i = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
}

