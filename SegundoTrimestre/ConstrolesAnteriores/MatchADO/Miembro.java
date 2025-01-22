package SegundoTrimestre.ConstrolesAnteriores.MatchADO;
import java.util.Arrays;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")

public class Miembro
{
	private String nombre;
	private int edad;
	private Relacion tRelaciones[];

	public Miembro(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.tRelaciones = new Relacion[0];
	}

	public void añadeRelacion(Miembro otro, Fecha fIni, Fecha fFin)
	{
		Relacion[] tNueva = Arrays.copyOf(tRelaciones, tRelaciones.length+1);
		tNueva[tRelaciones.length] = new Relacion(otro,fIni,fFin);
		this.tRelaciones = tNueva;
	}

	public Relacion[] gettRelaciones()
	{
		return tRelaciones;
	}

	public void settRelaciones(Relacion[] tRelaciones)
	{
		this.tRelaciones = tRelaciones;
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


	public int getEdad()
	{
		return edad;
	}


	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean esInfiel()
	{
		for(int i=0;i<this.tRelaciones.length-1;i++)
			for(int j=i+1;j<this.tRelaciones.length;j++)
				if(!(this.tRelaciones[i].getfIni().compareTo(this.tRelaciones[j].getfFin())>0
						|| this.tRelaciones[j].getfIni().compareTo(this.tRelaciones[i].getfFin())>0	))
					return true;
		return false;
	}

	public boolean haSidoTraicionado()
	{
		for(Relacion r1:this.tRelaciones)
			for(Relacion r2:r1.getPareja().tRelaciones)
				if(!(r1.getfIni().compareTo(r2.getfFin())>0
						||
						r2.getfIni().compareTo(r1.getfFin())>0)
						&&
						r2.getPareja()!=this)
					return true;
		return false;
	}

	public boolean haTenidoComoParejaA(Miembro otro)
	{
		for(Relacion relaciones : this.tRelaciones)
			if(relaciones.getPareja().equals(otro))
				return true;

		return false;
	}


	public boolean esSugar()
	{
		for(Relacion r:this.tRelaciones)
			if(this.edad>r.getPareja().edad+10)
				return true;
		return false;
	}

	public Miembro parejaMasPromiscua()
	{
		Miembro promis = new Miembro("", 20);

		for(Relacion r:this.tRelaciones)
			if(r.getPareja().gettRelaciones().length > promis.gettRelaciones().length)
				promis = r.getPareja();
		return promis;
	}

	public int compareTo(Miembro otro)
	{
		int res= this.gettRelaciones().length-otro.gettRelaciones().length;
		if(res==0)
		{
			Relacion r1=this.gettRelaciones()[0];
			Relacion r2=otro.gettRelaciones()[0];
			for(Relacion r:this.gettRelaciones())
			{
				if(r.getfIni().compareTo(r1.getfIni())<0)
					r1=r;
			}
			for(Relacion r:otro.gettRelaciones())
			{
				if(r.getfIni().compareTo(r2.getfIni())<0)
					r2=r;
			}
			res=r1.getfIni().compareTo(r2.getfIni());
		}
		return res;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Miembro miembro = (Miembro) o;
		return Objects.equals(nombre, miembro.nombre);
	}
}