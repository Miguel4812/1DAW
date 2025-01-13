package SegundoTrimestre.ConstrolesAnteriores.TrenesPOO;

@SuppressWarnings("SpellCheckingInspection")
public class Maquinista {
    private String nombre;

    public Maquinista(String nombre)
    {
        this.nombre = nombre;
    }

    public String toString()
    {
        return this.nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }}