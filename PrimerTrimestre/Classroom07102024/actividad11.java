package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad11 {

    public static void main(String[] args)
    {
        int numero, intentos;
        float total;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero=Integer.parseInt(sc.nextLine());

        intentos=1;
        total=0;
        total=total+numero;

        while(numero>=0)
        {
            intentos++;
            System.out.println("Introduzca un número: ");
            numero=Integer.parseInt(sc.nextLine());

            if(numero<0)
                numero=-1;
            else
                total=total+numero;
        }
        System.out.println("La media de los numeros es: "+(total/intentos));
        sc.close();
    }
}
