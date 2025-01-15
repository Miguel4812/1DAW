package SegundoTrimestre.ConstrolesAnteriores.Facturas;

@SuppressWarnings("SpellCheckingInspection")
public class ModeloDeDatos {
    Articulo tArticulos[];
    Cliente tClientes[];
    Factura tFacturas[];

    public ModeloDeDatos()
    {
        this.tArticulos = new Articulo[0];
        this.tClientes = new Cliente[0];
        this.tFacturas = new Factura[0];
    }

    public void añadeArticulo(Articulo articuloNuevo)
    {
        Articulo nuevaTArticulos[] = new Articulo[this.tArticulos.length+1];
        for(int i=0;i<this.tArticulos.length;i++)
        nuevaTArticulos[i] = tArticulos[i];

        nuevaTArticulos[this.tArticulos.length]= articuloNuevo;
        this.tArticulos = nuevaTArticulos;
    }

    public void añadeFactura(Factura FacturaNueva)
    {
        Factura nuevaTFacturas[] = new Factura[this.tFacturas.length+1];
        for(int i=0;i<this.tFacturas.length;i++)
            nuevaTFacturas[i] = tFacturas[i];

        nuevaTFacturas[this.tFacturas.length]= FacturaNueva;
        this.tFacturas = nuevaTFacturas;
    }

    public void añadeCliente(Cliente clienteNuevo)
    {
        Cliente nuevaTClientes[] = new Cliente[this.tClientes.length+1];
        for(int i=0;i<this.tClientes.length;i++)
            nuevaTClientes[i] = tClientes[i];

        nuevaTClientes[this.tClientes.length]= clienteNuevo;
        this.tClientes = nuevaTClientes;
    }

    public Factura facturaFusionada(Cliente cliente, int numFra)
    {
        Factura resultado = new Factura(numFra, cliente, 0);
        int contador;

        for(Factura factura: tFacturas)
        {
            if(factura.getCliente().equals(cliente))
            {
                contador=factura.gettLineas().length;
                for(int i=0;i<contador;i++)
                {
                    resultado.añadeLinea(factura.gettLineas()[i]);
                }
            }
        }

        return resultado;
    }

    public Factura facturaFusionadaResumida(Cliente cliente, int numFra)
    {
        Articulo n1;
        Articulo n2;
        Factura resultado = facturaFusionada(cliente, numFra);

        for(int i=0;i<resultado.gettLineas().length;i++)
        {
            n1 = resultado.gettLineas()[i].getArticulo();
            for(int j=i+1;j<resultado.gettLineas().length;j++)
            {
                n2 = resultado.gettLineas()[j].getArticulo();
                if(n1.getCodigo()==n2.getCodigo())
                {
                    resultado.settLineas(eliminarLinea(resultado.gettLineas(), j));
                }
            }
        }

        return resultado;
    }

    public float gastoPorCliente(Cliente cliente)
    {
        float resultado = 0;

        for(Factura factura: tFacturas)
        {
            if(factura.getCliente().equals(cliente))
            {
                resultado += factura.getImporteTotalFra();
            }
        }

        return resultado;
    }

    public Cliente clienteMayorGasto()
    {
        float gasto = 0, total=0;
        Cliente clienteMayor = new Cliente("", "");

        for(Cliente cliente: tClientes)
        {
            total = gastoPorCliente(cliente);
            if(total > gasto)
            {
                gasto = total;
                clienteMayor = cliente;
            }
        }


        return clienteMayor;
    }

    public Articulo[] articulosPorVentas()
    {
        int ventas, temporal;
        Articulo auxiliar, venta;
        int[] tventas=new int[tArticulos.length];
        Articulo[] articulos=new Articulo[tArticulos.length];

        for(Factura factura: tFacturas)
        {
            for(Linea linea: factura.gettLineas())
            {
                ventas = totalUnidadesVendidas(linea.getArticulo());
                venta = linea.getArticulo();
                for(int i = 0;i<tArticulos.length;i++)
                {
                    if(ventas>tventas[i])
                    {
                        temporal = tventas[i];
                        tventas[i] = ventas;
                        ventas=temporal;
                        auxiliar = articulos[i];
                        articulos[i] = venta;
                        venta = auxiliar;
                    }
                }
            }
        }

        return articulos;
    }

    public int totalUnidadesVendidas(Articulo articulo)
    {
        int resultado = 0;

        for(Factura factura: tFacturas)
        {
            for(Linea linea: factura.gettLineas())
            {
                if(linea.getArticulo().getCodigo()==articulo.getCodigo())
                {
                    resultado+=linea.getCantidad();
                }
            }
        }

        return resultado;
    }
    public Linea[] eliminarLinea(Linea[] lineas, int numLinea)
    {
        Linea[] tNueva = new Linea[lineas.length-1];

        for(int i=0; i<numLinea; i++)
        {
            tNueva[i] = lineas[i];
        }

        for(int i = numLinea+1; i<lineas.length; i++)
        {
            tNueva[i-1] = lineas[i];
        }

        return tNueva;
    }
}
