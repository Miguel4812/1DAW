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


        return null;
    }

    public int getNVeterinariosMasDe(int minNumNacimientos)
    {
        return 0;
    }

    public boolean veterinarioPadresEHijo()
    {
        return false;
    }

    public boolean hayErroresEnFechas()
    {
        return false;
    }
}
