package PrimerTrimestre.PruebasExamenesPrimerControl;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Examen2324 {

    public static void main(String[] args)
    {
        String nombreTienda,nombreArticulo,nombreArticuloMaxResto="",nombreArticuloMinAntesB="";
        int numeroMaxArticuloB=0,numeroArticuloB=0, numeroArticuloBajada=0;
        float restoMax=0,numeroArticulo=0,numeroTienda=0,precioAntesBmin=2000;
        char siono;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el nombre de la tienda: ");
        nombreTienda=sc.nextLine();

        while(!nombreTienda.equalsIgnoreCase("Fin"))
        {
            System.out.println("Introduzca si esta en campaña (S/N): ");
            siono=(sc.nextLine()).charAt(0);

            System.out.println("Introduzca el nombre del articulo: ");
            nombreArticulo=sc.nextLine();

            while(!nombreArticulo.equalsIgnoreCase("fin"))
            {
                System.out.println("Introduzca el precio normal: ");
                float precioNormal=Float.parseFloat(sc.nextLine());

                System.out.println("Introduzca el precio antes del Black Friday: ");
                float precioAntesB=Float.parseFloat(sc.nextLine());

                System.out.println("Introduzca el precio despues del Black Friday: ");
                float precioDespuesB=Float.parseFloat(sc.nextLine());

                float resto=precioNormal-precioDespuesB;

                if(resto>restoMax)
                {
                    restoMax=resto;
                    nombreArticuloMaxResto=nombreArticulo;
                }

                if(resto>0)
                    numeroArticuloBajada++;

                numeroArticulo++;

                if(siono=='S')
                    numeroArticuloB++;

                if(siono=='N'&&precioAntesB<precioAntesBmin)
                {
                    precioAntesBmin=precioAntesB;
                    nombreArticuloMinAntesB=nombreArticulo;
                }

                System.out.println("Introduzca el nombre del articulo: ");
                nombreArticulo=sc.nextLine();
            }

            if(numeroMaxArticuloB<numeroArticuloB)
                numeroMaxArticuloB=numeroArticuloB;

            numeroTienda++;
            numeroArticuloB=0;

            System.out.println("Introduzca el nombre de la tienda: ");
            nombreTienda=sc.nextLine();
        }
        System.out.println("Número medio de productos estudiados: "+(numeroArticulo/numeroTienda));
        System.out.println("Número maximo de productos estudiados en las tiendas \nque si han echo campaña en el Black Friday: "+numeroMaxArticuloB);
        System.out.println("Nombre del producto que a bajado más euros entre su \nprecio normal y su precio en Black Friday: "+nombreArticuloMaxResto);
        System.out.println("Número de productos que han bajado de precio \nrealmente en Black Friday con respecto a su precio normal: "+numeroArticuloBajada);
        System.out.println("Nombre del producto con precio justo antes del Black \nFriday más barato de las tiendas que no hacen campaña en el Black Friday: "+nombreArticuloMinAntesB);
        sc.close();
    }
}
