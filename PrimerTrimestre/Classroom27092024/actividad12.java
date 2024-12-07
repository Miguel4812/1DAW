package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad12 {

    public static void main(String[] args)
    {
        String diaString;
        String mesString;
        String añoString;
        int dia;
        int mes;
        int año;
        int diamax;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un dia: ");
        diaString=sc.nextLine();
        dia=Integer.parseInt(diaString);

        System.out.println("Escribe un mes: ");
        mesString=sc.nextLine();
        mes=Integer.parseInt(mesString);

        System.out.println("Escribe un año: ");
        añoString=sc.nextLine();
        año=Integer.parseInt(añoString);

        diamax=31;

        if (mes==4||mes==6||mes==9||mes==11)
            diamax=30;
        else
        if ((mes==2)&&((año%4==0)&&(año%100!=0)||(año%400==0)))
            diamax=29;
        else if(mes==2)
            diamax=28;
        dia++;
        if(dia>diamax)
        {
            dia=1;
            mes++;
            if(mes==13)
            {
                mes=1;
                año++;
            }
        }
        System.out.println("La fecha al dia sguiente es: "+dia+"/"+mes+"/"+año);
    }

}
