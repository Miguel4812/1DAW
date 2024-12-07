package PrimerTrimestre.Classroom09102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad4 {

    public static void main(String[] args)
    {
        int region=0,regionprovincias,votosA=-1,votosB=-1,votosAmax=0,votosBmax=0,numeroabstenciones=-1;
        float total=0,totalvotos=0,totalabstenciones=-1;
        String nombreprovincia, nombreprovinciamaxA="",nombreprovinciamaxB="";
        Scanner sc=new Scanner(System.in);

        while(region<=0||region>4)
        {
            System.out.println("¿Sobre que región vas a meter datos? ");
            region=Integer.parseInt(sc.nextLine());
        }
        regionprovincias=10;
        if(region==2)
            regionprovincias=4;
        else if(region==3)
            regionprovincias=6;
        else if(region==4)
            regionprovincias=1;

        for(int i =1;i<=regionprovincias;i++)
        {
            System.out.println("Introduzca usted el nombre de la provincia: ");
            nombreprovincia=sc.nextLine();

            while(votosA<0)
            {
                System.out.println("Introduzca el numero de votos del partido A: ");
                votosA=Integer.parseInt(sc.nextLine());
            }

            while(votosB<0)
            {
                System.out.println("Introduzca el numero de votos del partido B: ");
                votosB=Integer.parseInt(sc.nextLine());
            }

            while(numeroabstenciones<0)
            {
                System.out.println("Introduzca el número de abstenciones: ");
                numeroabstenciones=Integer.parseInt(sc.nextLine());
            }

            total=total+votosA+votosB+numeroabstenciones;
            totalvotos=totalvotos+votosA+votosB;
            totalabstenciones=totalabstenciones+numeroabstenciones;
            if(votosA>votosAmax)
            {
                votosAmax=votosA;
                nombreprovinciamaxA=nombreprovincia;
            }

            if(votosB>votosBmax)
            {
                votosBmax=votosB;
                nombreprovinciamaxB=nombreprovincia;
            }

            numeroabstenciones=-1;
            votosB=-1;
            votosA=-1;
        }
        System.out.println("El porcentaje de votos es: "+((totalvotos/total)*100)+"%");
        System.out.println("El porcentaje de abstenciones es: "+((totalabstenciones/total)*100)+"%");
        System.out.println("La provincia con más votos de A es "+nombreprovinciamaxA);
        System.out.println("La provincia con más votos de B es "+nombreprovinciamaxB);
        if(totalabstenciones>100000)
            System.out.println("Alta abstención");
        sc.close();
    }
}
