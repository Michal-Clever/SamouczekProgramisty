package obiekty.fish;

public class GoldFish {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public GoldFish(int weight) {
        this.weight = weight;
    }

    public boolean isBig(int weight) {
        boolean isPositive = weight > 5;
        if (isPositive) {
            System.out.println("Duza sztuka");
        } else {
            System.out.println("Norma");
        }

        return isPositive;
    }


}
