public class level5 {

    public static void main(String[] args){
        int[][] a = new int[9][9];
        for(int i = 0;i<a.length;i++){
            for (int j = 0;j<(i+1);j++){
                System.out.print((j+1)+"*"+(i+1)+"="+(i+1)*(j+1)+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}