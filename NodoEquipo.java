public class NodoEquipo {
    private Equipo equipo;
    private NodoEquipo siguiente;

    public NodoEquipo(Equipo equipo)
    {
        this.equipo = equipo;
        this.siguiente = null;
    }

    public Equipo getEquipo()
    {
        return this.equipo;
    }

    public NodoEquipo getSiguiente()
    {
        return this.siguiente;
    }

    public void setSiguiente(NodoEquipo siguiente)
    {
        this.siguiente = siguiente;
    }
    
}
