package PrimerTrimestre.Trabajo;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Primero {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String frase;

        System.out.println("Introduzca la frase: ");
        frase=sc.nextLine();

        //elimina todo lo que no sea letras
        String[] palabras = frase.split("^\\p{L}+");//.split("\\s+"); esto es para usar delimitador los espacios

        String[] palabrasMasLargas=new String[3];

        palabrasMasLargas[0]=" ";
        palabrasMasLargas[1]=" ";
        palabrasMasLargas[2]=" ";

        for(String palabra: palabras)
        {
            if(palabra.length()>palabrasMasLargas[0].length())
            {
                palabrasMasLargas[2]=palabrasMasLargas[1];
                palabrasMasLargas[1]=palabrasMasLargas[0];
                palabrasMasLargas[0]=palabra;
            }
            else if(palabra.length()>palabrasMasLargas[1].length())
            {
                palabrasMasLargas[2]=palabrasMasLargas[1];
                palabrasMasLargas[1]=palabra;
            }
            else if(palabra.length()>palabrasMasLargas[2].length())
                palabrasMasLargas[2]=palabra;
        }

        System.out.println("Las tres palabras más largas son:");
        for(int i=0;i<palabrasMasLargas.length;i++)
            System.out.println((i+1)+" "+palabrasMasLargas[i]);
        sc.close();
    }
}
