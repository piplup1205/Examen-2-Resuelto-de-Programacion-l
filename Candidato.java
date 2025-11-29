public class Candidato {
    private String nombre;
    private String nacionalidad;
    private int puntosObtenidos;

    public Candidato(String nombre, String nacionalidad, int puntosObtenidos)
    {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.puntosObtenidos = puntosObtenidos;
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
    
}
