package SegundoTrimestre.Teoria;

@SuppressWarnings("SpellCheckingInspection")
public class Funciones6 {
    public static void main(String[] args)
    {
        int[] tabla;
        tabla = new int[7];

        tabla[0]=3;
        tabla[1]=6;
        tabla[2]=2;
        tabla[3]=9;
        tabla[4]=8;
        tabla[5]=6;
        tabla[6]=2;

        func(tabla);
    }

    public static void func(int[] t)
    {
        for (int j : t)
        {
            System.out.println(j);
        }
    }
}
