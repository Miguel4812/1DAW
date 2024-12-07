package SegundoTrimestre.Teoria;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Funciones3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;

        System.out.println("Dime un número: ");
        a=sc.nextInt();

        System.out.println("Dime un número: ");
        b=sc.nextInt();

        mostrarnumeros(a, b);
    }

    public static void mostrarnumeros(int a, int b )
    {
        for(int i=a;i<=b;i++)
            System.out.println(i);
    }
}
