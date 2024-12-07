package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad18 {

    public static void main(String[] args)
    {
        int edad,edadmax,edadmin;
        String nombre,nombremax,nombremin;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduzca la edad correspondiente: ");
        edad=Integer.parseInt(sc.nextLine());
        edadmax=edadmin=edad;
        nombremax=nombremin=nombre;

        for (int i=1;i<=14;i++)
        {
            System.out.println("Introduzca un nombre: ");
            nombre=sc.nextLine();
            System.out.println("Introduzca la edad correspondiente: ");
            edad=Integer.parseInt(sc.nextLine());

            if(edad>edadmax)
            {
                edadmax=edad;
                nombremax=nombre;
            }
            else if (edad==edadmax)
                nombremax=nombremax+","+nombre;
            else if(edad<edadmin)
            {
                edadmin=edad;
                nombremin=nombre;
            }
            else if(edad==edadmin)
                nombremin=nombremin+","+nombre;
        }
        sc.close();
        System.out.println("La edad maxima la tiene "+nombremax+" y su edad es: "+edadmax+".");
        System.out.println("La edad minima la tiene "+nombremin+" y su edad es: "+edadmin+".");
    }
}
