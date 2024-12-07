package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad10 {

    public static void main(String[] args)
    {
        int hora;
        int minuto;
        int segundo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la hora que es(solo la hora): ");
        hora=Integer.parseInt(sc.nextLine());

        System.out.println("Escribe los minutos que son: ");
        minuto=Integer.parseInt(sc.nextLine());

        System.out.println("Escribe los segundos que son: ");
        segundo=Integer.parseInt(sc.nextLine());

        segundo++;

        if(segundo==60)
        {
            segundo=0;
            minuto++;
            if (minuto==60)
            {
                minuto=0;
                hora++;
                if(hora==24)
                    hora=0;
            }
        }
        System.out.println("Si le sumamos un segundo la hora es:"+hora+"."+minuto+"."+segundo+".");
    }

}
