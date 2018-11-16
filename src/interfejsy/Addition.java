package interfejsy;

public class Addition implements Computation {
    @Override
    public double Compute(double argument1, double argument2) {
        return argument1+argument2;
    }
}
