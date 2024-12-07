package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad2 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        n=Integer.parseInt(sc.nextLine());

        while(n!=0)
        {
            if(n<0)
                System.out.println("Su número es negativo");
            else
                System.out.println("Su número es positivo");
            System.out.println("Introduzca un número entero: ");
            n=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Introduciste el 0.");
        sc.close();
    }
}
