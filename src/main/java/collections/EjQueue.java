package collections;

import enums.Marca;
import model.Auto;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class EjQueue {
    public static void main(String[] args) {

        Auto auto1 = new Auto("AB123JV", 2020, "Rojo", 14000, "Focus", Marca.FORD);
        Auto auto2 = new Auto("AG012BB", 2024, "Azul", 15000, "C3", Marca.CITROEN);
        Auto auto3 = new Auto("AA123KK", 2022, "Negro", 130000, "C4", Marca.CITROEN);
        Auto auto4 = new Auto("AB123LL", 2023, "Gris", 125000, "Ecosport", Marca.FORD);
        Auto auto5 = new Auto("AB123NN", 2023, "Blanco", 125000, "Gol", Marca.VW);
        Auto auto6 = new Auto("AA123NN", 2020, "Gris", 150000, "Corolla", Marca.TOYOTA);
        Auto auto7 = new Auto("AG124AA", 2024, "Rojo", 25000, "Yaris", Marca.TOYOTA);

        //ArrayDeque<Auto> queueAutos = new ArrayDeque<>();

        PriorityQueue <Auto> queueAutos = new PriorityQueue<>(Collections.reverseOrder());

        //para agregar elementos uso add (Collections)
        queueAutos.add(auto1);

        //Para agregar elementos uso offer (Queue)
        queueAutos.offer(auto2);
        queueAutos.offer(auto3);

        //agrego al principio de la cola
        //queueAutos.offerFirst(auto4);

        //Agrego al final de la cola
        //queueAutos.offerLast(auto5);
        queueAutos.offer(auto6);
        queueAutos.offer(auto7);

        /*No se puede agregar objetos NULL
        Auto auto8 = null;
        queueAutos.offer(auto8); / se agrega null una sola vez
         */

        //toma el primer elemento de la cola
        System.out.println("Element: " + queueAutos.element().toString());


        //System.out.println("Peek Ultimo: " + queueAutos.peekLast().toString());
        System.out.println("Peek: " + queueAutos.peek().toString());
        //System.out.println("Peek Primero: " + queueAutos.peekFirst().toString());

        //El primero que se agregó es el primero que se elimina
        while(!queueAutos.isEmpty()){
            //pool saca elementos de la cola
            System.out.println("Elimino con Pool: " + queueAutos.poll().toString());
        }

        System.out.println("Está vacia?  " + queueAutos.isEmpty());

        /*for (Auto auto:queueAutos){
            System.out.println(auto.toString());
        }
         */

    }
}
