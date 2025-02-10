package SegundoTrimestre.SegundoEjemploGUI;

@SuppressWarnings("SpellCheckingInspection")
public class Principal {

    private Modelo modelo;
    private Vista vista;
    public static void main(String[] args)
    {
        new Principal();
    }

    public Principal()
    {
        this.modelo = new Modelo();
        this.vista = new Vista(this);
    }
}