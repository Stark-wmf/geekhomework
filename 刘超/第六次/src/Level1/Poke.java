package Level1;

public class Poke {
    public static void main(String[] args) {
        Poker c = new Poker();
        for (int i = 0;i<c.a.length;i++){
         for (int j = 0;j<c.b.length;j++){
             System.out.print("\t"+c.b[j]+":"+c.a[i]+"\t");
         }
            System.out.println();
        }
        for (int i = 0;i<c.d.length;i++){
            System.out.print("\t"+c.d[i]+"\t");
        }
    }
}
