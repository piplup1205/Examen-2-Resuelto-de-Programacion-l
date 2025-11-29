public class Equipo {
    private String nombre;
    private String pais;
    private ArbolPilotos pilotos;
    private ListaCandidatos candidatos;

    public Equipo(String nombre, String pais)
    {
        this.pilotos = new ArbolPilotos();
        this.candidatos = new ListaCandidatos();
        this.nombre = nombre;
        this.pais = pais;
    }

    public ArbolPilotos getPilotos()
    {
        return this.pilotos;
    }

    public ListaCandidatos getCandidatos()
    {
        return this.candidatos;
    }

    public String getNombre()
    {
        return this.nombre;
    }

     public String getPais()
    {
        return this.pais;
    }

    public void escogerPiloto()
    {
        Candidato candidato = this.candidatos.escogerPiloto();
        if(candidato != null)
        {
            Piloto nuevoPiloto = new Piloto(candidato.getNombre(), candidato.getNacionalidad(), candidato.getPuntosObtenidos(), 0);
            this.pilotos.insertarPiloto(nuevoPiloto);
        }

    }
  
}
