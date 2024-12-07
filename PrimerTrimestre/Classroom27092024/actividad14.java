package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad14 {

    public static void main(String[] args)
    {
        int num;
        int d,u;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num=Integer.parseInt (sc.nextLine());

        d = num/10;
        u = num%10;

        switch(d)
        {
            case 1:
                switch(u)
                {
                    case 0:
                        System.out.print("DIEZ");
                        break;
                    case 1:
                        System.out.print("ONCE");
                        break;
                    case 2:
                        System.out.print("DOCE");
                        break;
                    case 3:
                        System.out.print("TRECE");
                        break;
                    case 4:
                        System.out.print("CATORCE");
                        break;
                    case 5:
                        System.out.print("QUINCE");
                        break;
                    case 6:
                        System.out.print("DIECISEIS");
                        break;
                    case 7:
                        System.out.print("DIECISIETE");
                        break;
                    case 8:
                        System.out.print("DIECIOCHO");
                        break;
                    case 9:
                        System.out.print("DIECINUEVE");
                        break;
                }
                break;
            case 2:
                if(u==0)
                    System.out.print("VEINTE");
                else
                    System.out.print("VEINTI");

                break;
            case 3:
                System.out.print("TREINTA");
                break;
            case 4:
                System.out.print("CUARENTA");
                break;
            case 5:
                System.out.print("CINCUENTA");
                break;
            case 6:
                System.out.print("SESENTA");
                break;
            case 7:
                System.out.print("SETENTA");
                break;
            case 8:
                System.out.print("OCHENTA");
                break;
            case 9:
                System.out.print("NOVENTA");
                break;
        }


        if(d>3 && u>0)
            System.out.print(" Y ");



        if (d!=1)
        {
            switch (u)
            {
                case 0:
                    if(d==0)
                        System.out.println("CERO");
                case 1:
                    System.out.print("UNO");
                    break;
                case 2:
                    System.out.print("DOS");
                    break;
                case 3:
                    System.out.print("TRES");
                    break;
                case 4:
                    System.out.print("CUATRO");
                    break;
                case 5:
                    System.out.print("CINCO");
                    break;
                case 6:
                    System.out.print("SEIS");
                    break;
                case 7:
                    System.out.print("SIETE");
                    break;
                case 8:
                    System.out.print("OCHO");
                    break;
                case 9:
                    System.out.print("NUEVE");
                    break;
            }
        }
    }
}