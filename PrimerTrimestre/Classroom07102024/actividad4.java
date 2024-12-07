package PrimerTrimestre.Classroom07102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad4 {
    public static void main(String[] args)
    {
        int num;
        int secreto;
        int intentos =0;
        secreto=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);

        System.out.println("Intente adivinar el número secreto: ");
        num=Integer.parseInt(sc.nextLine());


        while(num!=secreto && intentos<5)
        {
            intentos++;
            if(num<secreto)
                System.out.println("secreto es mayor.");
            else
                System.out.println("secreto es menor.");
            System.out.println("Intente adivinar el número secreto otra vez: ");
            num=Integer.parseInt(sc.nextLine());
        }
        if(intentos==5)
            System.out.println("Fallaste");
        else
            System.out.println("Acertaste"+secreto);
        sc.close();
    }
}
