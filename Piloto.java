public class Piloto {
    private String nombre;
    private String nacionalidad;
    private int puntosObtenidos;
    private int cantidadDeCompetencias;

    public  Piloto(String nombre, String nacionalidad, int puntosObtenidos, int cantidadDeCompetencias)
    {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.puntosObtenidos = puntosObtenidos;
        this.cantidadDeCompetencias = cantidadDeCompetencias;
    }

    public int getPuntosObtenidos()
    {
        return this.puntosObtenidos;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public String getNacionalidad()
    {
        return this.nacionalidad;
    }

    public int getCantidadCompetencias()
    {
        return this.cantidadDeCompetencias;
    }

}
