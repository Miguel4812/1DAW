package SegundoTrimestre.Teoria;

@SuppressWarnings("SpellCheckingInspection")
public class Funciones5 {
    public static void main(String[] args) {
        int[] tDados=new int[6];

        for(int i=0;i<1000;i++)
        {
            tDados[tirardado()-1]++;
        }

        for(int i=0;i<6;i++)
        {
            System.out.println("El número "+(i+1)+" ha salido "+tDados[i]+" veces.");
        }
    }
    public static int tirardado()
    {
        return (int) (Math.random() * 6)+1;
    }
}