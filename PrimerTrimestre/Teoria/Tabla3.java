package PrimerTrimestre.Teoria;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Tabla3 {

    public static void main(String[] args)
    {
        ArrayList<Integer> nota=new ArrayList<>();
        ArrayList<String> alumno=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String nombre;
        int numero,contador=0;

        System.out.println("Introduzca el nombre: ");
        nombre=sc.nextLine();

        while(!nombre.equalsIgnoreCase("Fin"))
        {
            System.out.println("Introduzca su nota: ");
            numero=Integer.parseInt(sc.nextLine());
            alumno.add(nombre);
            nota.add(numero);
            contador++;
            System.out.println("Introduzca el nombre: ");
            nombre=sc.nextLine();
        }
        for(int i=0;i<contador;i++)
        {
            System.out.println(alumno.get(i)+" "+nota.get(i));
        }
        sc.close();
    }
}
