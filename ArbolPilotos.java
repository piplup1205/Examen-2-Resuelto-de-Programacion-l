public class ArbolPilotos {
    private NodoPiloto raiz;

    public ArbolPilotos()
    {
        this.raiz = null;
    }

    public NodoPiloto getRaiz()
    {
        return this.raiz;
    }

    public void setRaiz(NodoPiloto raiz)
    {
        this.raiz = raiz;
    }

    public void insertarPiloto(Piloto piloto)
    {
        this.raiz = insertarRecursivo(this.raiz, piloto);
    }

    private NodoPiloto insertarRecursivo(NodoPiloto nodo, Piloto piloto)
    {
        NodoPiloto acomodar = nodo;

        if(nodo == null)
        {
            acomodar = new NodoPiloto(piloto);
        } else {
            if(piloto.getCantidadCompetencias() <= nodo.getPiloto().getCantidadCompetencias())
            {
                nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), piloto));
            } else {
                nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), piloto));
            }
        }
        return acomodar;
    }
}
