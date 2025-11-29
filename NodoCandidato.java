public class NodoCandidato {
    private Candidato candidato;
    private NodoCandidato siguiente;
    private NodoCandidato anterior;

    public NodoCandidato(Candidato candidato)
    {
        this.candidato = candidato;
        this.siguiente = null;
        this.anterior = null;
    }

    //GETS
    public Candidato getCandidato()
    {
        return this.candidato;
    }

    public NodoCandidato getSiguiente()
    {
        return this.siguiente;
    }

    public NodoCandidato getAnterior()
    {
        return this.anterior;
    }

    //SETS
    public void setSiguiente(NodoCandidato siguiente)
    {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoCandidato anterior)
    {
        this.anterior = anterior;
    }


    
}
