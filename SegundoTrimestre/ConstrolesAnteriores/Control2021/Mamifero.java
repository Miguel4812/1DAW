package SegundoTrimestre.ConstrolesAnteriores.Control2021;

@SuppressWarnings("SpellCheckingInspection")
public class Mamifero extends SerVivo
{
    private Mamifero padre;
    private Mamifero madre;
    private Fecha diaNacimiento;
    private Veterinario asistente;

    public Mamifero(String nombre, Mamifero padre, Mamifero madre,
                    Fecha diaNacimiento, Veterinario asistente)
    {
        super(nombre);
        this.padre = padre;
        this.madre = madre;
        this.diaNacimiento = diaNacimiento;
        this.asistente = asistente;
    }

    // LOS GETTERS EST?N PREPARADOS PARA QUE NO SE PRODUZCAN EXCEPCIONES SI UN MAM?FERO
    // NO TIENE PADRES, FECHA DE NACIMIENTO O VETERINARIO ASISTENTE


    public Mamifero getPadre()
    {
        if(this.padre == null)
            return new Mamifero(null,null,null,null,null);
        return padre;
    }

    public Mamifero getMadre()
    {
        if(this.madre == null)
            return new Mamifero(null,null,null,null,null);
        return madre;
    }

    public Fecha getDiaNacimiento()
    {
        if(this.diaNacimiento == null)
            return new Fecha(0,0,0);
        return diaNacimiento;
    }

    public Veterinario getAsistente()
    {
        if(this.asistente == null)
            return new Veterinario("");
        return asistente;
    }

    @Override
    public String toString()
    {
        String res="";

        res+= "Nombre: "+this.nombre+" ";
        if(this.padre != null)
        {
            res+= "naci? de "+this.padre.nombre+" y de "+this.madre.nombre+" ";
            res+= "el d?a "+this.diaNacimiento+" ";
            res+= "veterinario asistente: "+this.asistente.getNombre();
        }
        return res;
    }

}

