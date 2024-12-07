package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad3 {
    public static void main(String[] args)
    {
        int n;
        int m;
        m=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un número: ");
        n=Integer.parseInt(sc.nextLine());

        while(n!=0)
        {
            System.out.println("introduzca un número: ");
            n=Integer.parseInt(sc.nextLine());
            m++;
        }
        System.out.println("Usted a metido "+m+" numeros");
        sc.close();
    }
}
