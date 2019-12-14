public class Level5 {
    public static void main(String[] args) {
int [][]a=new int[10][10];
int i,j;
for (i=1;i<a.length;i++){
    for (j=1;j<=i;j++){
        a[i][j]=i*j;
        System.out.print(i+"*"+j+"="+a[i][j]+"\t");
    }
    System.out.println();
}
    }
}
