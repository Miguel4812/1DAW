package PrimerTrimestre.Classroom07102024;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class actividad14 {

    public static void main(String[] args)
    {
        int n,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca usted un número: ");
        n=Integer.parseInt(sc.nextLine());

        if(n>0)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
        }
        else
            System.out.println("No existe número de Fibonacci de negativos.");
        sc.close();
    }
}