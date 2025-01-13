package SegundoTrimestre.ConstrolesAnteriores.TrenesPOO;

@SuppressWarnings("SpellCheckingInspection")
public class LineaFerrea {
    Tren[] trenes;
    Locomotora[] locomotoras;
    Vagon[] vagones;
    Maquinista[] maquinistas;

    public LineaFerrea()
    {
        this.trenes = new Tren[0];
        this.locomotoras = new Locomotora[0];
        this.vagones = new Vagon[0];
        this.maquinistas = new Maquinista[0];
    }

    public void anadeTren(Tren tren)
    {
        Tren tNueva[] = new Tren[this.trenes.length+1];
        for(int i=0;i<this.trenes.length;i++)
            tNueva[i] = this.trenes[i];
        tNueva[this.trenes.length] = tren;
        this.trenes = tNueva;
    }

    public void anadeLocomotora(Locomotora locomotora)
    {
        Locomotora tNueva[] = new Locomotora[this.locomotoras.length+1];
        for(int i=0;i<this.locomotoras.length;i++)
            tNueva[i] = this.locomotoras[i];
        tNueva[this.locomotoras.length] = locomotora;
        this.locomotoras = tNueva;
    }

    public void anadeVagon(Vagon vagon)
    {
        Vagon tNueva[] = new Vagon[this.vagones.length+1];
        for(int i=0;i<this.vagones.length;i++)
            tNueva[i] = this.vagones[i];
        tNueva[this.vagones.length] = vagon;
        this.vagones = tNueva;
    }

    public void anadeMaquinista(Maquinista maquinista)
    {
        Maquinista tNueva[] = new Maquinista[this.maquinistas.length+1];
        for(int i=0;i<this.maquinistas.length;i++)
            tNueva[i] = this.maquinistas[i];
        tNueva[this.maquinistas.length] = maquinista;
        this.maquinistas = tNueva;
    }

    public long totalCargaDeProducto(int numTren, String descripcion)
    {
        long totalCarga=0;
        for(Tren tren : trenes)
        {
            if(tren.getNumero()==numTren)
            {
                for(Vagon vagon : tren.getVagones())
                {
                    if(vagon!=null)
                    {
                        for(Carga carga : vagon.getCargas())
                        {
                            if(carga.getDescripcion().equalsIgnoreCase(descripcion))
                            {
                                totalCarga+=carga.getKilos();
                            }
                        }
                    }
                }
            }
        }
        return totalCarga;
    }

    public Tren[] trenesConducidosPor(String nombreMaquinista)
    {
        int contador = 0;
        for (Tren tren : trenes)
        {
            if (tren != null && nombreMaquinista.equalsIgnoreCase(tren.getMaquinista().getNombre()))
            {
                contador++;
            }
        }

        Tren[] resultado=new Tren[contador];
        contador=0;
        for (Tren tren : trenes)
        {
            if (tren != null && nombreMaquinista.equalsIgnoreCase(tren.getMaquinista().getNombre()))
            {
                resultado[contador]=tren;
                contador++;
            }
        }
        return resultado;
    }

    public int numMaquinistasConducenAlMenos(int numTrenes)
    {
        int []contadorTrenes = new int[maquinistas.length];
        for(Tren tren : trenes)
        {
           if(tren!=null)
           {
               Maquinista maquinista = tren.getMaquinista();
               for(int i=0; i<maquinistas.length; i++)
               {
                   if(maquinistas[i].equals(maquinista))
                   {
                       contadorTrenes[i]++;
                   }
               }
           }
        }

        int contador=0;
        for(int trenesPorMquinista : contadorTrenes)
        {
            if(trenesPorMquinista>=numTrenes)
                contador++;
        }
        return contador;
    }

    public boolean hayProblemas()
    {
        for(Tren tren : trenes)
        {
            if (tren != null)
            {
                long cargaTotal=0;
                for(Vagon vagon : tren.getVagones())
                {
                    if(vagon!=null)
                    {
                        for(Carga carga : vagon.getCargas())
                        {
                            if(carga != null)
                            {
                                cargaTotal+=carga.getKilos();
                            }
                        }
                    }
                }
                if(cargaTotal>tren.getLocomotora().getKgsCargaMax())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void eliminaVagonesConCargaDelTren(String descripcionCarga, int numTren)
    {
        for(Tren tren : trenes)
        {
            if(tren.getNumero()==numTren)
            {
                Vagon[] vagones = tren.getVagones();
                for (int i = 0; i < vagones.length; i++)
                {
                    if (vagones[i] != null)
                    {
                        for (Carga carga : vagones[i].getCargas())
                        {
                            if (carga != null && descripcionCarga.equalsIgnoreCase(carga.getDescripcion()))
                            {
                                vagones[i] = null; // Elimina el vagon
                                break;
                            }
                        }
                    }
                }
                break;
            }
        }
    }

    public Locomotora[] locomotorasQuePuedenLlevar(Vagon[] vagones)
    {
        long pesoTotal=0;
        for(Vagon vagon : vagones)
        {
            if(vagon!=null)
            {
                for(Carga carga : vagon.getCargas())
                {
                    if(carga!=null)
                    {
                        pesoTotal+=carga.getKilos();
                    }
                }
            }
        }

        Locomotora[] resultado=new Locomotora[0];

        for(Locomotora locomotora : locomotoras)
        {
            if(locomotora.getKgsCargaMax()>=pesoTotal)
            {
                resultado=AñadeLocomotoraUnaTabla(resultado, locomotora);
            }
        }
        return resultado;
    }

    public Locomotora[] AñadeLocomotoraUnaTabla(Locomotora[] Locomotoras, Locomotora locomotora)
    {
        Locomotora[]tNueva = new Locomotora[Locomotoras.length+1];

        for(int i=0;i<Locomotoras.length;i++)
            tNueva[i] = Locomotoras[i];

        tNueva[Locomotoras.length] = locomotora;

        return tNueva;
    }
}