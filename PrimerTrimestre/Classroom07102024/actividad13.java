package PrimerTrimestre.Classroom07102024;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad13 {

    public static void main(String[] args)
    {
        int numero,cero;
        float positivo,negativo,totalPositivo,totalNegativo;
        Scanner sc=new Scanner(System.in);
        positivo=0;
        negativo=0;
        totalPositivo=0;
        totalNegativo=0;
        cero=0;

        System.out.println("Introduzca usted un número: ");
        numero=Integer.parseInt(sc.nextLine());

        for(int i=0;i<24;i++)
        {
            if(numero>0)
            {
                positivo++;
                totalPositivo=totalPositivo+numero;
            }
            else if(numero<0)
            {
                negativo++;
                totalNegativo=totalNegativo+(numero*-1);
            }
            else
                cero++;
            System.out.println("Introduzca usted un número: ");
            numero=Integer.parseInt(sc.nextLine());
        }
        if(positivo==0)
            System.out.println("No existe la media de los positivos.");
        else
            System.out.println("La media de los positivos es: "+(totalPositivo/positivo));
        if(negativo==0)
            System.out.println("No existe la media de los negativos.");
        else
            System.out.println("La media de los negativos es: "+(totalNegativo/negativo));
        System.out.println("La cantidad de ceros introducisos es: "+cero);
        sc.close();
    }
}
