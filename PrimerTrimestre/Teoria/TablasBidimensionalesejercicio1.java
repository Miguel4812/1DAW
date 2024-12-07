package PrimerTrimestre.Teoria;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection")
public class TablasBidimensionalesejercicio1 {
    public static final int MAX_ALUM = 20;
    public static final int MAX_EXAMS = 5;

    public static void main(String[] args)
    {
        String[] tNombres = new String[MAX_ALUM];
        int[][] tNotas = new int[MAX_ALUM][MAX_EXAMS];
        char opción;
        boolean finalizar = false;
        String nombre="",listado="",empollon="";
        int pos,nElem = 0,nExam,acumNotas,contNotas;
        float mejorMedia=-1, mediaAlunmo;

        // inicializo la tabla a -1
        for(int col=0;col<MAX_EXAMS;col++)
            for(int fila =0;fila<MAX_ALUM ;fila++)
                tNotas[fila][col] = -1;

		/*
		for(int fila=0;fila<tNotas.length;fila++)
			Arrays.fill(tNotas[fila], -1);
		*/

        do
        {
            opción = JOptionPane.showInputDialog(
                    "1 - Introducir una (1) nota de un (1) alumno\n"
                            + "2 - Listar todo\n"
                            + "3 - Mostrar nota media de un alumno\n"
                            + "4 - Mostrar nota media de un examen\n"
                            + "5 - Mostrar el nombre del mejor alumno\n"
                            + "6 - Salir").charAt(0);

            switch(opción)
            {
                case '1':
                    // cada vez que se le da a la opcion 1 se introduce nombre,
                    // num de examen, y la nota de ese examen

                    nombre = JOptionPane.showInputDialog("Nombre: ");
                    // tengo que buscarlo, para saber si tengo
                    // que actualizar una nota de uno que ya esté o añadirlo
                    pos = 0;
                    while(pos<nElem && !nombre.equals(tNombres[pos]))
                        pos++;
                    // cuando salgo del while, o no está,
                    // o está en la posición pos.
                    nExam = Integer.parseInt(
                            JOptionPane.showInputDialog("Num Examen (0-4):"));

                    if(pos==nElem)  // si no está, lo añado
                    {
                        tNombres[nElem] = nombre;
                        nElem++;
                    }
                    // Ahora sí está, lo tengo en la fila pos

                    tNotas[pos][nExam]=Integer.parseInt(
                            JOptionPane.showInputDialog("Nota: "));

                    break;
                case '2':
                    listado= "";

                    for(int fila=0;fila<nElem;fila++)
                    {
                        listado+=(tNombres[fila]);

                        for(int col=0;col<MAX_EXAMS;col++)
                        {
                            listado+=" Ex."+col+": ";
                            if(tNotas[fila][col]>-1)
                                listado+=tNotas[fila][col]+"   ";
                            else
                                listado+=" - ";
                        }

                        listado+="\n";

                    }
                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '3':
                    nombre = JOptionPane.showInputDialog("Nombre: ");

                    //Busco al alumno en la lista
                    pos=0;
                    while(pos<nElem && !nombre.equals(tNombres[pos]))
                        pos++;
                    //si pos = nElem significa que no lo encontro
                    if(pos==nElem)
                        JOptionPane.showMessageDialog(null,"No se a encontrado ese alumno.");
                    else
                    {
                        acumNotas=0;
                        contNotas=0;

                        for(int i=0;i<MAX_EXAMS;i++)
                        {
                            if(tNotas[pos][i]!=-1)
                            {
                                acumNotas+=tNotas[pos][i];
                                contNotas++;
                            }
                        }
                        JOptionPane.showMessageDialog(null,"La media "+nombre+" es: "+((float)acumNotas/contNotas));
                    }
                    break;
                case '4':
                    nExam = Integer.parseInt(
                            JOptionPane.showInputDialog("Num Examen (0-4):"));

                    acumNotas=0;
                    contNotas=0;

                    for(int i=0;i<nElem;i++)
                    {
                        if(tNotas[i][nExam]!=-1)
                        {
                            acumNotas+=tNotas[i][nExam];
                            contNotas++;
                        }
                    }

                    JOptionPane.showMessageDialog(null,"La nota media del examen "+nExam+" es "+((float)acumNotas/contNotas));

                    break;
                case '5':

                    for(int fila=0;fila<nElem;fila++)
                    {
                        acumNotas=0;
                        contNotas=0;

                        for(int col=0;col<MAX_EXAMS;col++)
                        {
                            if(tNotas[fila][col]!=-1)
                            {
                                acumNotas+=tNotas[fila][col];
                                contNotas++;
                            }
                        }
                        mediaAlunmo=(float)acumNotas/contNotas;
                        if(mejorMedia<mediaAlunmo)
                        {
                            mejorMedia=mediaAlunmo;
                            empollon=tNombres[fila];
                        }
                    }

                    JOptionPane.showMessageDialog(null,"El alumno con mejor media es "+empollon);

                    break;
                case '6':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
        while(!finalizar);
    }
}