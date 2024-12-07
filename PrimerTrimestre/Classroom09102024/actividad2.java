package PrimerTrimestre.Classroom09102024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad2 {

    public static void main(String[] args)
    {
        int arbolesB=0,arboles=0;
        float edad=0,totaledad=0,altura=0,totalaltura=0,diametro=0,alturamax=0,alturamin=1000,diametromax=0,diametromin=2000;
        boolean arbolesgrandes=false;
        String tipo="";
        Scanner sc=new Scanner(System.in);

        while(arboles<=0)
        {
            System.out.println("¿De cuantos arboles vas a meter datos? ");
            arboles=Integer.parseInt(sc.nextLine());
        }

        for(int i=1;i<=arboles;i++)
        {

            while(!tipo.equals("A")||!tipo.equals("B"))
            {
                System.out.println("Escribe de que tipo es el arbol: ");
                tipo=sc.nextLine();
                if(tipo.equalsIgnoreCase("A")||tipo.equalsIgnoreCase("B"))
                    break;
            }

            while(altura<=0)
            {
                System.out.println("Escribe usted la altura del arbol en metros: ");
                altura=Float.parseFloat(sc.nextLine());
            }

            while(diametro<=0)
            {
                System.out.println("Escriba usted el diametro del arbol en metros: ");
                diametro=Float.parseFloat(sc.nextLine());
            }

            if(tipo.equals("B"))
            {
                while(edad<=0)
                {
                    System.out.println("Escriba usted la edad del arbol: ");
                    edad=Integer.parseInt(sc.nextLine());
                }
                arbolesB++;
                totaledad=totaledad+edad;
            }
            totalaltura=totalaltura+altura;

            if(altura>alturamax)
                alturamax=altura;
            if(altura<alturamin)
                alturamin=altura;
            if(diametro>diametromax)
                diametromax=diametro;
            if(diametro<diametromin)
                diametromin=diametro;

            if(altura>30)
                arbolesgrandes=true;
        }
        System.out.println("La media de las alturas es: "+(totalaltura/arboles));
        System.out.println("La altura máxima es: "+alturamax+" y la mínima es: "+alturamin);
        System.out.println("El diámetro máximo es: "+diametromax+" y la mínima es: "+diametromin);
        System.out.println("La media de las edades del tipo B son: "+(totaledad/arbolesB));
        if(arbolesgrandes=true)
            System.out.println("Existen árboles de más de 30 metros.");
        sc.close();
    }
}
