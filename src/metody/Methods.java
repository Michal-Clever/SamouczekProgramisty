package metody;

public class Methods {

    boolean isBig (int someNumber){
        return someNumber >100;
    }

    private static boolean isTemperaturePositive(double temperature) {
        boolean isPositive = temperature > 0;

        if (isPositive) {
            System.out.println("Temperatura " + temperature + " jest dodatnia.");
        }
        else {
            System.out.println("Temperatura " + temperature + " nie jest dodatnia.");
        }

        return isPositive;
    }

    public static void main(String[] args) {

        Methods firstNumber = new Methods();
        firstNumber.isBig(99);
     //   System.out.println(firstNumber.isBig(101));

        int plus =10;
        int minus = -9;
        int zero = 0;

        System.out.println(isTemperaturePositive(plus));
        System.out.println(isTemperaturePositive(minus));
        System.out.println(isTemperaturePositive(zero));


    }

}
