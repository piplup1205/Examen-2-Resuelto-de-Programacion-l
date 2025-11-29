public class ListaEquipos {
    private NodoEquipo primero;

    public ListaEquipos()
    {
        this.primero = null;
    }

    public Piloto seleccionarMejorPiloto()
    {
        Piloto mejorPiloto = null;
        NodoEquipo actualEquipo = this.primero;

        while(actualEquipo != null)
        {
            NodoPiloto raizArbol = actualEquipo.getEquipo().getPilotos().getRaiz();
            mejorPiloto = buscarMejorEnArbol(raizArbol, mejorPiloto);
            actualEquipo = actualEquipo.getSiguiente();
        }
        return mejorPiloto;
    }

    private Piloto buscarMejorEnArbol(NodoPiloto nodo, Piloto mejorActual)
    {
        if(nodo!=null)
        {
            if(mejorActual == null || nodo.getPiloto().getPuntosObtenidos() > mejorActual.getPuntosObtenidos())
            {
                mejorActual = nodo.getPiloto();
            }

            mejorActual = buscarMejorEnArbol(nodo.getIzquierdo(), mejorActual);

            mejorActual = buscarMejorEnArbol(nodo.getDerecho(), mejorActual);
        }
        return mejorActual;
    }

    public void insertarEquipo(Equipo equipo)
    {
        NodoEquipo nuevoNodo = new NodoEquipo(equipo);

        if(this.primero == null)
        {
            this.primero = nuevoNodo;
        } else {
            NodoEquipo actual = this.primero;
            while(actual.getSiguiente() != null)
            {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }

    }
    
}
