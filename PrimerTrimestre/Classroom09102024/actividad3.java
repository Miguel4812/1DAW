package PrimerTrimestre.Classroom09102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad3 {

    public static void main(String[] args)
    {
        int i,mes=0,diamaxmes=0,piezas=0,diamaxpiezas=0,piezasmaxpiezas=0,piezasmin=1000,total=0;
        boolean menos300;
        Scanner sc=new Scanner(System.in);

        while(mes>12||mes<=0)
        {
            System.out.println("¿De que mes vas a meter datos? ");
            mes=Integer.parseInt(sc.nextLine());
        }

        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
            diamaxmes=31;
        else if (mes==4||mes==6||mes==9||mes==11)
            diamaxmes=30;
        else
            diamaxmes=28;

        for(i=1;i<=diamaxmes;i++)
        {
            while(piezas<=0||piezas>=1000)
            {
                System.out.println("Introduzca el número de piezas: ");
                piezas=Integer.parseInt(sc.nextLine());
            }
            if(piezas>piezasmaxpiezas)
                diamaxpiezas=i;
            if(piezas<piezasmin)
                piezasmin=piezas;
            total=total+piezas;
            if(piezas<300)
                menos300=true;
            piezas=1001;
        }
        System.out.println("El dia con el máximo de piezas es el "+diamaxpiezas);
        System.out.println("El minimo de piezas fabricadas son: "+piezasmin);
        System.out.println("El total de piezas fabricadas en el mes es: "+total);
        if(menos300=true)
            System.out.println("Existen dias por debajo del minimo.");

        sc.close();
    }
}
