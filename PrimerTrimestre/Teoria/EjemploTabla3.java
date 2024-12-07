package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class EjemploTabla3 {

    public static void main(String[] args)
    {
        //declaración y inicializacion
        int tNum[]= new int[12];
        Scanner sc=new Scanner(System.in);
        int valor=0,posicion=0;

        for (int i = 0; i < 4; i++)
        {
            System.out.println("Valor a introducir: ");
            valor = Integer.parseInt(sc.nextLine());
            System.out.println("Posicion: ");
            posicion = Integer.parseInt(sc.nextLine());
            tNum[posicion] = valor;
        }
        for(int n:tNum)
            System.out.println(n);
        sc.close();
    }
}
