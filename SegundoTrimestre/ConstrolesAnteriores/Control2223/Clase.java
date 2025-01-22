package SegundoTrimestre.ConstrolesAnteriores.Control2223;
import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class Clase
{
	private String nombre;
	private Definicion tAtribs[];
	private Metodo tMetodos[]; 

	public Clase(String nombre)
	{
		this.nombre = nombre;
		this.tAtribs = new Definicion[0];
		this.tMetodos = new Metodo[0];	
	}
	
		
	public Metodo[] gettMetodos()
	{
		return tMetodos;
	}


	public void anadeAtributo(Definicion atributo)
	{
		Definicion[] tNueva = Arrays.copyOf(tAtribs, tAtribs.length+1);
		tNueva[tAtribs.length] = atributo;
		this.tAtribs = tNueva;
	}
	
	public void anadeMetodo(Metodo metodo)
	{
		Metodo[] tNueva = Arrays.copyOf(tMetodos, tMetodos.length+1);
		tNueva[tMetodos.length] = metodo;
		this.tMetodos = tNueva;
	}
	
	public boolean tieneMetodosDuplicados()
	{
		for(int i=0;i<this.tMetodos.length-1;i++)
			for(int j=i+1;j<this.tMetodos.length;j++)
				if(this.tMetodos[i].equals(this.tMetodos[j]))
					return true;

		return false;
	}
	
	public boolean esMasCompleja(int complejidadMin)
	{
		for(Metodo m:this.tMetodos)
			if(m.getComplejidad()>complejidadMin)
				return true;

		return false;
	}
	
	public Metodo[] getMetodosQueUsan(String tipo)
	{
		Metodo[] resultado;
		int contador=0;

		for(Metodo m: this.tMetodos)
		{
			for(int i=0;i<m.gettParametros().length;i++)
			{
				if(m.gettParametros()[i].getTipo().equals(tipo))
				{
					contador++;
					break;
				}
			}
		}

		resultado=new Metodo[contador];
		contador=0;

		for(Metodo m: this.tMetodos)
		{
			for(int i=0;i<m.gettParametros().length;i++)
			{
				if(m.gettParametros()[i].getTipo().equals(tipo))
				{
					resultado[contador]=m;
					contador++;
					break;
				}
			}
		}

		return resultado;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clase other = (Clase) obj;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
		String res="";
		res += "public class "+this.nombre+"\n";
		res+="  //ATRIBUTOS\n";
		for(Definicion atr:this.tAtribs)
			res+= "  private "+atr+";\n";
		res+="  //METODOS\n";
		for(Metodo met:this.tMetodos)
			res+= "  public "+met+";\n";
		
		return res;
	}
	
	public Definicion[] gettAtribs()
	{
		return tAtribs;
	}


	public void settAtribs(Definicion[] tAtribs)
	{
		this.tAtribs = tAtribs;
	}


	public void settMetodos(Metodo[] tMetodos)
	{
		this.tMetodos = tMetodos;
	}
	
	
	
}
