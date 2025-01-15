package SegundoTrimestre.ConstrolesAnteriores.Facturas;

@SuppressWarnings("SpellCheckingInspection")
public class Linea {
    Articulo articulo;
    int cantidad;

    public Linea(Articulo articulo, int cantidad)
    {
        super();
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
    public Articulo getArticulo()
    {
        return articulo;
    }
    public void setArticulo(Articulo articulo)
    {
        this.articulo = articulo;
    }
    public int getCantidad()
    {
        return cantidad;
    }
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public String toString()
    {
        return this.articulo.getCodigo()+ " | "+(this.articulo.getDescripcion()+"                  ").substring(0,25)+
                " | "+("    "+this.articulo.getPrecioUnitario()).substring(("    "+this.articulo.getPrecioUnitario()).length()-5,("    "+this.articulo.getPrecioUnitario()).length() )+
                " | "+("     "+this.cantidad).substring(("     "+this.cantidad).length()-3, ("     "+this.cantidad).length())+" | "+
                ("       "+this.getTotalLinea()).substring(
                        ("       "+this.getTotalLinea()).length()-7,("       "+this.getTotalLinea()).length());
    }

    public float getTotalLinea()
    {
        return this.articulo.getPrecioUnitario()*this.cantidad;
    }
}
