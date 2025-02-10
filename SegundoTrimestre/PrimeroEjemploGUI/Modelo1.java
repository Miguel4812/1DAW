package SegundoTrimestre.PrimeroEjemploGUI;

@SuppressWarnings("SpellCheckingInspection")
public class Modelo1
{
    private Alumno1 tAlumnos[];

    public Modelo1()
    {
        this.tAlumnos = new Alumno1[0];
    }

    public void anadeAlumno(Alumno1 alumno)
    {
        Alumno1[] tAux = new Alumno1[this.tAlumnos.length+1];
        for(int i=0;i<this.tAlumnos.length;i++)
            tAux[i] = this.tAlumnos[i];
        tAux[tAux.length-1] = alumno;
        this.tAlumnos = tAux;
    }
}
