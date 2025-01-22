package SegundoTrimestre.ConstrolesAnteriores.MatchADO;

@SuppressWarnings("SpellCheckingInspection")

public class Fecha
{
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año)
	{
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia()
	{
		return dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getAño()
	{
		return año;
	}

	public void setAño(int año)
	{
		this.año = año;
	}

	@Override
	public String toString()
	{
		return ""+this.dia+"/"+this.mes+"/"+this.año;
	}
	
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public int compareTo(Fecha otra)
	{
		int res = this.año - otra.año;
		
		if(res == 0)
			res = this.mes - otra.mes;
		if(res == 0)
			res = this.dia - otra.dia;
		
		return res;
	}
	
	

}
