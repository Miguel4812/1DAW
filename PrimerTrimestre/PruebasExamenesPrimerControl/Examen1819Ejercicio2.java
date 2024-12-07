package PrimerTrimestre.PruebasExamenesPrimerControl;

import javax.swing.JOptionPane;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1819Ejercicio2 {

    public static void main(String[]args)
    {
        String palabra;
        int vocales=0,a=0,e=0,i=0,o=0,u=0;

        while(true)
        {
            palabra=JOptionPane.showInputDialog("Escribe una palabra: ");

            if(palabra.equalsIgnoreCase("Fin"))
                break;

            for(int x=0;x<palabra.length();x++)
            {
                char actual= palabra.toLowerCase().charAt(x);

                switch (actual)
                {
                    case 'a':
                        a=1;
                        break;
                    case 'e':
                        e=1;
                        break;
                    case 'i':
                        i=1;
                        break;
                    case 'o':
                        o=1;
                        break;
                    case 'u':
                        u=1;
                        break;
                    default:
                        break;
                }
            }
            if((a+e+i+o+u)==5)
                vocales++;
            a=e=i=o=u=0;
        }
        JOptionPane.showMessageDialog(null,"Ha habido "+vocales+" palabras con las cinco vocales.");
    }
}
