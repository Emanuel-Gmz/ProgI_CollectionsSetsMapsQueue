package collections;

import enums.Marca;
import model.Auto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjSets {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AB123JV",2020,"Rojo",14000,"Focus", Marca.FORD);
        Auto auto2 = new Auto("AG012BB",2024,"Azul",15000,"C3", Marca.CITROEN);
        Auto auto3 = new Auto("AA123KK",2022,"Negro",130000,"C4", Marca.CITROEN);
        Auto auto4 = new Auto("AB123LL",2023,"Gris",125000,"Ecosport", Marca.FORD);
        Auto auto5 = new Auto("AB123NN",2023,"Blanco",125000,"Gol", Marca.VW);
        Auto auto6 = new Auto("AA123NN",2020,"Gris",150000,"Corolla", Marca.TOYOTA);
        Auto auto7 = new Auto("AG124AA",2024,"Rojo",25000,"Yaris", Marca.TOYOTA);

        //Creo Set
        Set<Auto> setAutos =new HashSet<Auto>();

        //Agrego elementos con metodo add
        setAutos.add(auto7);
        setAutos.add(auto1);
        setAutos.add(auto2);
        setAutos.add(auto2); //no se agrega porque es repetido
        setAutos.add(auto3);
        setAutos.add(auto4);
        setAutos.add(auto5);
        setAutos.add(auto6);
        setAutos.add(auto7); //no se agrega porque es repetido

        mostrarSet("-------------- Recorro el set con for-each:", setAutos);

        System.out.println("-------------- Recorro el set con Iterator");
        Iterator<Auto> it = setAutos.iterator();
        while (it.hasNext()){
            Auto a = it.next();
            System.out.println(a.toString());
        }

        //ver si contiene un elemento
        System.out.println("Esta el C3 en la lista? " + setAutos.contains(auto2));
        System.out.println("Tamaño del set luego de clear " + setAutos.size());

        setAutos.clear(); //elimina todos los elementos del set

        System.out.println("Tamaño del set luego de clear " + setAutos.size());
        System.out.println("Está vacio el set?: " + setAutos.isEmpty());
        mostrarSet("-------------- Recorro el set con for-each luego de clear", setAutos);
    }

    private static void mostrarSet(String x, Set<Auto> setAutos) {
        //recorro y muestro
        System.out.println(x);
        for (Auto a : setAutos) {
            System.out.println(a.toString());
        }
    }
}
