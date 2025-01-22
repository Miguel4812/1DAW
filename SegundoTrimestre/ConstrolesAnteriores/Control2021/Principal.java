package SegundoTrimestre.ConstrolesAnteriores.Control2021;
import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class Principal
{
    
	public static void main(String[] args)
	{
		// CREAMOS UNA VARIABLE TIPO ZOOL�GICO
		Zoologico zoo = new Zoologico();
		
		//CREAMOS VETERINARIOS
		Veterinario v1 = (new Veterinario("Alex Cremento "));
		Veterinario v2 = (new Veterinario("Sindy Entes   "));
		Veterinario v3 = (new Veterinario("Isaac A. Mocos"));
		Veterinario v4 = (new Veterinario("Lali Cuadora  "));
		
		//LOS A�ADIMOS AL ZOOL�GICO
		zoo.añadeVeterinario(v1);
		zoo.añadeVeterinario(v2);
		zoo.añadeVeterinario(v3);
		zoo.añadeVeterinario(v4);
		
		//CREAMOS VARIOS ANIMALES, CON SUS PADRES, (PUEDEN SER null, SI SON LOS PRIMEROS)
		//FECHA DE NACIMIENTO Y SU VETERINARIO ASISTENTE (PUEDEN SER null, SI SON LOS PRIMEROS)
		Mamifero niko = new Mamifero("Niko",null,null,null,null);
		Mamifero kira = new Mamifero("Kira",null,null,null,null);
		Mamifero mili = new Mamifero("Mil�",null,null,null,null);
		Mamifero nala = new Mamifero("Nala",null,null,null,null);
		
		Mamifero borry = new Mamifero("Borry",niko,kira,new Fecha(2,2,2018),v1);
		Mamifero loqui = new Mamifero("Loqui",niko,kira,new Fecha(3,3,2018),v2);
		Mamifero luna = new Mamifero("Luna",niko,kira,new Fecha(4,4,2018),v2);
		Mamifero lola = new Mamifero("Lola",niko,kira,new Fecha(5,5,2018),v1);
			
		Mamifero nilo = new Mamifero("Nilo",mili,nala,new Fecha(5,5,2018),v3);
		Mamifero noah = new Mamifero("Noah",mili,nala,new Fecha(5,6,2018),v3);
		Mamifero noa = new Mamifero("Noa",mili,nala,new Fecha(7,5,2018),v4);
		Mamifero dana = new Mamifero("Dana",mili,nala,new Fecha(5,5,2019),v2);
		
		Mamifero noel = new Mamifero("Noel",nilo,lola,new Fecha(7,5,2018),v1);
		Mamifero nogo = new Mamifero("Nogo",nilo,lola,new Fecha(5,5,2019),v4);
		Mamifero duna = new Mamifero("Duna",nilo,lola,new Fecha(9,5,2018),v1);
		Mamifero bimba = new Mamifero("Bimba",nilo,lola,new Fecha(7,8,2019),v3);
		
		// Gamberro tiene un error intencionado en la fecha de nacimiento: nace antes que su madre
		Mamifero gamberro = new Mamifero("Gamberro",loqui,dana,new Fecha(8,8,2018),v3);
		Mamifero pluto = new Mamifero("Pluto",loqui,dana,new Fecha(9,9,2019),v3);
		Mamifero mia = new Mamifero("M�a",loqui,dana,new Fecha(7,5,2020),v2);
		Mamifero maya = new Mamifero("Maya",loqui,dana,new Fecha(7,8,2020),v4);
		
		//A�ADIMOS LOS MAM�FEROS AL ZOO
	    
		zoo.añadeMamifero(niko);
		zoo.añadeMamifero(kira);
		zoo.añadeMamifero(mili);
		zoo.añadeMamifero(nala);
		
		zoo.añadeMamifero(borry);
		zoo.añadeMamifero(loqui);
		zoo.añadeMamifero(luna);
		zoo.añadeMamifero(lola);
			
		zoo.añadeMamifero(nilo);
		zoo.añadeMamifero(noah);
		zoo.añadeMamifero(noa );
		zoo.añadeMamifero(dana);
		
		zoo.añadeMamifero(noel);
		zoo.añadeMamifero(nogo);
		zoo.añadeMamifero(duna);
		zoo.añadeMamifero(bimba);
		
		zoo.añadeMamifero(gamberro);
		zoo.añadeMamifero(pluto);
		zoo.añadeMamifero(mia);
		zoo.añadeMamifero(maya);
		
		//DESCOMENTAR PARA VER LOS DATOS CREADOS
		//mostrarTabla(zoo.gettMam�feros());
		//mostrarTabla(zoo.gettVeterinarios());
		
		//APARTADO A) 
		System.out.println("Apartado a) mam�feros nacidos entre las fechas 4/4/2019 y 7/5/2020\n");
		mostrarTabla(zoo.getMamiferosEntreFechas(new Fecha(4,4,2019),new Fecha(7,5,2020)));
		
	    //APARTADO B)
		System.out.println("\nApartado b)");
		System.out.println("Veterinarios que asistieron a m�s de 4 nacimientos: "+
		                    zoo.getNVeterinariosMasDe(4));
		
		//APARTADO C)
		System.out.print("\nApartado c):\n");
		System.out.println("�Alg�n veterinario asisti� a un mam�fero y sus dos padres?: "+
		                    zoo.veterinarioPadresEHijo()); 
			              
		System.out.print("\nApartado d):\n");
		System.out.println("�Hay alg�n error por fechas de padres mayores que la de hijos?: "+zoo.hayErroresEnFechas());
		
	}
	
	public static void mostrarTabla(SerVivo tabla[])
	{
		for(SerVivo s:tabla)
			System.out.println(s);
	}
	
	

}
