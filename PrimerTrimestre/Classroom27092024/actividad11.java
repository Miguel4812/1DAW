package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad11 {

    public static void main(String[] args)
    {
        int dia,mes,año;
        int diamax;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un dia: ");
        dia=Integer.parseInt(sc.nextLine());

        System.out.println("Escribe un mes: ");
        mes=Integer.parseInt(sc.nextLine());

        System.out.println("Escribe un año: ");
        año=Integer.parseInt(sc.nextLine());

        diamax=31;

        if ((mes==4)||(mes==6)||(mes==9)||(mes==11))
            diamax=30;
        else
        if ((año%4==0)&&(año%100!=0)||(año%400==0))
            diamax=29;
        else if(mes==2)
            diamax=28;
        if(mes<1||mes>12||dia<1||dia>diamax)
            System.out.println("La fecha es incorrecta");
        else
            System.out.println("La fecha es correcta");

    }

}
