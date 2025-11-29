public class NodoPiloto{
    private Piloto piloto;
    private NodoPiloto izquierdo;
    private NodoPiloto derecho;

    public NodoPiloto(Piloto piloto)
    {
        this.piloto = piloto;
        this.izquierdo = null;
        this.derecho = null;
    }

    public NodoPiloto getIzquierdo()
    {
        return this.izquierdo;
    }

    public NodoPiloto getDerecho()
    {
        return this.derecho;
    }

    public Piloto getPiloto()
    {
        return this.piloto;
    }

    public void setIzquierdo(NodoPiloto izquierdo)
    {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(NodoPiloto derecho)
    {
        this.derecho = derecho;
    }

}