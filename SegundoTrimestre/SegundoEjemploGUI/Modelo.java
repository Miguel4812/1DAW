package SegundoTrimestre.SegundoEjemploGUI;

@SuppressWarnings("SpellCheckingInspection")
public class Modelo
{
    private Alumno tAlumnos[];

    public Modelo()
    {
        this.tAlumnos = new Alumno[0];
    }

    public void anadeAlumno(Alumno alumno)
    {
        Alumno[] tAux = new Alumno[this.tAlumnos.length+1];
        for(int i=0;i<this.tAlumnos.length;i++)
            tAux[i] = this.tAlumnos[i];
        tAux[tAux.length-1] = alumno;
        this.tAlumnos = tAux;
    }
}
