public class level_5 {
    public static void main(String[] args) {
        level_5 hello = new level_5();
        int[][] a = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        /*   1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         *  1    2    3    4    5   6   7    8   9
         */
        hello.show1();
        hello.show2(1);
        hello.show3("九九");
        hello.show4("九九",9);

    }
    public void show1(){
            for (int i=1;i<=9;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
                }
                System.out.println();
            }
        }
        public void show2(int b){
for (int i=1;i<=9;i++){
    for (int j=9;j>=i;j--){
        System.out.print(i+"*"+j+"="+i*j+"\t");
    }
System.out.println();
}
}
       public void show3(String name){
for (int i=9;i>=1;i--){
    for (int j=1;j<10-i;j++){
        System.out.print("\t\t");
    }
    for (int j=i;j>=1;j--){
        System.out.print(i+"*"+j+"="+i*j+"\t");
    }
System.out.println();
}
}
       public void show4(String name,int c){
           for (int i = 1; i < 10; i++) {
               //2.再在前面加一些tab放到指定位置
               for(int j = 1; j < 10-i; j++)
                   System.out.print("\t\t");

               //1.先把这个反过来,就倒着打印了
               for (int j = i; j >= 1; j--) {
                   System.out.print(j + "*" + i + "=" + j * i + "\t");
               }
               System.out.println();
           }
}

}
