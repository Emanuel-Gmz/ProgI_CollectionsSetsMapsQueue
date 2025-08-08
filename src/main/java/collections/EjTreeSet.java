package collections;

import enums.Marca;
import model.Auto;

import java.util.Set;
import java.util.TreeSet;

public class EjTreeSet {
    public static void main(String[] args) {

        Auto auto1 = new Auto("AB123JV",2020,"Rojo",14000,"Focus", Marca.FORD);
        Auto auto2 = new Auto("AG012BB",2024,"Azul",15000,"C3", Marca.CITROEN);
        Auto auto3 = new Auto("AA123KK",2022,"Negro",130000,"C4", Marca.CITROEN);
        Auto auto4 = new Auto("AB123LL",2023,"Gris",125000,"Ecosport", Marca.FORD);
        Auto auto5 = new Auto("AB123NN",2023,"Blanco",125000,"Gol", Marca.VW);
        Auto auto6 = new Auto("AA123NN",2020,"Gris",150000,"Corolla", Marca.TOYOTA);
        Auto auto7 = new Auto("AG124AA",2024,"Rojo",25000,"Yaris", Marca.TOYOTA);

        //crear un TreeSet

        Set <Auto> treeSetAutos = new TreeSet<>();  // treeSetAutos.add(auto1);
        treeSetAutos.add(auto1);
        treeSetAutos.add(auto2);
        treeSetAutos.add(auto3);
        treeSetAutos.add(auto4);
        treeSetAutos.add(auto5);
        treeSetAutos.add(auto6);
        treeSetAutos.add(auto6);
        treeSetAutos.add(auto7);


        //  Set <Auto> treeSetAutos = Set.of(auto1,auto2,auto3,auto4,auto5,auto6,auto7);

        for (Auto auto: treeSetAutos){
            System.out.println(auto.toString());
        }


    }
}
