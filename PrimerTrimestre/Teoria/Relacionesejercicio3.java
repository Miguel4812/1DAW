package PrimerTrimestre.Teoria;

@SuppressWarnings("SpellCheckingInspection")
public class Relacionesejercicio3 {

    public static void main(String[] args)
    {
        int diaHoy=15;
        int mesHoy=7;
        int añoHoy=2028;

        int diaNac=15;
        int mesNac=7;
        int añoNac=2006;

        System.out.println("¿Es mi cumple? "+ ((diaHoy==diaNac)&&(mesHoy==mesNac)&&(añoHoy>añoNac)));

        System.out.println("¿Soy mayor de edad?: "+ ((añoHoy-añoNac>18)||
                ((añoHoy-añoNac==18)&&(mesNac<mesHoy))||
                ((añoHoy-añoNac==18)&&(mesNac==mesHoy)&&(diaNac<=diaHoy))));

        /*Han pasado mas de 18 años o justo 18 años pero ya paso el mes que naci o justo 18 años,justo el mismo mes y ya a pasado el dia */
    }

}
