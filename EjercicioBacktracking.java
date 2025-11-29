public class EjercicioBacktracking{
    private int[] costos;
    private int[] puntajes;
    private int mejorPuntaje;

    public EjercicioBacktracking(int[] costos, int[] puntajes, int energiaDisponible)
    {
        this.costos = costos;
        this.puntajes = puntajes;
        this.mejorPuntaje = 0;
    }

    public int resolver(int indice, int energiaRestante, int puntajeAcumulado)
    {
        int resultado = 0;

        if(indice >= this.costos.length || energiaRestante < 0)
        {
            resultado = puntajeAcumulado;

            if(puntajeAcumulado > this.mejorPuntaje)
            {
                this.mejorPuntaje = puntajeAcumulado;
            }
        } else {
            int puntajeSinTarea = resolver( indice + 1, energiaRestante, puntajeAcumulado);

            int puntajeConTarea = 0;

            if(energiaRestante >= this.costos[indice])
            {
                int nuevaEnergia = energiaRestante - this.costos[indice];
                puntajeConTarea = resolver(indice + 1, nuevaEnergia, puntajeAcumulado + this.puntajes[indice]);
            }

            if(puntajeSinTarea > puntajeConTarea)
            {
                resultado = puntajeSinTarea;
            } else {
                resultado = puntajeConTarea;
            }
        }
        return resultado;
    }
   
}