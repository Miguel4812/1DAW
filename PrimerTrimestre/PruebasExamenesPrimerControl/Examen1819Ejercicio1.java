package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1819Ejercicio1 {

    public static void main(String[] args)
    {
        String clase,tutor,alumno,claseAprovadoMax="",tutorMenosSuspensos="";
        int notaControl,notaExamenFinal,notaDeClase,aprovado=0,suspensos=0,claseMasAprovados=0,finalAprovado=0,notaControlAprovada=0;
        Float porcentajeMinSuspensos=null;
        Integer aprovadoMax=null;
        boolean notaControlAprovadaSeguida=false,mostrarNotaControlAprovadaSeguida=false;
        float notaGlobal,totalalumnos=0;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Introduzca el nombre de la clase: ");
            clase=sc.nextLine();

            if(clase.equalsIgnoreCase("Fin"))
                break;

            System.out.println("Introduzca el nombre del tutor: ");
            tutor=sc.nextLine();

            while(true)
            {
                System.out.println("Introduzca el nombre del alumno: ");
                alumno=sc.nextLine();

                if(alumno.equalsIgnoreCase("Fin"))
                    break;

                System.out.println("Introduzca la nota del control: ");
                notaControl=Integer.parseInt(sc.nextLine());

                //nota contol aprovada
                if(notaControl>=5&&notaControlAprovadaSeguida==false)
                    notaControlAprovada++;
                else
                    notaControlAprovadaSeguida=true;

                System.out.println("Introduzca la nota del examen final: ");
                notaExamenFinal=Integer.parseInt(sc.nextLine());

                //examen final aprovado
                if(notaExamenFinal>=5)
                    finalAprovado++;

                System.out.println("Introduzca la nota de clase: ");
                notaDeClase=Integer.parseInt(sc.nextLine());

                notaGlobal=(float)notaExamenFinal*(float)0.6+(float)notaControl*(float)0.3+(float)notaDeClase*(float)0.1;

                if(notaGlobal>=5)
                    aprovado++;
                else
                    suspensos++;
                totalalumnos++;
            }
            //Guardamos la clase con mas aprovados
            if(aprovadoMax==null)
            {
                aprovadoMax=aprovado;
                claseAprovadoMax=clase;
            }
            else if(aprovadoMax<aprovado)
            {
                aprovadoMax=aprovado;
                claseAprovadoMax=clase;
            }
            //porcentaje menor de suspensos
            float porcentajeSuspensos= ((float)suspensos/((float)aprovado+(float)suspensos))*100;
            if(porcentajeMinSuspensos==null)
            {
                porcentajeMinSuspensos=porcentajeSuspensos;
                tutorMenosSuspensos=tutor;
            }
            else if(porcentajeMinSuspensos>porcentajeSuspensos)
            {
                porcentajeMinSuspensos=porcentajeSuspensos;
                tutorMenosSuspensos=tutor;
            }
            //clases con mas aprovados que suspensos
            if(aprovado>suspensos)
                claseMasAprovados++;
            //clase con los 3 primeros alunmos de contro aprovados
            if(notaControlAprovada>=3)
                mostrarNotaControlAprovadaSeguida=true;
            //reinicio totales
            aprovado=0;
            suspensos=0;
            notaControlAprovadaSeguida=false;
            notaControlAprovada=0;
        }
        float porcentajeFinalAprovado=(finalAprovado/totalalumnos)*100;
        System.out.println("La clase con mayor número neto de aprobados es: "+claseAprovadoMax);
        System.out.println("El tutor de la clase con menor porcentaje de suspensos es "+tutorMenosSuspensos+" de: "+porcentajeMinSuspensos);
        System.out.println("El número de clases con más aprobados que suspensos es: "+claseMasAprovados);
        System.out.println("El porcentaje total de alumnos con el final aprobado de todo el centro es: "+porcentajeFinalAprovado);
        if(mostrarNotaControlAprovadaSeguida==true)
            System.out.println("Hay alguna clase donde los tres primeros alumnos introducidos tienen el control aprobado.");
        sc.close();
    }
}
