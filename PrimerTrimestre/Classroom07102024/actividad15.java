package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad15 {

    public static void main(String[] args)
    {
        int sueldo,mayores=0;
        float total=0;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=50;i++)
        {
            System.out.println("Introduzca usted un sueldo: ");
            sueldo=Integer.parseInt(sc.nextLine());

            total=total+sueldo;

            if(sueldo>1500)
                mayores++;
        }
        System.out.println("La media de los sueldos es: "+(total/50)+". Los sueldos mayores de 1500 son: "+mayores);
        sc.close();
    }
}
