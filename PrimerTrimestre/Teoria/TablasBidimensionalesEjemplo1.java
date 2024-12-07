package PrimerTrimestre.Teoria;

public class TablasBidimensionalesEjemplo1 {
    public static void main(String[] args) {
        int[][] t=new int[3][7];

        t[2][4]=8;

        for(int fila=0;fila<3;fila++){
            for(int col=0;col<7;col++)
                System.out.print(" "+t[fila][col]);
            System.out.println(" ");
        }
    }
}