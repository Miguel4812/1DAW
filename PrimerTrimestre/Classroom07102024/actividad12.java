package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad12 {

    public static void main(String[] args)
    {
        int numero;
        long total;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero=Integer.parseInt(sc.nextLine());

        total=1;
        if (numero>=0)
        {
            for(int i=2;i<=numero;i++)
                total*=i;
            System.out.println("El factorial es: "+total);
        }
        else
            System.out.println("No exsiste factorial.");
        sc.close();
    }
}
