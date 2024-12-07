package PrimerTrimestre.ExamenFinal;

import javax.swing.*;

@SuppressWarnings("SpellCheckingInspection")
public class MiguelJimenezLopez
{

    public static final int MAX_FRUTAS=30;
    public static final int MAX_ALMACENES=15;
    public static final int MAX_ENVIOS=20;
    public static void main(String[] args)
    {
        String[] tCodigoFrutras= new String[MAX_FRUTAS];
        String[] tNombreFrutras= new String[MAX_FRUTAS];
        String[] tAlmacenes= new String[MAX_ALMACENES];
        int[] tContadorPedidos= new int[MAX_ENVIOS];
        float[][] tToneladasPedidos= new float[MAX_ALMACENES][MAX_ENVIOS];//Guardas las toneladas
        int[][] tPosicionCodigoPedidos = new int[MAX_ALMACENES][MAX_ENVIOS];//Guardas en la misma posicion de las toneladas el codigo de la fruta del envio
        char opcion;
        boolean finalizar=false;
        String codigoFruta, nombreFruta, codigoAlmacen, listado;
        int posFruta, nFrutas=0, posAlmacen, nAlmacenes=0, filaMax, colMax;
        float toneladas, sumaToneladas=0;

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
                    codigoFruta=JOptionPane.showInputDialog("Introduzca el codigo de la fruta: ");

                    //Buscamos si ya esta metido ese codigo de fruta
                    posFruta=0;
                    posFruta=buscarString(tCodigoFrutras,codigoFruta,nFrutas);

                    //Esto es si no a encontrado ese codigo en la tabla
                    if(posFruta==nFrutas)
                    {
                        tCodigoFrutras[posFruta]=codigoFruta;
                        nFrutas++;

                        //Pedimos el nombre de la fruta
                        nombreFruta=JOptionPane.showInputDialog("Introduzca el nombre de la fruta: ");
                        tNombreFrutras[posFruta]=nombreFruta;

                        JOptionPane.showMessageDialog(null, "Datos almacenados.");
                    }

                    //Esto es si el codigo de fruta ya fue metido antes
                    else
                        JOptionPane.showMessageDialog(null, "Ese codigo de fruta ya exixte.");

                    break;
                case '2':

                    codigoFruta=JOptionPane.showInputDialog("Introduzca el codigo de la fruta: ");

                    //Buscamos si ya esta metido ese codigo de fruta
                    posFruta=0;
                    posFruta=buscarString(tCodigoFrutras,codigoFruta,nFrutas);

                    //Esto es si encontro la fruta
                    if(posFruta<nFrutas)
                    {
                        //Peimos las toneladas y el codigo del almacen
                        toneladas=Float.parseFloat(JOptionPane.showInputDialog("Numero de toneladads del pedido: "));

                        codigoAlmacen=JOptionPane.showInputDialog("Introduzca el codigo del almacen: ");

                        //Buscamos si existe este almacen y guardamos su posición
                        posAlmacen=0;
                        posAlmacen=buscarString(tAlmacenes,codigoAlmacen,nAlmacenes);

                        //Esto es en el caso de que no se haya encontrado el almacen
                        if(posAlmacen==nAlmacenes)
                        {
                            tAlmacenes[posAlmacen]=codigoAlmacen;
                            nAlmacenes++;
                        }

                        /*Guardamos el numero de toneladas y la posicion del codigo de la fruta en sus respectivas tablas
                        en la posicion del numero del almacen y la cantidad de pedidos
                         */

                        tToneladasPedidos[posAlmacen][tContadorPedidos[posAlmacen]]=toneladas;

                        tPosicionCodigoPedidos[posAlmacen][tContadorPedidos[posAlmacen]]=posFruta;

                        //Aumentamos el contador de pedidos de ese almacen 1 más
                        tContadorPedidos[posAlmacen]++;

                        JOptionPane.showMessageDialog(null, "Datos Almacenados");
                    }

                    //Esto es si el codigo de fruta no existe
                    else
                        JOptionPane.showMessageDialog(null, "Ese codigo de fruta no exixte.");

                    break;
                case '3':
                    listado="";

                    for(int i=0;i<nAlmacenes;i++)
                    {
                        listado+="Almacén: "+tAlmacenes[i]+"\n";

                        for(int j=0;j<tContadorPedidos[i];j++)
                        {
                            listado+="   Producto: "+tCodigoFrutras[tPosicionCodigoPedidos[i][j]]+
                                    " ("+tNombreFrutras[tPosicionCodigoPedidos[i][j]]+") "+
                                    tToneladasPedidos[i][j]+" Ton."+"\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '4':
                    listado="";

                    filaMax=0;
                    colMax=0;
                    for(int i=0;i<nAlmacenes;i++)
                    {
                        for(int j=0;j<tContadorPedidos[i];j++)
                        {
                            if(tToneladasPedidos[i][j]>tToneladasPedidos[filaMax][colMax])
                            {
                                filaMax=i;
                                colMax=j;
                            }
                        }
                    }

                    listado="El producto del que se envió más cantidad en un envio es: "+
                            tNombreFrutras[tPosicionCodigoPedidos[filaMax][colMax]]+
                            " con un envío de "+tToneladasPedidos[filaMax][colMax]+
                            "Ton.";

                    JOptionPane.showMessageDialog(null, listado);
                    break;
                case '5':
                    listado="";

                    for(int i=0;i<nAlmacenes;i++)
                    {
                        if(tContadorPedidos[i]>=3)
                        {

                            for(int j=tContadorPedidos[i]-1;j>=(tContadorPedidos[i]-3);j--)
                            {
                            sumaToneladas+=tToneladasPedidos[i][j];
                            }

                            listado+="Almacén: "+tAlmacenes[i]+" Media: "+(sumaToneladas/3)+"\n";
                            sumaToneladas=0;
                        }
                    }

                    JOptionPane.showMessageDialog(null,listado);

                    break;
                case '6':
                    finalizar=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no valida.");
            }
        }
        while(!finalizar);
    }
    public static int buscarString(String[] t, String elemento, int nElem)
    {
        int pos=0;
        while(pos<nElem&&!t[pos].equals(elemento))
            pos++;
        return pos;
    }
}