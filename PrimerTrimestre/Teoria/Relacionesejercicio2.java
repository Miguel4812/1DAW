package PrimerTrimestre.Teoria;

@SuppressWarnings("SpellCheckingInspection")
public class Relacionesejercicio2 {

    public static void main(String[] args)
    {
        int año;

        año=2400;


        System.out.println("Es bisiesto: "+ ((año%4==0)&&(año%100!=0)||(año%400==0)));
    }

}
