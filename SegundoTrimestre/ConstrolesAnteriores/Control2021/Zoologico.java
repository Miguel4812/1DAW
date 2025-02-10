package SegundoTrimestre.ConstrolesAnteriores.Control2021;

@SuppressWarnings("SpellCheckingInspection")
public class Zoologico
{
    private Mamifero tMamiferos[];
    private Veterinario tVeterinarios[];

    public Zoologico()
    {
        this.tVeterinarios = new Veterinario[0];
        this.tMamiferos = new Mamifero[0];
    }

    public Mamifero[] gettMamiferos()
    {
        return tMamiferos;
    }

    public Veterinario[] gettVeterinarios()
    {
        return tVeterinarios;
    }

    public void añadeVeterinario(Veterinario veterinario)
    {
        Veterinario tNueva[] = new Veterinario[this.tVeterinarios.length+1];
        for(int i=0;i<this.tVeterinarios.length;i++)
            tNueva[i] = this.tVeterinarios[i];
        tNueva[this.tVeterinarios.length] = veterinario;
        this.tVeterinarios = tNueva;
    }

    public void añadeMamifero(Mamifero mamifero)
    {
        Mamifero tNueva[] = new Mamifero[this.tMamiferos.length+1];
        for(int i=0;i<this.tMamiferos.length;i++)
            tNueva[i] = this.tMamiferos[i];
        tNueva[this.tMamiferos.length] = mamifero;
        this.tMamiferos = tNueva;
    }

    public Mamifero[] getMamiferosEntreFechas(Fecha inicio, Fecha fin)
    {
        Zoologico z = new Zoologico();
        for(Mamifero m:this.tMamiferos)
            if(m.getDiaNacimiento().compareTo(inicio)<0&m.getDiaNacimiento().compareTo(fin)<0)
                z.añadeMamifero(m);

        return z.tMamiferos;
    }

    public int getNVeterinariosMasDe(int minNumNacimientos) {
        int resultado = 0;
        int contador = 0;

        for (Veterinario v : this.tVeterinarios)
        {
            contador = 0;
            for (Mamifero m : this.tMamiferos) {
                if (m.getAsistente().equals(v))
                    contador++;
            }
            if (contador >= minNumNacimientos)
                resultado++;
        }

        return resultado;
    }

    public boolean veterinarioPadresEHijo()
    {
        for(Mamifero m:this.tMamiferos)
            if(m.getAsistente().equals(m.getPadre().getAsistente())&&m.getAsistente().equals(m.getMadre().getAsistente()))
                return true;
        return false;
    }

    public boolean hayErroresEnFechas()
    {
        for(Mamifero m:this.tMamiferos)
            if(m.getDiaNacimiento().compareTo(m.getPadre().getDiaNacimiento())>0 || m.getDiaNacimiento().compareTo(m.getMadre().getDiaNacimiento())>0)
                return true;
        return false;
    }
}
