import java.util.Scanner;

public class chengfabiao {
  //第一种
   public  void yi() {
       for (int i =1;i<=9;i++){
           for (int j=1;j<=9;j++){
               System.out.println(i+"*"+j+"="+i*j+"");
           }
       }
   }
   //第二种
     public void er() {
      for (int i =1;i<=9;i++){
          for (int j=1;j<=i;j++){
              System.out.println(i+"*"+j+"="+i*j+"");
          }
          System.out.println();
      }
  }

 //第三种
    public void san() {
     for (int i =1;i<=9;i++){
         for (int j=i;j<=9;j++){
             System.out.println(i+"*"+j+"="+i*j+"");
         }
     }
     System.out.println();
 }
   //第四种
     public  void shi() {
     for (int i =9;i>=1;i--){
         for (int j=1;j<=i;j++){
             System.out.println(i+"*"+j+"="+i*j+"");
         }
     }
     System.out.println();
 }

    public static void main(String[] args) {
      int a[][]=new int [2][2];
       int i;
        Scanner in =new Scanner(System.in);
        i=in.nextInt();
           switch (i){
               case 1:
                  a[0][0]=i;
                  chengfabiao text=new chengfabiao();
                  text.yi();
                  break;
               case 2:
                   a[0][1]=i;
                   chengfabiao yyy=new chengfabiao();
                   yyy.er();
                   break;
               case 3:
                 a[1][0]=i;
                   chengfabiao iii=new chengfabiao();
                   iii.san();
                   break;
               case 4:
                   a[1][1]=i;
                   chengfabiao sss=new chengfabiao();
                   sss.shi();
                   break;
               default:
                   System.out.println("没有匹配");
           }
    }


    }

