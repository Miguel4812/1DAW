package PrimerTrimestre.PruebasExamenesPrimerControl;

import javax.swing.JOptionPane;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1920Ejercicio2 {

    public static void main(String[] args)
    {
        int numero,numero2;
        boolean creciente=false,decreciente=false,iguales=false;

        numero2=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));

        numero=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));

        while(numero!=0)
        {
            if(numero>numero2)
                creciente=true;
            else if(numero<numero2)
                decreciente=true;
            else if(numero==numero2)
                iguales=true;
            numero2=numero;

            numero=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));
        }
        if(decreciente==true&&creciente==true)
            JOptionPane.showMessageDialog(null,"Los números estan desordenados.");
        else if(iguales==true&&decreciente==false&&creciente==false)
            JOptionPane.showMessageDialog(null,"Los números son iguales.");
        else if(decreciente==true)
            JOptionPane.showMessageDialog(null,"Los números estan en decreciente.");
        else
            JOptionPane.showMessageDialog(null,"Los números estan en creciente.");
    }
}
