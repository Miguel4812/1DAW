package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad1 {

    public static void main(String[] args)
    {
        String numero1String;
        String numero2String;
        int numero1;
        int numero2;
        Scanner sc= new Scanner (System.in);

        System.out.println("Escribe el primer numero: ");
        numero1String= sc.nextLine();
        numero1= Integer.parseInt(numero1String);

        System.out.println("Escribe el segundo numero: ");
        numero2String= sc.nextLine();
        numero2= Integer.parseInt(numero2String);

        System.out.println("La suma es: "+(numero1+numero2));

    }

}
