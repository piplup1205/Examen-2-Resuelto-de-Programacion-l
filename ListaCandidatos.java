public class ListaCandidatos {
    private NodoCandidato primero;

    public ListaCandidatos()
    {
        this.primero = null;
    }

    public Candidato escogerPiloto()  //REVISAR
    {
        Candidato candidatoElegido = null;

        if(this.primero != null)
        {
            NodoCandidato actual = this.primero;

            if(actual.getSiguiente() == null)
            {
                candidatoElegido = actual.getCandidato();
                this.primero = null;
            } else {
                while (actual.getSiguiente() != null)
                {
                    actual = actual.getSiguiente();
                }
                candidatoElegido = actual.getCandidato();
                actual.getAnterior().setSiguiente(null);
            }
        }
        return candidatoElegido;
    }

    //Este metodo lo hice para que los candidatos se agreguen ordenadamente en la lista
    public void insertarCandidato(Candidato candidato)
    {
        NodoCandidato nuevoNodo = new NodoCandidato(candidato);

        if(this.primero == null)
        {
            this.primero = nuevoNodo;
        } else {
            if (candidato.getPuntosObtenidos() < this.primero.getCandidato().getPuntosObtenidos()) 
            {
                nuevoNodo.setSiguiente(this.primero);
                this.primero.setAnterior(nuevoNodo);
                this.primero = nuevoNodo;
            } else {
                NodoCandidato actual = this.primero;
            
                while (actual.getSiguiente() != null && actual.getSiguiente().getCandidato().getPuntosObtenidos() < candidato.getPuntosObtenidos()) 
                {
                    actual = actual.getSiguiente();
                }

                nuevoNodo.setSiguiente(actual.getSiguiente());
                nuevoNodo.setAnterior(actual);
            
                if (actual.getSiguiente() != null) 
                {
                    actual.getSiguiente().setAnterior(nuevoNodo);
                }
            
                actual.setSiguiente(nuevoNodo);
            }
        }       

    }
 
    public void imprimirListaCandidatos()
    {
        if (this.primero == null) 
        {
            System.out.println("La lista de candidatos está vacía");
        } else {
            NodoCandidato actual = this.primero;
        
            while(actual != null)
            {
                System.out.print(actual.getCandidato().getNombre()+ " ");
                actual = actual.getSiguiente();
            }
        }
    }


    public NodoCandidato getPrimero()
    {
        return this.primero;
    }

    public void setPrimero(NodoCandidato primero)
    {
        this.primero = primero;
    }
    
}
