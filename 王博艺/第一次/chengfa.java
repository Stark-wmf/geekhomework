package cehngfa;

public class chengfa
{

        public static void main(String[] args)
        {
            int a[][]=new int[9][9];
            for(int i=1;i<=9;i++){
                for(int p=1;p<=i;p++){

                    System.out.print(p+"*"+i+"="+i*p+"\t");
                }
                System.out.println();
            }
        }
}
