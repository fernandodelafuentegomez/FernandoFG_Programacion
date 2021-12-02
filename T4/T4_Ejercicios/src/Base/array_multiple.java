package Base;

public class array_multiple {

    public static void main(String[] args) {
        int[][] t1 = {{1,2,3},{4,5,6}};
        System.out.println(t1[0][0]);
        System.out.println(t1[0][0]);
        for (int i=0;i<t1.length;i++){
            System.out.println();
            for (int j = 0; j<t1[i].length;j++){
                System.out.printf("Elemento del array %d",t1[i][j]);
                System.out.println();
            }
        }
    }


}
