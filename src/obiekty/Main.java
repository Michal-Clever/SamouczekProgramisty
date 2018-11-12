package obiekty;

import obiekty.bird.Eagle;
import obiekty.bird.Stock;
import obiekty.fish.Carp;
import obiekty.fish.GoldFish;

public class Main {
    public static void main(String[] args) {

        GoldFish lola = new GoldFish(1);
        Carp danek = new Carp(35);
        Eagle strzala = new Eagle("braun");
        Stock cwir = new Stock(3);

        System.out.println(lola.getWeight());
        System.out.println(lola.isBig(1));

    }

}
