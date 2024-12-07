package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1718Ejercicio1 {

    public static void main(String[] args)
    {
        String nombreEquipo,nombreJugador,nombreFichaMax="",nombreRendimientoMax="";
        int puntos,jugadores,jugadoresF=0,penaltisEncajados,golesMarcados,jugadoresL=0,jugadoresP=0;
        float totalEdadF=0;
        Float precioFichaMax=null,mediaRendimientoMax=null;
        char posicion;
        boolean equipoMalo=false;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Introduzca el nombre del equipo: ");
            nombreEquipo=sc.nextLine();

            if(nombreEquipo.equalsIgnoreCase("Fin"))
                break;

            System.out.println("Introduzca el número de puntos: ");
            puntos=Integer.parseInt(sc.nextLine());

            System.out.println("Introduzca el número de jugadores: ");
            jugadores=Integer.parseInt(sc.nextLine());

            for(int i=0;i<jugadores;i++)
            {
                System.out.println("Introduzca el nombre del jugador: ");
                nombreJugador=sc.nextLine();

                System.out.println("Introduzca la edad del jugador: ");
                int edadJugador=Integer.parseInt(sc.nextLine());

                System.out.println("Introduzca el precio de su ficha: ");
                float precioFicha=Float.parseFloat(sc.nextLine());

                System.out.println("Introduzca en que posición juega: ");
                posicion=(sc.nextLine()).charAt(0);

                if(posicion=='P')
                {
                    jugadoresP++;
                    System.out.println("Introduzca los penaltis encajados: ");
                    penaltisEncajados=Integer.parseInt(sc.nextLine());
                }
                else if(posicion=='D')
                {
                    System.out.println("Introduzca los goles marcados: ");
                    golesMarcados=Integer.parseInt(sc.nextLine());
                }
                else if(posicion=='F')
                {
                    jugadoresF++;
                    totalEdadF=totalEdadF+edadJugador;
                }
                else
                    jugadoresL++;

                if(jugadores<7)
                {
                    if(precioFichaMax==null)
                    {
                        precioFichaMax=precioFicha;
                        nombreFichaMax=nombreJugador;
                    }
                    if(precioFichaMax<precioFicha)
                    {
                        precioFichaMax=precioFicha;
                        nombreFichaMax=nombreJugador;
                    }
                }
            }
            if(jugadoresL==0&&jugadoresP==0)
                equipoMalo=true;
            float mediaRendimiento=puntos/jugadores;
            if(mediaRendimientoMax==null)
            {
                mediaRendimientoMax=mediaRendimiento;
                nombreRendimientoMax=nombreEquipo;
            }
            if(mediaRendimientoMax<mediaRendimiento)
            {
                mediaRendimientoMax=mediaRendimiento;
                nombreRendimientoMax=nombreEquipo;
            }
            jugadoresL=0;
            jugadoresP=0;
        }
        float mediaEdadF=totalEdadF/jugadoresF;
        System.out.println("Media de edad de todos los defensas: "+mediaEdadF);
        System.out.println("Jugador con la ficha más cara de equipos de menos de 7 jugadores: "+nombreFichaMax);
        System.out.println("Equipo con mejor rendimiento: "+nombreRendimientoMax);
        if(equipoMalo==false)
            System.out.println("No hay equipos que no tengan portero ni laterales.");
        else
            System.out.println("Hay equipos que no tienen portero ni laterales.");
        sc.close();
    }
}
