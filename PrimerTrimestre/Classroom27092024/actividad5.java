package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad5 {

    public static void main(String[] args)
    {
        String numero1String;
        String numero2String;
        int numero1;
        int numero2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el primer numero entero: ");
        numero1String= sc.nextLine();
        numero1= Integer.parseInt(numero1String);

        System.out.println("Escribe el segundo numero entero: ");
        numero2String= sc.nextLine();
        numero2= Integer.parseInt(numero2String);

        if(numero1%numero2 == 0)
        {
            System.out.println("Son multiplos los dos numeros.");
        }
        else if(numero2%numero1 == 0)
        {
            System.out.println("Son multiplos los dos numeros.");
        }
        else
        {
            System.out.println("No son multiplos los dos numeros.");
        }

    }

}
