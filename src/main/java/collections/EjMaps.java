package collections;

import enums.Marca;
import model.Auto;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EjMaps {
    public static void main(String[] args) {

        Auto auto1 = new Auto("AB123JV", 2020, "Rojo", 14000, "Focus", Marca.FORD);
        Auto auto2 = new Auto("AG012BB", 2024, "Azul", 15000, "C3", Marca.CITROEN);
        Auto auto3 = new Auto("AA123KK", 2022, "Negro", 130000, "C4", Marca.CITROEN);
        Auto auto4 = new Auto("AB123LL", 2023, "Gris", 125000, "Ecosport", Marca.FORD);
        Auto auto5 = new Auto("AB123NN", 2023, "Blanco", 125000, "Gol", Marca.VW);
        Auto auto6 = new Auto("AA123NN", 2020, "Gris", 150000, "Corolla", Marca.TOYOTA);
        Auto auto7 = new Auto("AG124AA", 2024, "Rojo", 25000, "Yaris", Marca.TOYOTA);

        //Mapa de doble entrada: clave: Integer, Valor: List<Auto>
        //<Clave,valor> las claves no se pueden repetirse, los valores pueden repetirse
        HashMap <Integer, List<Auto>> mapaAutosPorAnio = new HashMap<>();

        HashMap <String,Auto> mapaAutosPorPatente = new HashMap<>();

        mapaAutosPorPatente.put("AG012BB",auto2);
        mapaAutosPorPatente.put("AA123KK",auto3);
        mapaAutosPorPatente.put("AG124AA",auto7);

        //existe una clave en el mapa
        System.out.println("Está el auto con patente AA123NN? ");
        System.out.println(mapaAutosPorPatente.containsKey("AA123NN"));

        //para ver si existe un auto en el mapa por patente
        System.out.println("Está el auto2? ");
        System.out.println(mapaAutosPorPatente.containsValue(auto2));

        //obtener un auto por patente(clave) y mostrarlo
        System.out.println(mapaAutosPorPatente.get("AGO12BB").toString());


        //para recorrer el mapa (pares atributo-valor)
        //por cada put que use tengo una entrada en el mapa (1 par atributo-valor)

        //Por cada entrada del mapa
        for (Entry<String,Auto> fila : mapaAutosPorPatente.entrySet()){
            //PUEDO MOSTRAR EL ATRIBUTO : Uso getKey()
            System.out.println("Clave: Patente: "+ fila.getKey());
            //PUEDO MOSTRAR EL VALOR : Uso getValue()
            System.out.println("El km del auto es: "+ fila.getValue().getKilometraje());
        }


    }
}
