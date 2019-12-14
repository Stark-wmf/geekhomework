
public class d2{
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(a[j]+"*"+a[i]+"="+a[i]*a[j]+"\t");
          }


          System.out.println();
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <=8*(9-i-1)-1; j++) {
                System.out.print(" ");

               }
            for (int k = i; k >=0; k--) {
                System.out.print(a[k]+"*"+a[i]+"="+a[i]*a[k]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i <a.length; i++) {
            for (int j = 0; j <=8*i-1; j++) {
                System.out.print(" ");

            }
            for (int k = i; k <a.length; k++) {
                System.out.print(a[i]+"*"+a[k]+"="+a[k]*a[i]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i <a.length; i++) {

            for (int k = i; k <a.length; k++) {
                System.out.print(a[i]+"*"+a[k]+"="+a[i]*a[k]+"\t");
            }
            System.out.println();
        }
    }





}