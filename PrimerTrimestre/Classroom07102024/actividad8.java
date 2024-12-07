package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad8 {
    public static void main(String[] args)
    {
        int total, numero, intentos;
        Scanner sc=new Scanner(System.in);

        total=0;
        intentos=1;

        System.out.println("Introduzca un número: ");
        numero=Integer.parseInt(sc.nextLine());
        total=total+numero;

        while(intentos!=15)
        {
            intentos++;
            System.out.println("Introduzca un número: ");
            numero=Integer.parseInt(sc.nextLine());
            total=total+numero;
        }
        sc.close();
        System.out.println("La suma total es: "+total);
    }
}
