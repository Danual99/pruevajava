import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosClaseVarios {

    public static void main(String[] args) {

        Map<String,Integer> mapaSelecciones = new HashMap<String,Integer>();
        mapaSelecciones.put("España", 1);
        mapaSelecciones.put("Alemania", 4);
        mapaSelecciones.put("Brasil", 5);
        mapaSelecciones.put("Italia", 4);
        mapaSelecciones.put("Argentina",3);
        mapaSelecciones.put("Uruguay",2);
        mapaSelecciones.put("Francia",2);
        mapaSelecciones.put("Inglaterra", 1);

        Map<String, List> mapSeleccionJugador = new HashMap<String,List>();

        List<String> jugadoresEspana = List.of("Simon", "PauTorres", "Laporte", "EricGarcia", "Balde", "JordiAlba", "Carvajal", "Azpilicueta");
        List<String> jugadoresAlemania = List.of("TerStegen", "Rudiger", "Sule", "Nico", "Kehrer","Goretzka");
        List<String> jugadoresBrasil = List.of("Neymar","Vinicius","Alisson","Casemiro", "Paqueta");
        List<String> jugadoresItalia = List.of("Chiesa","Politano","Raspadori","Gnoto","Bonucci");
        List<String> jugadoresArgentina = List.of("Messi","DiMaria","Montiel","Papu","Dibu");
        List<String> jugadoresUruguay = List.of("Darwin", "Maxi","Cavani","Pellistri","Carballo");
        List<String> jugadoresFrancia = List.of("Benzema","Kounde","Mbape","Pogba","Griezman");
        List<String> jugadoresInglaterra = List.of("Kane","Saka","Maguire","Foden","Bellingham");

        mapSeleccionJugador.put("España", jugadoresEspana);
        mapSeleccionJugador.put("Alemania",jugadoresAlemania);
        mapSeleccionJugador.put("Brasil",jugadoresBrasil);
        mapSeleccionJugador.put("Italia",jugadoresItalia);
        mapSeleccionJugador.put("Argentina",jugadoresArgentina);
        mapSeleccionJugador.put("Uruguay",jugadoresUruguay);
        mapSeleccionJugador.put("Francia",jugadoresFrancia);
        mapSeleccionJugador.put("Inglaterra",jugadoresInglaterra);




    }

}
