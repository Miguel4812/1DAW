package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen2122 {

    public static void main(String[] args)
    {
        String nombreLocalidad,nombrePromocion,nombrePromocionPrimera="",nombrePromocionUltima="",nombreMediaMin="",nombreViviendaMax="",nombreProporcionViviendaMax="";
        int numeroPromociones,numeroViviendas,totalViviendaS=0,numeroSubvenciones=0;
        float numeroViviendaN=0,superficieViviendasN=0,totalImporteSubvencionado=0;
        float importeSubvencionado=0,totalVivienda=0,mediaViviendaMin=1000,precioViviendaMax=0,proporcionViviendaSMax=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el nombre de la localidad: ");
        nombreLocalidad=sc.nextLine();

        while(!nombreLocalidad.equalsIgnoreCase("Fin"))
        {
            System.out.println("Introduzca el número de promociones: ");
            numeroPromociones=Integer.parseInt(sc.nextLine());

            for(int i=0;i<numeroPromociones;i++)
            {
                System.out.println("Introduzce el nombre de la promoción: ");
                nombrePromocion=sc.nextLine();

                System.out.println("¿Es de Protección Oficial? (S/N) ");
                char proteccion=(sc.nextLine()).charAt(0);

                System.out.println("Introduzca el número de viviendas: ");
                numeroViviendas=Integer.parseInt(sc.nextLine());

                System.out.println("Introduzca el número de metros cuadrados: ");
                float numeroMetros=Float.parseFloat(sc.nextLine());

                System.out.println("Introduzca el precio de las viviendas: ");
                float precioVivienda=Float.parseFloat(sc.nextLine());

                totalVivienda+=numeroViviendas;
                if(proteccion=='S')
                {
                    System.out.println("Introduzca el importe subvencionado: ");
                    importeSubvencionado=Float.parseFloat(sc.nextLine());
                    totalViviendaS=totalViviendaS+numeroViviendas;
                    if(numeroPromociones>=3)
                    {
                        numeroSubvenciones++;
                        totalImporteSubvencionado=totalImporteSubvencionado+importeSubvencionado;
                    }
                }
                else
                {
                    numeroViviendaN=numeroViviendaN+numeroViviendas;
                    superficieViviendasN=superficieViviendasN+(numeroViviendas*numeroMetros);
                    if (nombrePromocionPrimera.isEmpty())
                        nombrePromocionPrimera = nombrePromocion;
                    nombrePromocionUltima = nombrePromocion;
                }
                if(precioVivienda>precioViviendaMax)
                {
                    precioViviendaMax=precioVivienda;
                    nombreViviendaMax=nombrePromocion;
                }
            }
            float mediaViviendaPromociones=totalVivienda/numeroPromociones;
            float proporcionViviendaS=(totalViviendaS/totalVivienda)*100;

            if(proporcionViviendaS>proporcionViviendaSMax)
            {
                proporcionViviendaSMax=proporcionViviendaS;
                nombreProporcionViviendaMax=nombreLocalidad;
            }

            if(mediaViviendaPromociones<mediaViviendaMin)
            {
                mediaViviendaMin=mediaViviendaPromociones;
                nombreMediaMin=nombreLocalidad;
            }
            totalViviendaS=0;
            totalVivienda=0;
            System.out.println("Introduzca el nombre de la localidad: ");
            nombreLocalidad=sc.nextLine();
        }
        float mediaImporteSubvenciones=totalImporteSubvencionado/numeroSubvenciones;
        float mediaSuperficie=superficieViviendasN/numeroViviendaN;
        System.out.println("Primera promoción: "+nombrePromocionPrimera+"\nUltima: "+nombrePromocionUltima);
        System.out.println("Localidad con menor número medio de viviendas por promoción "+nombreMediaMin+" con una media de: "+mediaViviendaMin);
        System.out.println("Promoción que generara más ingresos brutos: "+nombreViviendaMax);
        System.out.println("Localidad con mayor proporción de VPO: "+nombreProporcionViviendaMax+" con un porcentaje de: "+proporcionViviendaSMax+"%");
        System.out.println("Superficie media de las viviendas no VPO: "+mediaSuperficie);
        System.out.println("Media de las subvenciones en localidades con al menos 3 promociones: "+mediaImporteSubvenciones);
        sc.close();
    }
}
