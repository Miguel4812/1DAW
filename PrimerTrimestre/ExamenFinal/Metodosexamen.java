package PrimerTrimestre.ExamenFinal;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection")
public class Metodosexamen {

    public static void main(String[] args)
    {
        String[][] tFrutras= new String[0][0];
        String[] tAlmacenes= new String[0];
        float[][] tToneladasPedidos= new float[0][0];
        int[][] tPosicionCodigoPedidos = new int[0][0];

        char opcion;
        boolean finalizar=false;
        String codigoFruta,codigoAlmacen,listado;
        float toneladas;
        int posAlmacen,posFruta;

        do
        {
            opcion= JOptionPane.showInputDialog("1-Introducir un producto.\n"+
                    "2-Introducir datos de un envío.\n"+
                    "3-Listar todo\n"+
                    "4-Mostrar el nombre del producto del que se ha enviado más cantidad en un sólo envío.\n"+
                    "5-Mostrar la cantidad media de los tres últimos envíos a cada almacén con al menos tres envíos.\n"+
                    "6-Fin").charAt(0);

            switch (opcion)
            {
                case '1':
                    tFrutras=PedirCodigoFrutaYAñadirlo(tFrutras);
                    break;
                case '2':
                    codigoFruta=PedircodigoFruta();
                    posFruta=buscarStringCodigoFruta(tFrutras,codigoFruta);
                    if(posFruta==tFrutras.length)
                    {
                        JOptionPane.showMessageDialog(null, "Ese codigo de fruta no exixte.");
                    }
                    else
                    {
                        toneladas=Float.parseFloat(JOptionPane.showInputDialog("Numero de toneladads del pedido: "));

                        codigoAlmacen=JOptionPane.showInputDialog("Introduzca el codigo del almacen: ");

                        posAlmacen=buscarString(tAlmacenes,codigoAlmacen);

                        if(posAlmacen==tAlmacenes.length)
                            tAlmacenes=AñadeString1Dimension(tAlmacenes,codigoAlmacen);

                        tToneladasPedidos=AñadeFloat2Dimensiones(tToneladasPedidos,posAlmacen,toneladas);

                        tPosicionCodigoPedidos=AñadeInt2Dimensiones(tPosicionCodigoPedidos,posFruta,posAlmacen);
                    }
                    break;
                case '3':
                    listado=Listado(tFrutras,tAlmacenes,tToneladasPedidos,tPosicionCodigoPedidos);
                    JOptionPane.showMessageDialog(null,listado);
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    finalizar=true;
                    break;
            }
        }
        while(!finalizar);
    }

    public static String Listado(String[][] tFrutras, String[] tAlmacenes, float[][] tToneladasPedidos, int[][] tPosicionCodigoPedidos)
    {
        String listado= "";
        for(int i=0;i<tAlmacenes.length;i++)
        {
            listado=listado+"Almacen: "+tAlmacenes[i]+"\n";
            for(int j=0;j<tToneladasPedidos[i].length;j++)
            {
                listado=listado+"Producto "+tFrutras[tPosicionCodigoPedidos[i][j]][0]+" "+tFrutras[tPosicionCodigoPedidos[i][j]][1]+": "+tToneladasPedidos[i][j]+"\n";
            }
        }
        return listado;
    }
    public static int saberMaxInt(int[][] tPosicionCodigoPedidos)
    {
        int max=0;
        for(int i=0;i<tPosicionCodigoPedidos.length;i++)
        {
            int contador=0;
            for(int j=0;j<tPosicionCodigoPedidos[i].length;j++)
            {
                contador++;
            }
            if(contador>=max)
                max=contador;
        }
        return max;
    }
    public static int saberMaxFloat(float[][] tToneladasPedidos)
    {
        int max=0;
        for(int i=0;i<tToneladasPedidos.length;i++)
        {
            int contador=0;
            for(int j=0;j<tToneladasPedidos[i].length;j++)
            {
                contador++;
            }
            if(contador>=max)
                max=contador;
        }
        return max;
    }
    public static int[][] AñadeInt2Dimensiones(int[][] tPosicionCodigoPedidos, int posicionFruta, int posAlmacen)
    {
        int max= saberMaxInt(tPosicionCodigoPedidos);
        int[][] nueva;
        if(max==tPosicionCodigoPedidos[posAlmacen].length)
        {
            nueva = new int[tPosicionCodigoPedidos.length][max + 1];
        }
        else
            nueva=new int[tPosicionCodigoPedidos.length][max];
        for (int i=0;i<tPosicionCodigoPedidos.length;i++)
        {
            for(int j=0;j<tPosicionCodigoPedidos[i].length;j++)
            {
                nueva[i][j]=tPosicionCodigoPedidos[i][j];
            }
        }
        nueva[posAlmacen][max]= posicionFruta;
        return nueva;
    }
    public static float[][] AñadeFloat2Dimensiones(float[][] tToneladasPedidos, int posAlmacen, float toneladas)
    {
        int max= saberMaxFloat(tToneladasPedidos);
        float [][] nueva;
        if(max==tToneladasPedidos[posAlmacen].length)
        {
            nueva = new float[tToneladasPedidos.length][max + 1];
        }
        else
            nueva=new float[tToneladasPedidos.length][max];
        for (int i=0;i<tToneladasPedidos.length;i++)
        {
            for(int j=0;j<tToneladasPedidos[i].length;j++)
            {
                nueva[i][j]=tToneladasPedidos[i][j];
            }
        }
        nueva[posAlmacen][max]=toneladas;
        return nueva;
    }
    public static String[][] PedirCodigoFrutaYAñadirlo(String[][]tabla)
    {
        String codigoFruta=PedircodigoFruta();
        int posFruta= buscarStringCodigoFruta(tabla,codigoFruta);
        if(posFruta==tabla.length)
        {
            String nombreFruta=JOptionPane.showInputDialog("Introduzca el nombre de la fruta: ");
            tabla=AñadeString2Dimensiones(tabla,codigoFruta,nombreFruta);
        }
        else
            JOptionPane.showMessageDialog(null, "Ese codigo de fruta ya exixte.");
        return tabla;
    }
    public static int buscarStringCodigoFruta(String[][] t, String elemento)
    {
        int pos=0;
        while(pos<t.length&&!t[pos][0].equals(elemento))
            pos++;
        return pos;
    }
    public static int buscarString(String[] t, String elemento)
    {
        int pos=0;
        while(pos<t.length&&!t[pos].equals(elemento))
            pos++;
        return pos;
    }
    public static String[][] AñadeString2Dimensiones(String[][] tabla, String elemento1, String elemento2)
    {
        String[][] nueva=new String[tabla.length+1][2];
        for(int i=0;i<tabla.length;i++)
        {
            nueva[i][0]=tabla[i][0];
            nueva[i][1]=tabla[i][1];
        }
        nueva[tabla.length][0]=elemento1;
        nueva[tabla.length][1]=elemento2;
        return nueva;
    }
    public static String PedircodigoFruta()
    {
        String codigoFruta=JOptionPane.showInputDialog("Introduzca el codigo de la fruta: ");
        return codigoFruta;
    }
    public static String[] AñadeString1Dimension(String[]t, String elemento)
    {
        String[] nueva=new String[t.length+1];
        for(int i=0;i<t.length;i++)
            nueva[i]=t[i];
        nueva[t.length]=elemento;
        return nueva;
    }
}
