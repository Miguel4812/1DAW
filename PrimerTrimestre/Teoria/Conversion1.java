package PrimerTrimestre.Teoria;

@SuppressWarnings("SpellCheckingInspection")
public class Conversion1 {

    public static void main(String[] args)
    {
        int n;
        double d;

        String cad1="37";
        String cad2="6749.98";

        n = Integer.parseInt(cad1);

        System.out.println("n incrementado vale: "+(n+1));

        d = Double.parseDouble(cad2);

        System.out.println("d incrementado vale: "+(d+1));
    }

}
