package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Entrada3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String edadstring;
        int edadint;

        System.out.println("Introduzca su edad: ");
        edadstring=sc.nextLine();

        edadint = Integer.parseInt(edadstring);

        System.out.println("El proximo año tendra: "+(++edadint));
        sc.close();
    }
}
