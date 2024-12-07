package PrimerTrimestre.ExamenFinal;

import javax.swing.*;

public class Leandro {
    public static final int PRODUCTOS=30;

    public static final int ENVIOS=20;

    public static void main(String[] args)

    {

        //MENÚ
        boolean finalizar=false;
        char opcion=' ';
        //CREAMOS LAS TABLAS.
        String codFruta[]=new String [PRODUCTOS];
        String nombreFrutas[]=new String [PRODUCTOS];
        String almacenes[]=new String [ENVIOS];
        String almacenesFruta[][]=new String [ENVIOS][ENVIOS];
        float almacenesTon[][]=new float [ENVIOS][ENVIOS];

        //CREAMOS CONTADORES.
        int nFrutas=0;
        int nAlmacen=0;

        //CREAMOS EL MENÚ.
        do
        {
            opcion = JOptionPane.showInputDialog("1 - Introducir un producto.\n"
                    + "2 - Introducir datos de un envío.\n"
                    + "3 - Listar todo.\n"
                    + "4 - Mostrar el nombre del producto del que se ha enviado más cantidad en un sólo envío.\n"
                    + "5 - Mostrar la cantidad media de los tres últimos envíos a cada almacén con al menos tres envíos.\n"
                    + "6 - Fin.").charAt(0);

            switch(opcion)
            {
                case '1':
                    String codigoFruta="";
                    codigoFruta=JOptionPane.showInputDialog("Introduce el código de la fruta: ");

                    //BUSCAMOS SI EXISTE EL CÓDIGO.
                    boolean existe=false;

                    for (int i=0;i<nFrutas;i++)
                    {
                        if (codFruta[i].equalsIgnoreCase(codigoFruta))
                        {
                            existe=true;
                        }
                    }

                    //SI EXISTE MOSTRAMOS ERROR
                    if(existe)
                    {
                        JOptionPane.showMessageDialog(null,"ERROR, Esa código ya existe");
                    }

                    else //SINO EXISTE LO AÑADIMOS JUNTO CON LA DENOMINACIÓN DE LA FRUTA.
                    {
                        codFruta[nFrutas]=codigoFruta;
                        String fruta=JOptionPane.showInputDialog("Introduce el nombre de la fruta: ");
                        nombreFrutas[nFrutas]=fruta;
                        nFrutas++;
                        JOptionPane.showMessageDialog(null,"Datos almacenados");
                    }

                    break;
                case '2':

                    codigoFruta="";

                    codigoFruta=JOptionPane.showInputDialog("Introduce el código de la fruta: ");

                    //BUSCAMOS SI EXISTE EL CÓDIGO.
                    existe=false;

                    for (int i=0;i<nFrutas;i++)
                    {
                        if (codFruta[i].equalsIgnoreCase(codigoFruta))
                        {
                            existe=true;
                        }
                    }

                    //SINO EXISTE MOSTRAMOS ERROR.
                    if(existe=false)
                    {
                        JOptionPane.showMessageDialog(null,"ERROR, La fruta no está registrada");
                    }
                    else //SI EXISTE PEDIMOS LOS DEMÁS DATOS.
                    {
                        float toneladas=0;
                        String almacen="";
                        toneladas=Float.parseFloat(
                                JOptionPane.showInputDialog("Introduce las toneladas a enviar: "));
                        almacen=JOptionPane.showInputDialog("Introduce el almacén adonde quiere realizar el envío: ");

                        //BUSCAMOS SI EXISTE EL ALMACÉN.
                        existe=false;
                        for (int i=0;i<nAlmacen;i++)
                        {
                            if (almacenes[i].equalsIgnoreCase(almacen))
                            {
                                existe=true;
                            }
                        }

                        //SINO EXISTE LO AÑADIMOS.
                        if(existe=false)
                        {
                            almacenes[nAlmacen]=almacen;
                            nAlmacen++;
                        }

                        //BUSCAMOS EL ÍNDICE DEL ALMACEN Y DEL CÓDIGO DE FRUTA.
                        int almacenLoc=0;
                        int codFrutaLoc=0;

                        //FRUTA.

                        for(int i=0;i<nFrutas;i++)
                        {
                            if (codFruta[i].equalsIgnoreCase(codigoFruta))
                            {
                                codFrutaLoc=i;
                            }
                        }

                        //ALMACÉN.

                        for(int i=0;i<nAlmacen;i++)
                        {
                            if (almacenes[i].equalsIgnoreCase(almacen))
                            {
                                almacenLoc=i;
                            }
                        }

                        //GUARDAMOS LOS DATOS.
                        almacenesFruta[codFrutaLoc][almacenLoc]=codFruta[codFrutaLoc];
                        almacenesTon[codFrutaLoc][almacenLoc]=toneladas;
                        JOptionPane.showMessageDialog(null,"Datos almacenados");
                    }

                    break;
                case '3':
                    String listado = "Listado:";

                    for (int i=0;i<ENVIOS;i++)
                    {
                        if(almacenesFruta[i]!=null)
                        {
                            listado+="Almacén: "+almacenes[i]+"\n";
                        }
                        for(int j=0;j<ENVIOS;j++)
                        {
                            if(almacenesTon[i][j]!=0&&almacenesFruta[i][j]!=null)
                            {
                                listado+="Producto: "+(String) almacenesFruta[i][j];

                                //BUSCAMOS EL ÍNDICE DEL CÓDIGO DE FRUTA.

                                int indexFruta=0;

                                for(int x=0;x<PRODUCTOS;)
                                {
                                    if(almacenesFruta[i][j].equalsIgnoreCase(codFruta[x]))
                                    {
                                        indexFruta=x;
                                    }
                                }

                                //GUARDAMOS EN EL LISTADO LA FRUTA CON EL MISMO ÍNDICE.

                                listado+="("+nombreFrutas[indexFruta]+")";

                                listado+=" "+almacenesTon+"Ton\n";
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, listado);

                    break;
                case '4':

                    float mayorTonInt=0;
                    String mayorTon="";

                    for(int i=0;i<ENVIOS;i++)
                    {
                        for(int j=0;i<ENVIOS;i++)
                        {
                            if(almacenesTon[i][j]>mayorTonInt)
                            {
                                mayorTonInt=almacenesTon[i][j];
                                mayorTon=almacenesFruta[i][j];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(
                            null,"El producto del que se envió más cantidad en un envió es: "+mayorTon
                                    +" con un envío de "+mayorTonInt+" Ton");

                    break;
                case '5':
                    listado="";

                    float mediaAlmacen=0;

                    for(int i=0;i<ENVIOS;i++)
                    {
                        for(int j=0;j<ENVIOS;j++)
                        {
                            mediaAlmacen+=almacenesTon[i][j];
                        }
                        listado+="Almacém"+almacenes[i]+"con una media de: "+mediaAlmacen;
                    }

                    break;
                case '6':
                    finalizar=true;
                    break;
            }
        }
        while(!finalizar);
    }
}