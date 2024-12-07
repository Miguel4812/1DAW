package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Entrada2 {

    public static void main(String[] args)
    {
        String nombre;
        String apellido1;
        String apellido2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        nombre= sc.nextLine();

        System.out.println("Introduzca su primer apellido: ");
        apellido1= sc.nextLine();

        System.out.println("Introduzca su segundo apellido: ");
        apellido2= sc.nextLine();

        System.out.println("Su nombre completo es: "+nombre+" "+apellido1+" "+apellido2);
        sc.close();
    }

}
