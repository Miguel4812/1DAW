package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen1920Ejercicio1 {

    public static void main(String[] args)
    {
        String correo,codigo,codigoMasCaro="",codigo1="",correo1="",correoMasCaro="";
        int unidadesCompradas,numeroArticulos=0,clientesPremiun5=0;
        float clientes=0,clientesPremiun=0,precioTotalPremiun=0,precioTotalNoPremiun=0,precioUnitario=0,total=0,totalUnidadesS=0,totalUnidadesN=0;
        Float precioUnitarioMax=null,totalMax=null,totalUnidadesMaxS=null,totalUnidadesMaxN=null;
        char premiun;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("Introduzca el correo electronico: ");
            correo=sc.nextLine();
            if(correo.equalsIgnoreCase("Fin"))
                break;
            else
            {
                correo1=correo;
                System.out.println("¿Es premiun? ");
                premiun=(sc.nextLine()).charAt(0);

                //Contador de los premiun para calcular luego el porcentaje
                if(premiun=='S')
                    clientesPremiun++;

                while(true)
                {
                    System.out.println("Introduzca el codigo: ");
                    codigo=sc.nextLine();

                    if(codigo.equalsIgnoreCase("Fin"))
                        break;
                    else
                    {
                        codigo1=codigo;
                        System.out.println("Introduzca el número de cantidades compradas: ");
                        unidadesCompradas=Integer.parseInt(sc.nextLine());

                        System.out.println("Introduzca el precio unitario: ");
                        precioUnitario=Float.parseFloat(sc.nextLine());

                        //Precio total de los premiun
                        if(premiun=='S')
                        {
                            precioTotalPremiun=precioTotalPremiun+(unidadesCompradas*precioUnitario);
                            totalUnidadesS=totalUnidadesS+unidadesCompradas;
                        }
                        //Precio total de los no premiun
                        else
                        {
                            precioTotalNoPremiun=precioTotalNoPremiun+(unidadesCompradas*precioUnitario);
                            totalUnidadesN=totalUnidadesN+unidadesCompradas;
                        }
                        //Contador de articulos
                        numeroArticulos++;
                        //precio total gastado por el comprador
                        total=total+unidadesCompradas*precioUnitario;
                    }
                }
                //Termina de pedir los productos

                //guardar el cliente que gasto más
                if(totalMax==null)
                {
                    totalMax=total;
                    correoMasCaro=correo1;
                }
                else if(totalMax<total)
                {
                    totalMax=total;
                    correoMasCaro=correo1;
                }
                //Si solo comprar un articulo, guardar el más caro
                if(numeroArticulos==1)
                {
                    if(precioUnitarioMax==null)
                    {
                        precioUnitarioMax=precioUnitario;
                        codigoMasCaro=codigo1;
                    }
                    else if(precioUnitarioMax<precioUnitario)
                    {
                        precioUnitarioMax=precioUnitario;
                        codigoMasCaro=codigo1;
                    }
                }
                //Calculo si hay clientes oremiun con 5 articulos diferentes
                else if(numeroArticulos>=5&&premiun=='S')
                {
                    clientesPremiun5++;
                }
                //guardo el cliente normal con mas unidades contadas
                if(totalUnidadesMaxN==null)
                    totalUnidadesMaxN=totalUnidadesN;
                else if(totalUnidadesMaxN<totalUnidadesN)
                    totalUnidadesMaxN=totalUnidadesN;

                //guardo el cliente premiun con mas unidades contadas
                if(totalUnidadesMaxS==null)
                    totalUnidadesMaxS=totalUnidadesS;
                else if(totalUnidadesMaxS<totalUnidadesS)
                    totalUnidadesMaxS=totalUnidadesS;

                //Contador de clientes para calcular luego el porcentaje
                clientes++;
                total=0;
                totalUnidadesN=totalUnidadesS=0;
                numeroArticulos=0;
            }
        }
        //Termina de pedir los clientes

        //Calculo el porcentaje de clientes premiun
        float porcentajeClientesPremiun=(clientesPremiun/clientes)*100;
        System.out.println("Porcentaje de clientes Premium: "+porcentajeClientesPremiun);
        //Aqui veo que tipo de clientes gasto más
        if(precioTotalPremiun>precioTotalNoPremiun)
            System.out.println("Han gastado más dinero los clientes premiun.");
        else
            System.out.println("Han gastado más dinero los clientes no premiun.");
        if(codigoMasCaro=="")
            System.out.println("Ningún cliente compró solo un tipo de artículo.");
        else
            System.out.println("El código del artículo más caro de los clientes que compraron un sólo artículo es: "+codigoMasCaro);
        System.out.println("Cliente que gastó más dinero: "+correoMasCaro);
        System.out.println("Número de clientes Premium que compraron al menos cinco artículos distintos: "+clientesPremiun5);
        if(totalUnidadesMaxN>totalUnidadesMaxS)
            System.out.println("El cliente que compró más unidades de artículos en total era Normal.");
        else
            System.out.println("El cliente que compró más unidades de artículos en total era Premiun.");
        sc.close();
    }
}
