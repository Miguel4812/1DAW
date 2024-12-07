package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Tabla1 {

    public static final int TAMAÑO = 5;

    public static void main(String[] args)
    {
        String tabla[]=new String[TAMAÑO];
        Scanner sc=new Scanner(System.in);

        for(int i =0;i<TAMAÑO;i++)
        {
            System.out.println("Introduzca un nombre: ");
            tabla[i]=sc.nextLine();
        }
        for(int i=TAMAÑO-1;i>=0;i--)
            System.out.println(tabla[i]+"\n");
        sc.close();
    }
}
