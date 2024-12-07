package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad9 {

    public static void main(String[] args)
    {
        String numeroString;
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero positivo entero: ");
        numeroString= sc.nextLine();

        System.out.println("El numero"+" "+numeroString+" "+"tiene"+" "+numeroString.length()+" "+"digitos.");
    }

}
