package SegundoTrimestre.PrimeroEjemploGUI;

@SuppressWarnings("SpellCheckingInspection")
public class Vista1
{
    private Principal1 controlador;
    private VentanaPpal1 ventanaPpal;
    public Vista1(Principal1 controlador)
    {
        this.controlador = controlador;
        this.ventanaPpal = new VentanaPpal1();

        this.ventanaPpal.setVisible(true);
    }


}