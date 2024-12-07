package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad5 {
    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduca usted un número entero cualquiera: ");
        n=Integer.parseInt(sc.nextLine());

        if(n<=0)
        {
            for(i=1;i>=n;i--)
                System.out.println(i);
        }
        else
        {
            for(i=1;i<=n;i++)
                System.out.println(i);
        }
        sc.close();
    }
}
