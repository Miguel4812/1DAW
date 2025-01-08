package PrimerTrimestre.ExamenFinal;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("SpellCheckingInspection")
public class MetodosExamen2 {
    public static final int MAX_FRU = 30;
    public static void main(String[] args)
    {
        String tFru[][] = new String[MAX_FRU][2];
        int nFru = 0;

        boolean finalizar = false;
        int opcion;

        do
        {
            opcion = menu();
            switch(opcion)
            {
                case 1:
                    boolean res = altaFruta(tFru,nFru);
                    if(res==true)
                        nFru++;

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        }
        while(!finalizar);



    }

    private static boolean altaFruta(String[][] tFru, int nFru)
    {
        String codFru;
        String nomFru;

        codFru = leeCad("Código de la fruta: ");
        int pos = 0;
        while(pos<nFru && !codFru.equals(tFru[pos][0]))
            pos++;
        if(pos == nFru)
        {
            // añadir
            nomFru = leeCad("Nombre de la fruta: ");
            return true;
        }
        else
        {
            error("Esa fruta ya existe.");
            return false;
        }
    }

    private static void error(String msg)
    {
        JOptionPane.showMessageDialog(null, "Error");
    }

    private static String leeCad(String msg)
    {
        String res="";
        res = JOptionPane.showInputDialog(msg);
        return res;
    }

    private static int menu()
    {
        int n;
        try
        {
            n = Integer.parseInt(
                    leeCad(""
                            + "1 - Introducir un producto. \n" +
                            "2 - Introducir datos de un envío. \n" +
                            "3 - Listar todo. \n" +
                            "4 - Mostrar el nombre del producto del que se ha enviado más cantidad en \n" +
                            "    un sólo envío. \n" +
                            "5 - Mostrar la cantidad media de los tres últimos envíos a cada almacén \n" +
                            "    con al menos tres envíos. \n" +
                            "6 - Fin. "));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No es un número");
            n=menu();
        }

        return n;
    }
}
