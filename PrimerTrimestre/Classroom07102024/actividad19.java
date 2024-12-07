package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad19 {

    public static void main(String[] args)
    {
        int numero, numeronegativo=0;
        Scanner sc=new Scanner(System.in);

        for(int i = 1 ;i<=30;i++)
        {
            System.out.println("Introduzca usted un número: ");
            numero=Integer.parseInt(sc.nextLine());

            if(numero<0)
                numeronegativo++;
        }
        System.out.println("La cantidad de numeros negativos introducidos es: "+numeronegativo);
        sc.close();
    }
}
