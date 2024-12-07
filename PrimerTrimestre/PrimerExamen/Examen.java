package PrimerTrimestre.PrimerExamen;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String estado, estadoRepublicanosDemocratas="", estadoMenorParticipacion="", primerEstadoHabitantes="", segundoEstadoHabitantes="", terceroEstadoHabitantes="";
        long habitantes, votosDemocratas, votosRepublicanos, votosLibertarios=0, votosVerdes=0, votosVerdesTotal=0, totalVotos;
        Long PrimerMaxHabitantes=null, SegundoMaxHabitantes=null, TerceroMaxHabitantes=null;
        int contadorVerdes=0,estadosMasDemocratas=0;
        Float menorParticipacionMax=null;
        Long restoRepublicanosDemocratasMax=null;

        System.out.println("Introduzca el nombre del Estado: ");
        estado=sc.nextLine();

        //hacemos el bucle con la condicion de que si se escribe "fin" salga de este mismo
        while(!estado.equalsIgnoreCase("Fin"))
        {
            System.out.println("Introduzca el n�mero de habitantes: ");
            habitantes=Long.parseLong(sc.nextLine());

            System.out.println("Introduzca el n�mero de votos de el partido Democrata: ");
            votosDemocratas=Long.parseLong(sc.nextLine());

            System.out.println("Introduzca el n�mero de votos de el partido Republicano: ");
            votosRepublicanos=Long.parseLong(sc.nextLine());

            //comprobamos el numero de habitantes para preguntar o no los otros dos partidos
            if(habitantes>15000000)
            {
                System.out.println("Introduzca el n�mero de votos de el partido Libertario: ");
                votosLibertarios=Long.parseLong(sc.nextLine());

                System.out.println("Introduzca el n�mero de votos de el partido Verde: ");
                votosVerdes=Long.parseLong(sc.nextLine());

                votosVerdesTotal=votosVerdesTotal+votosVerdes;
                contadorVerdes++;
            }
            totalVotos=votosDemocratas+votosRepublicanos+votosLibertarios+votosVerdes;

            long restoRepublicanosDemocratas=votosRepublicanos-votosDemocratas;

            //en estos if guardo la diferencia maxima entre republicanos y democratas
            if(restoRepublicanosDemocratasMax==null)
            {
                restoRepublicanosDemocratasMax=restoRepublicanosDemocratas;
                estadoRepublicanosDemocratas=estado;
            }
            else if(restoRepublicanosDemocratas>restoRepublicanosDemocratasMax)
            {
                restoRepublicanosDemocratasMax=restoRepublicanosDemocratas;
                estadoRepublicanosDemocratas=estado;
            }

            float menorParticipacion=(float)totalVotos/habitantes;

            //guardo el estado con menor participacion
            if(menorParticipacionMax==null)
            {
                menorParticipacionMax=menorParticipacion;
                estadoMenorParticipacion=estado;
            }
            else if(menorParticipacion<menorParticipacionMax)
            {
                menorParticipacionMax=menorParticipacion;
                estadoMenorParticipacion=estado;
            }

            float votosDemocratasEstado=((float)votosDemocratas/totalVotos)*100;
            //numero de estados donde democratas son mas de 50%
            if(votosDemocratasEstado>=50)
                estadosMasDemocratas++;

            //guardamos el top 3 de habitantes
            if(PrimerMaxHabitantes==null||PrimerMaxHabitantes<habitantes)
            {
                TerceroMaxHabitantes=SegundoMaxHabitantes;
                terceroEstadoHabitantes=segundoEstadoHabitantes;
                SegundoMaxHabitantes=PrimerMaxHabitantes;
                segundoEstadoHabitantes=primerEstadoHabitantes;
                PrimerMaxHabitantes=habitantes;
                primerEstadoHabitantes=estado;
            }
            else if(SegundoMaxHabitantes==null||SegundoMaxHabitantes<habitantes)
            {
                TerceroMaxHabitantes=SegundoMaxHabitantes;
                terceroEstadoHabitantes=segundoEstadoHabitantes;
                SegundoMaxHabitantes=habitantes;
                segundoEstadoHabitantes=estado;
            }
            else if(TerceroMaxHabitantes==null||TerceroMaxHabitantes<habitantes)
            {
                TerceroMaxHabitantes=habitantes;
                terceroEstadoHabitantes=estado;
            }

            totalVotos=votosLibertarios=votosVerdes=0;

            System.out.println("Introduzca el nombre del Estado: ");
            estado=sc.nextLine();
        }
        long promedioVotosVerdes=votosVerdesTotal/contadorVerdes;

        //mostramos los apartados del examen
        System.out.println("Promedio de votos del partido verde: "+promedioVotosVerdes);
        System.out.println("Estado donde el Republicano ha sacado m�s votos de diferencia sobre el Dem�crata: "+"\n"+estadoRepublicanosDemocratas+
                " con una diferencia de "+restoRepublicanosDemocratasMax+" votos.");
        System.out.println("Estado con menor participaci�n: "+estadoMenorParticipacion+" con un "+menorParticipacionMax*100+"% de participaci�n.");
        System.out.println("N�mero de estados donde los Dem�cratas suponen m�s del 50% de votos: "+estadosMasDemocratas);
        System.out.println("Los tres estados con m�s habitantes son: "+primerEstadoHabitantes+","+segundoEstadoHabitantes+","+terceroEstadoHabitantes+".");
        sc.close();
    }
}
