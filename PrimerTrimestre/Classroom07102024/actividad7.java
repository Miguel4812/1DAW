package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad7 {
    public static void main(String[] args)
    {
        String contrasena;
        String osama ="osama";
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("Escriba usted la contraseña: ");
            contrasena=sc.nextLine();
        }
        while(!contrasena.equals(osama));
        System.out.println("Usted ya puede continuar");
        sc.close();
    }
}
