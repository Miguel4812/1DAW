package PrimerTrimestre.Classroom27092024;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad8 {

    public static void main(String[] args)
    {
        String numero1String;
        String numero2String;
        String numero3String;
        int numero1;
        int numero2;
        int numero3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Escriba el primer numero entero: ");
        numero1String=sc.nextLine();
        numero1=Integer.parseInt(numero1String);

        System.out.println("Escriba el segundo numero entero: ");
        numero2String=sc.nextLine();
        numero2=Integer.parseInt(numero2String);

        System.out.println("Escriba el tercer numero entero: ");
        numero3String=sc.nextLine();
        numero3=Integer.parseInt(numero3String);

        if(numero1<numero2)
        {
            if(numero1<numero3)
            {
                if(numero2<numero3)
                    System.out.println("Los numeros de menor a mayor son: "+numero1+"<"+numero2+"<"+numero3);
                else
                    System.out.println("Los numeros de menor a mayor son: "+numero1+"<"+numero3+"<"+numero2);
            }
            else
                System.out.println("Los numeros de menor a mayor son: "+numero2+"<"+numero1+"<"+numero3);
        }
        else
        {
            if(numero3<numero2)
                System.out.println("Los numeros de menor a mayor son: "+numero2+"<"+numero3+"<"+numero1);
            else
            {
                if(numero1<numero2)
                    System.out.println("Los numeros de menor a mayor son: "+numero3+"<"+numero1+"<"+numero2);
                else
                    System.out.println("Los numeros de menor a mayor son: "+numero3+"<"+numero2+"<"+numero1);
            }
        }
    }

}
