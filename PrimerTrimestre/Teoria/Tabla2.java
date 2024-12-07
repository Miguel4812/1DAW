package PrimerTrimestre.Teoria;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Tabla2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> tabla= new ArrayList<>();
        int numero;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        numero=Integer.parseInt(sc.nextLine());

        while(numero!=0)
        {
            tabla.add(numero);
            System.out.println("Introduzca un numero: ");
            numero=Integer.parseInt(sc.nextLine());
        }
        for(int i: tabla)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
