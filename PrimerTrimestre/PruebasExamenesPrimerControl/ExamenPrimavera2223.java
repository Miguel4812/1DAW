package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class ExamenPrimavera2223 {

    public static void main(String[] args)
    {
        String nombreCiudad,nombreBatallon,nombreBatallonMax="",nombreCiudadMax="",nombreSegundaCiudad="",nombreCiudadMasTarde="";
        int numeroBatallones,numeroEfectivosBatallon,numeroMes,numeroMinHabitantes=0,totalCiudades=0,numeroMaxEfectivos=0,numeroMaxMes=0;
        float numeroCiudadesU=0;
        long numeroHabitantes;
        char ocupacion;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el nombre de la ciudad: ");
        nombreCiudad=sc.nextLine();

        while(!nombreCiudad.equalsIgnoreCase("Fin"))
        {
            System.out.println("Introduzca el número de habitantes: ");
            numeroHabitantes=Long.parseLong(sc.nextLine());

            if(numeroHabitantes>1000000)
            {
                System.out.println("Introduzca el número de batallones: ");
                numeroBatallones=Integer.parseInt(sc.nextLine());

                for(int i=0;i<numeroBatallones;i++)
                {
                    System.out.println("Introduzca el nombre del batallon: ");
                    nombreBatallon=sc.nextLine();

                    System.out.println("Introduzca el número de efectivos: ");
                    numeroEfectivosBatallon=Integer.parseInt(sc.nextLine());

                    if(numeroEfectivosBatallon>numeroMaxEfectivos)
                    {
                        numeroMaxEfectivos=numeroEfectivosBatallon;
                        nombreBatallonMax=nombreBatallon;
                        nombreCiudadMax=nombreCiudad;
                    }
                }
            }
            System.out.println("¿Por que bando esta ocupada? (R/U) ");
            ocupacion=(sc.nextLine()).charAt(0);

            System.out.println("Introduzca el mes que fue ocupada: ");
            numeroMes=Integer.parseInt(sc.nextLine());

            if(ocupacion=='U')
            {
                numeroCiudadesU++;
                if(numeroHabitantes<950000)
                    numeroMinHabitantes++;
            }
            totalCiudades++;

            if(totalCiudades==2)
                nombreSegundaCiudad=nombreCiudad;

            if(numeroMes>numeroMaxMes)
            {
                numeroMaxMes=numeroMes;
                nombreCiudadMasTarde=nombreCiudad;
            }
            System.out.println("Introduzca el nombre de la ciudad: ");
            nombreCiudad=sc.nextLine();
        }
        System.out.println("Número de ciudades ucranianas con menos de 950.000 habitantes: "+numeroMinHabitantes);
        System.out.println("Porcentaje de ciudades ocupadas \npor el bando Ucraniano: "+((numeroCiudadesU/totalCiudades)*100)+"%");
        System.out.println("El batallón con más componentes es: "+nombreBatallonMax+"\ny estaba en: "+nombreCiudadMax);
        System.out.println("La segunda ciudad introducida es: "+nombreSegundaCiudad);
        System.out.println("La ciudad ocupada más tarde es: "+nombreCiudadMasTarde);
        sc.close();
    }
}
