package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad7 {

    public static void main(String[] args)
    {
        String notaString;
        float nota;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escriba usted su nota exacta: ");
        notaString=sc.nextLine();
        nota = Float.parseFloat(notaString);

        if(nota<5)
        {
            System.out.println("Su nota es un insudiciente.");
        }
        else if(nota<6)
        {
            System.out.println("Su nota es un sudiciente.");
        }
        else if(nota<7)
        {
            System.out.println("Su nota es un bien.");
        }
        else if(nota<9)
        {
            System.out.println("Su nota es un notable.");
        }
        else
        {
            System.out.println("Su nota es un sobresaliente.");
        }
    }
}
