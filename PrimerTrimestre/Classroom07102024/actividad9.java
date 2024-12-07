package PrimerTrimestre.Classroom07102024;

@SuppressWarnings("SpellCheckingInspection")
public class actividad9 {
    public static void main(String[] args)
    {
        int intentos, numero, resultado;
        numero=1;
        intentos=0;

        while(intentos<10)
        {
            resultado=numero*numero;
            intentos++;
            numero=numero+2;
            System.out.println(resultado);
        }
    }
}
