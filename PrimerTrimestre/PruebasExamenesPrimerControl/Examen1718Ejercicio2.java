package PrimerTrimestre.PruebasExamenesPrimerControl;

import javax.swing.JOptionPane;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1718Ejercicio2 {

    public static void main(String[] args)
    {
        int numero,numeroAnterior=-1,longitudSecuencia=0,secuenciaValida=0,longitudSecuenciaMax=0;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));

        while(numero>=0)
        {
            if(numero>numeroAnterior)
                longitudSecuencia++;
            else
            {
                if(longitudSecuencia>=3)
                    secuenciaValida++;

                if(longitudSecuencia>longitudSecuenciaMax)
                    longitudSecuenciaMax=longitudSecuencia;
                longitudSecuencia=1;
            }
            numeroAnterior=numero;

            numero=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));
        }
        if(longitudSecuencia>=3)
            secuenciaValida++;

        if(longitudSecuencia>longitudSecuenciaMax)
            longitudSecuenciaMax=longitudSecuencia;

        JOptionPane.showMessageDialog(null, "Número de secuencias crecientes de al menos 3 números: " + secuenciaValida);
        JOptionPane.showMessageDialog(null, "La mayor secuencia tenía " +longitudSecuenciaMax+ " números.");
    }
}
