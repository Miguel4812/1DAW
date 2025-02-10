package SegundoTrimestre.PrimeroEjemploGUI;

import javax.swing.*;
import java.awt.*;

public class VentanaPpal1 extends JFrame
{
    public VentanaPpal1()
    {
        this.setTitle("Primero Ejemplo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        JButton boton = new JButton("Hola Mundo");
        this.getContentPane().add(boton);
    }
}