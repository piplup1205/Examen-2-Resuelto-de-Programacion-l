public class Main {

    public static void main(String[] args)
    {
        ListaEquipos listaEquipos = new ListaEquipos();
        
        //Equipos
        Equipo ferrari = new Equipo("Ferrari", "Italia");
        Equipo mercedes = new Equipo("Mercedes", "Alemania");
        Equipo redbull = new Equipo("RedBull", "Austria");

        //Candidatos para RedBull
        Candidato candidato1 = new Candidato("Juan", "CR", 50);
        Candidato candidato2 = new Candidato("Sofia", "CR", 80);
        Candidato candidato3 = new Candidato("Pedro", "Brasil", 70);
        Candidato candidato4 = new Candidato("Daniela", "Colombia", 90);
        Candidato candidato5 = new Candidato("Maria", "Australia", 75);

        //Candidatos para Mercedes
        Candidato candidato6 = new Candidato("Josue", "Austria", 22);
        Candidato candidato7 = new Candidato("Pablo", "Francia", 103);
        Candidato candidato8 = new Candidato("Eduardo", "Italia", 88);

        //Pilotos
        Piloto piloto1 = new Piloto("Mario", "Venezuela", 67, 2);
        Piloto piloto2 = new Piloto("Marco", "Ecuador", 32, 3);
        Piloto piloto3 = new Piloto("Esteban", "Argentina", 22, 8);
        Piloto piloto4 = new Piloto("Valentina", "Mexico", 97, 9);
        Piloto piloto5 = new Piloto("Sara", "CR", 105, 4);
        Piloto piloto6 = new Piloto("Alex", "Uruguay", 88, 14);
        Piloto piloto7 = new Piloto("Camila", "Paraguay", 77, 7);

        //Insertando equipos en la lista de equipos
        listaEquipos.insertarEquipo(ferrari);
        listaEquipos.insertarEquipo(redbull);
        listaEquipos.insertarEquipo(mercedes);

        //Insertando pilotos en los equipos
        ferrari.getPilotos().insertarPiloto(piloto7);
        ferrari.getPilotos().insertarPiloto(piloto1);
        ferrari.getPilotos().insertarPiloto(piloto5);

        mercedes.getPilotos().insertarPiloto(piloto4);
        mercedes.getPilotos().insertarPiloto(piloto2);

        redbull.getPilotos().insertarPiloto(piloto6);
        redbull.getPilotos().insertarPiloto(piloto3);

        System.out.println();
        //Metodo insertar Candidatos en la lista para probar escogerPiloto
        System.out.print("Escoger nuevo piloto de los candidatos de Redbull: ");
        redbull.getCandidatos().insertarCandidato(candidato1); //50
        redbull.getCandidatos().insertarCandidato(candidato4); //80
        redbull.getCandidatos().insertarCandidato(candidato3); //70
        redbull.getCandidatos().insertarCandidato(candidato2); //90
        redbull.getCandidatos().insertarCandidato(candidato5); //75
        redbull.getCandidatos().imprimirListaCandidatos();
        System.out.println();
        
        redbull.escogerPiloto();
        System.out.println("Piloto 1 agregado al arbol de pilotos RedBull");
        System.out.println();

        redbull.escogerPiloto();
        System.out.println("Piloto 2 agregado al arbol de pilotos RedBull");
        System.out.println();

        redbull.escogerPiloto();
        System.out.println("Piloto 3 agregado al arbol de pilotos RedBull");
        System.out.println();
        System.out.println("Candidatos no elegidos:");
        redbull.getCandidatos().imprimirListaCandidatos(); //Imprime la lista para verificar que si se borran los elegidos
        System.out.println();

        System.out.println();
        System.out.print("Escoger nuevo piloto de los candidatos de Mercedes: ");
        mercedes.getCandidatos().insertarCandidato(candidato6); //22 puntos
        mercedes.getCandidatos().insertarCandidato(candidato7); //103 puntos
        mercedes.getCandidatos().insertarCandidato(candidato8); //88 puntos
        mercedes.getCandidatos().imprimirListaCandidatos();
        System.out.println();
        mercedes.escogerPiloto();
        System.out.println("Piloto 1 agregado al arbol de pilotos Mercedes");
        System.out.println();
        System.out.println("Candidatos no elegidos:");
        mercedes.getCandidatos().imprimirListaCandidatos(); //Imprime la lista para verificar que si se borran los elegidos
        
        System.out.println();
        System.out.println();
        //Para escoger al mejor piloto
        Piloto mejor = listaEquipos.seleccionarMejorPiloto();
        System.out.println("El mejor piloto es: " + mejor.getNombre());
        System.out.println("Su nacionalidad es: " + mejor.getNacionalidad());
        System.out.println("Su puntaje es: " + mejor.getPuntosObtenidos());
        System.out.println("Ha participado en " + mejor.getCantidadCompetencias()+ " competencias");

        //EJERCICIO 4
        System.out.println();
        int[] costos = {3, 2, 4, 1};
        int[] puntajes = {10, 5, 8, 4};
        int energiaDisponible = 5;
        EjercicioBacktracking bt = new EjercicioBacktracking(costos, puntajes, energiaDisponible);
        int puntajeMaximo = bt.resolver(0, energiaDisponible, 0);
        System.out.println("EJERCICIO 4");
        System.out.println("Mejor puntaje obtenido: " + puntajeMaximo);

    }
}
