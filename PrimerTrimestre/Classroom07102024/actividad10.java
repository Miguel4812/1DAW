package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad10 {
    public static void main(String[] args)
    {
    int numero, total;
    Scanner sc=new Scanner(System.in);
    total=0;

    System.out.println("Introduzca un número: ");
    numero=Integer.parseInt(sc.nextLine());

    total=total+numero;

    while(numero!=0)
    {
        System.out.println("Introduzca un número: ");
        numero=Integer.parseInt(sc.nextLine());

        total=total+numero;
    }
    System.out.println("La suma de todos los numeros es: "+total);
    sc.close();
    }
}
