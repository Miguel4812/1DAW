package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad16 {

    public static void main(String[] args)
    {
        int edad,mayoresedad=0,mayoresaltura=0;
        float totalaltura=0,totaledad=0, altura;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=30;i++)
        {
            System.out.println("Introduzca la altura del alumno en metros: ");
            altura=Float.parseFloat(sc.nextLine());
            System.out.println("Introduzca la edad del alumno: ");
            edad=Integer.parseInt(sc.nextLine());

            totalaltura=totalaltura+altura;
            totaledad=totaledad+edad;

            if(edad>=18)
                mayoresedad++;
            if(altura>=1.8)
                mayoresaltura++;
        }
        System.out.println("La media de altura es: "+(totalaltura/30)+". Los más altos de 1,80 metos o iguales son: "+mayoresaltura);
        System.out.println("La media de edad es: "+(totaledad/30)+". Los mayores de edad son: "+mayoresedad);
        sc.close();
    }
}