package PrimerTrimestre.PruebasExamenesParcial;

import javax.swing.*;
import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1920{
    public static final int MAX_EQUIPOS=20;

    public static void main(String[] args) {
        String[] tEquipos=new String[MAX_EQUIPOS];
        int[][][] tGoles=new int[MAX_EQUIPOS][MAX_EQUIPOS][2];
        int[] tPuntos=new int[MAX_EQUIPOS];
        char opcion;
        boolean finalizar=false;
        String equipoLocal,equipoVisitante,listado="",equipoGanador="",equipoABuscar;
        int posLocal, nEquipos=0, posVisitante,golesLocal=0,golesVisitante=0,posMejor,partidos=0,derrotasLocal=0,posABuscar=0;
        float porcentajePerdidaLocal=0;

        for(int profundidad=0;profundidad<2;profundidad++)
            for(int fila=0;fila<MAX_EQUIPOS;fila++)
                for(int col=0;col<MAX_EQUIPOS;col++)
                    tGoles[fila][col][profundidad]=-1;

        do
        {
            opcion= JOptionPane.showInputDialog("1-Introducir resultado de un partido.\n"
                    +"2-Mostrar todos los partidos introducidos.\n"
                    +"3-Mostrar el equipo ganador de la liga.\n"
                    +"4-Mostrar el porcentaje de partidos en los que perdió el equipo local.\n"
                    +"5-Introducir nombre de equipo y mostrar los resultados de todos sus partidos.\n"
                    +"6-Finalizar.").charAt(0);

            switch (opcion)
            {
                case '1':
                    equipoLocal=JOptionPane.showInputDialog("Equipo local: ");

                    //Buscamos el equipo local
                    posLocal=0;
                    while(posLocal<nEquipos&&!tEquipos[posLocal].equals(equipoLocal))
                        posLocal++;
                    if (posLocal==nEquipos)
                    {
                        tEquipos[posLocal]=equipoLocal;
                        nEquipos++;
                    }
                    equipoVisitante=JOptionPane.showInputDialog("Equipo local: ");

                    //Buscamos el equipo visitante
                    posVisitante=0;
                    while(posVisitante<nEquipos&&!tEquipos[posVisitante].equals(equipoVisitante))
                        posVisitante++;
                    if (posVisitante==nEquipos)
                    {
                        tEquipos[posVisitante]=equipoVisitante;
                        nEquipos++;
                    }
                    //Gusrdamos todos los goles
                    golesLocal=Integer.parseInt(JOptionPane.showInputDialog("Goles local: "));
                    tGoles[posLocal][posVisitante][0]=golesLocal;

                    golesVisitante=Integer.parseInt(JOptionPane.showInputDialog("Goles visitante: "));
                    tGoles[posLocal][posVisitante][1]=golesVisitante;

                    JOptionPane.showMessageDialog(null,"Partido correctamente almacenado.");

                    break;
                case '2':
                    listado="";

                    for(int fila=0;fila<nEquipos;fila++)
                        for(int col=0;col<nEquipos;col++)
                        {
                            if(tGoles[fila][col][0]!=-1)
                                listado+=tEquipos[fila]+"-"+tEquipos[col]+" ("+tGoles[fila][col][0]+"-"+tGoles[fila][col][1]+")\n";
                        }

                    JOptionPane.showMessageDialog(null,listado);

                    break;
                case '3':
                    //relleno la tabla a 0
                    Arrays.fill(tPuntos, 0);

                    for(int fila=0;fila<nEquipos;fila++)
                        for(int col=0;col<nEquipos;col++)
                        {
                            if(tGoles[fila][col][0]>tGoles[fila][col][1])
                                tPuntos[fila]+=3;
                            else if(tGoles[fila][col][1]>tGoles[fila][col][0])
                                tPuntos[col]+=3;
                            else if(tGoles[fila][col][0]!=-1)
                            {
                                tPuntos[fila]+=1;
                                tPuntos[col]+=1;
                            }
                        }
                    posMejor=0;
                    for(int pos=0;pos<nEquipos;pos++)
                    {
                        if(tPuntos[pos]>tPuntos[posMejor])
                           posMejor=pos;
                    }

                    JOptionPane.showMessageDialog(null,"El equipo ganador de la liga es: "
                            +tEquipos[posMejor]+" con "+tPuntos[posMejor]+" puntos.");

                    break;
                case '4':
                    for(int fila=0;fila<nEquipos;fila++)
                        for(int col=0;col<nEquipos;col++)
                        {
                            if(tGoles[fila][col][0]!=-1)
                            {
                                partidos++;
                                if (tGoles[fila][col][1] > tGoles[fila][col][0])
                                {
                                    derrotasLocal++;
                                }
                            }
                        }

                    porcentajePerdidaLocal=((float) derrotasLocal/partidos)*100;

                    JOptionPane.showMessageDialog(null,"El porcentaje de perdida de los equipos locales son: "+porcentajePerdidaLocal);

                    break;
                case '5':
                    posABuscar=0;
                    listado="";

                    equipoABuscar=JOptionPane.showInputDialog("Introduce el equipo a buscar: ");

                    while(posABuscar<nEquipos&&!tEquipos[posABuscar].equals(equipoABuscar))
                        posABuscar++;
                    if(posABuscar<nEquipos)
                    {
                        listado += "Como local a jugdo con:\n";

                        for (int col = 0; col < nEquipos; col++)
                        {
                            if (tGoles[posABuscar][col][0]!=-1)
                                listado+=tEquipos[col]+"\n";
                        }
                        listado+="\n Como visitante a jugado con: \n";

                        for(int fila=0;fila<nEquipos;fila++)
                        {
                            if(tGoles[fila][posABuscar][0]!=-1)
                                listado+=tEquipos[fila]+"\n";
                        }
                        JOptionPane.showMessageDialog(null,listado);
                    }

                    else
                        JOptionPane.showMessageDialog(null,"Ese equipo no se encontro.");

                    break;
                case '6':
                    finalizar=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no valida.");
            }
        }
        while(!finalizar);
    }
}