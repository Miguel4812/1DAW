package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Estructurada1 {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        String edadString;
        int edadint;

        System.out.println("Introduzca su edad: ");

        edadString = sc.nextLine();

        edadint= Integer.parseInt(edadString);

        if(edadint>=18)
        {
            System.out.println("Es usted mayor de edad");
        }
        sc.close();
    }
}
