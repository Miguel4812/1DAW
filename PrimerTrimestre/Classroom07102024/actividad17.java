package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad17 {

    public static void main(String[] args)
    {
        int sueldo,n,sueldomax;
        Scanner sc=new Scanner(System.in);

        System.out.println("¿Cuantos sueldos vas a introducir? ");
        n=Integer.parseInt(sc.nextLine());

        System.out.println("Introduzca un sueldo: ");
        sueldo=Integer.parseInt(sc.nextLine());

        sueldomax=sueldo;

        for(int i=1;i<=n-1;i++)
        {
            System.out.println("Introduzca un sueldo: ");
            sueldo=Integer.parseInt(sc.nextLine());

            if(sueldomax<sueldo)
                sueldomax=sueldo;
        }
        System.out.println("El sueldo mayor es: "+sueldomax);
        sc.close();
    }
}
