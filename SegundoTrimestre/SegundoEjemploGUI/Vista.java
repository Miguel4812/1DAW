package SegundoTrimestre.SegundoEjemploGUI;

import SegundoTrimestre.PrimeroEjemploGUI.Principal1;
import SegundoTrimestre.PrimeroEjemploGUI.VentanaPpal1;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection")
public class Vista
{
    private Principal controlador;
    private VentanaPpal ventanaPpal;

    public Vista(Principal controlador)
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e)
        {

        }

        this.controlador = controlador;
        this.ventanaPpal = new VentanaPpal();

        this.ventanaPpal.setVisible(true);
    }


}