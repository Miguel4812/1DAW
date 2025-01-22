package SegundoTrimestre.ConstrolesAnteriores.Control2223;

@SuppressWarnings("SpellCheckingInspection")
public class Definicion
{
	private String tipo;
	private String nombre;
	
	public Definicion(String tipo, String nombre)
	{
		this.tipo = tipo;
		this.nombre = nombre;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String toString()
	{
		return this.tipo+" "+this.nombre;
	}
	
	
}
