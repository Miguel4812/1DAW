package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Entrada1 {

    public static void main(String[] args)
    {
        String nombre;
        Scanner sc;

        sc = new Scanner(System.in);

        nombre = sc.nextLine();

        System.out.println("Su nombre es "+nombre);
        sc.close();
    }

}
