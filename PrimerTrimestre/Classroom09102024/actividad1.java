package PrimerTrimestre.Classroom09102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad1 {

    public static void main(String[] args)
    {
        int numeroalumnos=0;
        float nota1=-1,nota2=-1,nota3=-1,media=0,mediamax=0,alumnossuspensos=0,alumnossobre=0;
        String nombre,curso="",nombremax="";
        Scanner sc=new Scanner(System.in);

        while (!curso.equals("A")|!curso.equals("B")|!curso.equals("C")|!curso.equals("D"))
        {
            System.out.print("Introduzca la clase: ");
            curso = sc.nextLine();
            if (curso.equalsIgnoreCase("A")|curso.equalsIgnoreCase("B")|curso.equalsIgnoreCase("C")|curso.equalsIgnoreCase("D"))
                break;
        }

        numeroalumnos=25;
        if(curso.equals("B"))
            numeroalumnos=28;
        else if(curso.equals("C"))
            numeroalumnos=31;
        else if(curso.equals("D"))
            numeroalumnos=29;
        for(int i=1;i<=numeroalumnos;i++)
        {
            System.out.println("Introduzca el nombre del alumno: ");
            nombre=sc.nextLine();

            while(nota1<0||nota2<0||nota3<0)
            {
                System.out.println("La nota son erroneas. Ponlas de nuevo: ");

                System.out.println("Introduzca la nota del primer parcial: ");
                nota1=Integer.parseInt(sc.nextLine());

                System.out.println("Introduzca la nota del segundo parcial: ");
                nota2=Integer.parseInt(sc.nextLine());

                System.out.println("Introduzca la nota del tercer parcial: ");
                nota3=Integer.parseInt(sc.nextLine());
            }
            media=(nota1+nota2+nota3)/3;

            if(media>mediamax)
            {
                mediamax=media;
                nombremax=nombre;
            }
            else if (media==mediamax)
            {
                nombremax=nombremax+","+nombre;
                mediamax=media;
            }
            if(media<5)
                alumnossuspensos++;
            else if(media>=9)
                alumnossobre++;
        }
        System.out.println("El/Los alumons con mayor nota media son "+nombremax+" y su nota media es: "+ mediamax);
        System.out.println("El/Los alumons suspensos son: "+alumnossuspensos);
        if(alumnossobre>0)
            System.out.println("Existen sobresalientes");
        sc.close();
    }
}
