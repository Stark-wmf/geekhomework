public class chengfabiao {
    public static void yi(){
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");

            }
            System.out.println();
        }
    }
    public static void er(){
        for (int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
            }
        }

    public static void san(){
        for (int i=9;i>=1;i--){
            for (int k=9-i;k>0;k--){
                System.out.print("     " + "\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    public static void si(){
        for (int i=1;i<=9;i++){
            for (int l=9-i;l>=1;l--){
                System.out.print("     " + "\t");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        yi();
        System.out.println("________________________________________________________________________");
        er();
        System.out.println("________________________________________________________________________");
        san();
        System.out.println("________________________________________________________________________");
        si();
        System.out.println("________________________________________________________________________");
        int[][]zu=new int[9][9];
        for (int i=0;i<zu.length;i++){
            for (int j=0;j<zu[i].length;j++){
                zu[i][j]=i+j;
            }
        }
        for (int x[]:zu
             ) {
            for (int y:x
                 ) {
                System.out.print(y+"\t");
            }
            System.out.println();
        }
    }
}
