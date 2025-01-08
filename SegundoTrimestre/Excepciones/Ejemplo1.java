package SegundoTrimestre.Excepciones;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []t=new int[5];
        int pos;

        System.out.println("Introduzca la posición ");
        pos=Integer.parseInt(sc.nextLine());

        try {
            t[pos]=10;
        } catch (Exception e) {
            System.out.println("Posicion fuera de rango");
        }
        System.out.println(Arrays.toString(t));
    }
}
