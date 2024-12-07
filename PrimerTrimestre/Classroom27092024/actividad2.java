package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad2 {

    public static void main(String[] args)
    {
        String alturaString;
        String baseString;
        float altura;
        float base;
        Scanner sc =new Scanner(System.in);

        System.out.println("Escribe la medida de la base de un triangulo en metros: ");
        baseString= sc.nextLine();
        base= Float.parseFloat(baseString);

        System.out.println("Escribe la medida de la altura del triangulo en metros: ");
        alturaString= sc.nextLine();
        altura= Float.parseFloat(alturaString);

        System.out.println("El area total del triangulo es: "+((altura*base)/2)+" "+"metros");
    }

}
