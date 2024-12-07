package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen2021 {

    public static void main(String[] args)
    {
        String codigo,matricula,codigoCilindradaMax="",matriculaCilindradaMin="";
        int numeroCoches,kilometros,kilometrosMayor=0,sucursalMayor=0,diesel=0,gasolina=0,masGasolina=0;
        float totalCilindrada=0;
        Float mediaCilindradaMax=null;
        Integer cilindradaMin=null;
        char combustible;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Introduzca el codigo de la sucursal: ");
            codigo=sc.nextLine();

            if(codigo.equalsIgnoreCase("Fin"))
                break;

            System.out.println("Introduzca el número de coches: ");
            numeroCoches=Integer.parseInt(sc.nextLine());

            for(int i=0;i<numeroCoches;i++)
            {
                System.out.println("Introduzca la matricula del coche: ");
                matricula=sc.nextLine();

                System.out.println("Introduzca el tipo de combustible: ");
                combustible=(sc.nextLine()).charAt(0);

                if(combustible=='D')
                    diesel++;
                else
                    gasolina++;

                System.out.println("Introduzca la cilindrada: ");
                int cilindrada=Integer.parseInt(sc.nextLine());

                //sumo la cilindrada total de una sucursal
                totalCilindrada+=cilindrada;

                //cilindrada minima y su matricula
                if(cilindradaMin==null)
                {
                    cilindradaMin=cilindrada;
                    matriculaCilindradaMin=matricula;
                }
                else if(cilindradaMin>cilindrada)
                {
                    cilindradaMin=cilindrada;
                    matriculaCilindradaMin=matricula;
                }

                System.out.println("Introduzca los kilometros: ");
                kilometros=Integer.parseInt(sc.nextLine());

                //kilometros mayor de 70000
                if(kilometros>70000)
                    kilometrosMayor++;
            }
            //calculo la media de cilindrada de una sucursal
            float mediaCilindrada=totalCilindrada/numeroCoches;
            //guardo la media maxima de cilindrada y su codigo
            if(mediaCilindradaMax==null)
            {
                mediaCilindradaMax=mediaCilindrada;
                codigoCilindradaMax=codigo;
            }
            else if(mediaCilindradaMax<mediaCilindrada)
            {
                mediaCilindradaMax=mediaCilindrada;
                codigoCilindradaMax=codigo;
            }

            //sucursal con mas de 3 coches con 70000 kilometros
            if(kilometrosMayor>=3)
                sucursalMayor++;

            //gasolina mas que diesel
            if(gasolina>diesel)
                masGasolina++;
            //reinicio los totales
            totalCilindrada=0;
            kilometrosMayor=0;
            diesel=0;
            gasolina=0;
        }
        System.out.println("El código de la sucursal con mayor media de cilindrada de sus vehículos es "+codigoCilindradaMax+"\n con una media de: "+mediaCilindradaMax);
        System.out.println("La matrícula del vehículo de gasolina con menor cilindrada de la empresa es: "+matriculaCilindradaMin);
        System.out.println("En "+sucursalMayor+" sucursales con más de 3 vehículos la media de kilometraje de sus coches supera los 70.000 km.");
        System.out.println("En "+masGasolina+" sucursales hay más vehículos de gasolina que diesel.");
        sc.close();
    }
}
