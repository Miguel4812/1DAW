package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Introduzca un n�mero entero: ");
        n=Integer.parseInt(sc.nextLine());

        while(n>=0)
        {
            System.out.println("El cuadrado es: "+(n*n));
            System.out.println("Introduzca un n�mero entero: ");
            n=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Metiste un n�mero negativo");
        sc.close();
    }
}
