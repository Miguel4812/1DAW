package PrimerTrimestre.PruebasMenus;

import javax.swing.JOptionPane;

@SuppressWarnings("SpellCheckingInspection")
public class Prueba1 {

    public static final int MAX=20;
    public static void main(String[] args)
    {
        String[] tNombres = new String[MAX];
        float[] tMarcas = new float[MAX];
        boolean finalizar = false;
        char opción ;
        String nombreNuevo ,listado="",nombreABuscar,nombreABorrar;
        float marcaNueva;
        int nElem = 0,contBusqueda;

        // bucle principal
        do
        {
            // mostrar menu y pedir la opción
            opción = JOptionPane.showInputDialog("1 - Alta de corredor\n"
                    +"2 - Listar todo\n"
                    +"3 - Busqueda\n"
                    +"4 - Borrar un corredor\n"
                    +"5 - Finalizar\n").charAt(0);

            switch(opción)
            {
                // dar de alta
                case '1':
                    if(nElem<MAX)
                    {
                        nombreNuevo = JOptionPane.showInputDialog("Nombre: ");
                        contBusqueda=0;

                        while(contBusqueda<nElem&&!nombreNuevo.equalsIgnoreCase(tNombres[contBusqueda]))
                            contBusqueda++;
                        if(contBusqueda==nElem)
                        {
                            marcaNueva = Float.parseFloat(JOptionPane.showInputDialog("Marca: "));
                            contBusqueda=nElem-1;
                            while(contBusqueda>=0&&tMarcas[contBusqueda]>marcaNueva)
                            {
                                tMarcas[contBusqueda+1]=tMarcas[contBusqueda];
                                tNombres[contBusqueda+1]=tNombres[contBusqueda];
                                contBusqueda--;
                            }
                            tMarcas[contBusqueda+1]=marcaNueva;
                            tNombres[contBusqueda+1] = nombreNuevo;
                            nElem++;
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Ese nombre ya existe y no se puede repetir.");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Tabla LLena");
                    break;
                // listar todo
                case '2':
                    for(int i=0;i<nElem;i++)
                    {
                        listado+=tNombres[i]+"-"+tMarcas[i]+"\n";
                    }
                    JOptionPane.showMessageDialog(null, listado);
                    listado="";
                    break;
                //Buscar nombre y mostrar se marca
                case '3':
                    nombreABuscar=JOptionPane.showInputDialog("Introduzca el nombre: ");
                    contBusqueda=0;

                    while(contBusqueda<nElem&&!nombreABuscar.equalsIgnoreCase(tNombres[contBusqueda]))
                        contBusqueda++;

                    if(contBusqueda<nElem)
                        JOptionPane.showMessageDialog(null,nombreABuscar+" tiene la marca "+tMarcas[contBusqueda]);
                    else
                        JOptionPane.showMessageDialog(null, "No se a encontrado en la lista.");
                    break;
                //Borrar un corredor
                case '4':
                    nombreABorrar=JOptionPane.showInputDialog("Introduzca el nombre: ");
                    contBusqueda=0;

                    while(contBusqueda<nElem&&!nombreABorrar.equalsIgnoreCase(tNombres[contBusqueda]))
                        contBusqueda++;

                    if(contBusqueda<nElem)
                    {
                        for(int i =contBusqueda;i<nElem-1;i++)
                        {
                            tNombres[i]=tNombres[i+1];
                            tMarcas[i]=tMarcas[i+1];
                        }
                        nElem--;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "No se a encontrado en la lista y no se a podido borrar.");

                    break;
                // finalizar
                case '5':
                    finalizar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción errónea");
            }
        }
        while(finalizar == false);
    }
}
