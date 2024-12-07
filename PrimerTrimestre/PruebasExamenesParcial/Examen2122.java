package PrimerTrimestre.PruebasExamenesParcial;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection")
public class Examen2122 {
    public static final int MAX_ALUMNOS=20;
    public static final int MAX_CURSOS=15;


    public static void main(String[] args) {
        String[] tAlumnos=new String[MAX_ALUMNOS];
        String[] tCursos=new String[MAX_CURSOS];
        int[][] tNotas= new int[MAX_ALUMNOS][MAX_CURSOS];
        char opcion;
        String curso,alumno;
        boolean finalizar=false;
        int posCurso,posAlumno,nCursos=0,nAlumnos=0,nota;

        for(int fila=0;fila<MAX_ALUMNOS;fila++)
            for(int col=0;col<MAX_CURSOS;col++)
                tNotas[fila][col]=-1;

        do
        {
            opcion= JOptionPane.showInputDialog("1-Introducir la nota obtenida por un alumno en un curso.\n"+
                    "2-Listado de todos los datos introducidos.\n"+
                    "3-Listar los tres cursos con las menores medias.\n"+
                    "4-Mostrar cuántos alumnos hay con tres o más aprobados.\n"+
                    "5-Comprobar si hay dos cursos con el mismo número de alumnos.\n"+
                    "6-Fin").charAt(0);

            switch (opcion)
            {
                case '1':
                    curso=JOptionPane.showInputDialog("Introduzca el nombre del curso: ");

                    //Buscamos el curso
                    posCurso=buscar(tCursos,curso,nCursos);

                    if(posCurso==nCursos)
                    {
                        tCursos[posCurso]=curso;
                        nCursos++;
                    }

                    alumno=JOptionPane.showInputDialog("Introduzca el nombre del curso: ");

                    //Buscamos el alumno
                    posAlumno=buscar(tAlumnos,alumno,nAlumnos);

                    if(posAlumno==nAlumnos)
                    {
                        tAlumnos[posAlumno]=alumno;
                        nAlumnos++;
                    }

                    nota=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno: "));

                    tNotas[posAlumno][posCurso]=nota;

                    JOptionPane.showMessageDialog(null,"Dato almacenado.");

                    break;
                case '2':


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
    public static int buscar(String[] t, String elemento, int nElem)
    {
        int pos=0;
        while(pos<nElem&&!t[pos].equals(elemento))
            pos++;
        return pos;
    }
}