package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad3 {

    public static void main(String[] args)
    {
        String nota1String;
        String nota2String;
        String nota3String;
        String nota4String;
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe la primera nota: ");
        nota1String= sc.nextLine();
        nota1= Float.parseFloat(nota1String);

        System.out.println("Escribe la segunda nota: ");
        nota2String= sc.nextLine();
        nota2= Float.parseFloat(nota2String);

        System.out.println("Escribe la tercera nota: ");
        nota3String= sc.nextLine();
        nota3= Float.parseFloat(nota3String);

        System.out.println("Escribe la cuarta nota: ");
        nota4String= sc.nextLine();
        nota4= Float.parseFloat(nota4String);


        System.out.println("Su media es: "+((nota1+nota2+nota3+nota4)/4));
    }

}
