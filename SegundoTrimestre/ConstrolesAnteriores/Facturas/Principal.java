package SegundoTrimestre.ConstrolesAnteriores.Facturas;
import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class Principal
{
    private ModeloDeDatos modeloDeDatos;

    public static void main(String[] args)
    {
        new Principal();
    }

    public Principal()
    {
        this.modeloDeDatos = new ModeloDeDatos();

        Articulo a1 = new Articulo(23,"Monitor 15 pulgadas",180.5F);
        Articulo a2 = new Articulo(34,"Monitor 17 pulgadas",190.5F);
        Articulo a3 = new Articulo(45,"Monitor 22 pulgadas",210.5F);
        Articulo a4 = new Articulo(56,"Impresora A3",125.6F);
        Articulo a5 = new Articulo(67,"Impresora A4",87.5F);
        Articulo a6 = new Articulo(78,"Teclado inalambrico",21.5F);
        Articulo a7 = new Articulo(89,"Raton cableado",6.5F);
        Articulo a8 = new Articulo(91,"Raton inalambrico",12.5F);

        this.modeloDeDatos.añadeArticulo(a1);
        this.modeloDeDatos.añadeArticulo(a2);
        this.modeloDeDatos.añadeArticulo(a3);
        this.modeloDeDatos.añadeArticulo(a4);
        this.modeloDeDatos.añadeArticulo(a5);
        this.modeloDeDatos.añadeArticulo(a6);
        this.modeloDeDatos.añadeArticulo(a7);
        this.modeloDeDatos.añadeArticulo(a8);

        Cliente c1 = new Cliente("1234567B","Lola Mento");
        Cliente c2 = new Cliente("8635429D","Helen Chufe");
        Cliente c3 = new Cliente("9234865Q","Jorge Nitales");
        Cliente c4 = new Cliente("7654567F","Oscar Acolillo");

        this.modeloDeDatos.añadeCliente(c1);
        this.modeloDeDatos.añadeCliente(c2);
        this.modeloDeDatos.añadeCliente(c3);
        this.modeloDeDatos.añadeCliente(c4);

        Factura f01 = new Factura(10,c1,5.8F);
        f01.añadeLinea(new Linea(a1,2));
        f01.añadeLinea(new Linea(a2,1));

        Factura f02 = new Factura(11,c2,15.5F);
        f02.añadeLinea(new Linea(a3,3));
        f02.añadeLinea(new Linea(a4,4));
        f02.añadeLinea(new Linea(a5,1));
        f02.añadeLinea(new Linea(a6,3));

        Factura f03 = new Factura(12,c3,12.6F);
        f03.añadeLinea(new Linea(a7,5));
        f03.añadeLinea(new Linea(a8,6));

        Factura f04 = new Factura(13,c4,13.1F);
        f04.añadeLinea(new Linea(a1,7));

        Factura f05 = new Factura(14,c1,15.0F);
        f05.añadeLinea(new Linea(a2,3));
        f05.añadeLinea(new Linea(a3,4));

        Factura f06 = new Factura(15,c1,25.0F);
        f06.añadeLinea(new Linea(a4,7));
        f06.añadeLinea(new Linea(a5,6));
        f06.añadeLinea(new Linea(a6,5));
        f06.añadeLinea(new Linea(a7,4));
        f06.añadeLinea(new Linea(a8,3));
        f06.añadeLinea(new Linea(a1,1));

        Factura f07 = new Factura(16,c2,6.6F);
        f07.añadeLinea(new Linea(a2,2));
        f07.añadeLinea(new Linea(a3,10));

        Factura f08 = new Factura(17,c2,14.3F);
        f08.añadeLinea(new Linea(a4,2));
        f08.añadeLinea(new Linea(a5,4));
        f08.añadeLinea(new Linea(a6,1));

        Factura f09 = new Factura(18,c2,0.0F);
        f09.añadeLinea(new Linea(a7,5));
        f09.añadeLinea(new Linea(a8,3));

        Factura f10 = new Factura(19,c3,4.2F);
        f10.añadeLinea(new Linea(a1,4));

        this.modeloDeDatos.añadeFactura(f01);
        this.modeloDeDatos.añadeFactura(f02);
        this.modeloDeDatos.añadeFactura(f03);
        this.modeloDeDatos.añadeFactura(f04);
        this.modeloDeDatos.añadeFactura(f05);
        this.modeloDeDatos.añadeFactura(f06);
        this.modeloDeDatos.añadeFactura(f07);
        this.modeloDeDatos.añadeFactura(f08);
        this.modeloDeDatos.añadeFactura(f09);
        this.modeloDeDatos.añadeFactura(f10);

        System.out.println("\nSalida Apartado a) para el cliente c1 ******************");
        System.out.println(this.modeloDeDatos.facturaFusionada(c1, 321));

        System.out.println("\nSalida Apartado b) para el cliente c1 *******************");
        System.out.println(this.modeloDeDatos.facturaFusionadaResumida(c1, 666));

        System.out.println("\nSalida Apartado c) para el cliente c1 *******************");
        System.out.println(this.modeloDeDatos.gastoPorCliente(c1));

        System.out.println("\nSalida Apartado d) **************************************");
        System.out.println(this.modeloDeDatos.clienteMayorGasto());

        System.out.println("\nSalida Apartado e) para el articulo a3 ******************");
        System.out.println(this.modeloDeDatos.totalUnidadesVendidas(a3));

        System.out.println("\nSalida Apartado f) **************************************");
        System.out.println(Arrays.toString(this.modeloDeDatos.articulosPorVentas()));
    }
}

