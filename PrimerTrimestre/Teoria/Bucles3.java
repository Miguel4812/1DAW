package PrimerTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Bucles3 {

    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        n=Integer.parseInt(sc.nextLine());

        while(n!=0)
        {
            System.out.println("Introduzca un número: ");
            n=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Introduciste el 0.");
        sc.close();
    }
}
