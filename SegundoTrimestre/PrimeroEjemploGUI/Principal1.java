package SegundoTrimestre.PrimeroEjemploGUI;

@SuppressWarnings("SpellCheckingInspection")
public class Principal1 {

    private Modelo1 modelo;
    private Vista1 vista;
    public static void main(String[] args)
    {
        new Principal1();
    }

    public Principal1()
    {
        this.modelo = new Modelo1();
        this.vista = new Vista1(this);
    }
}