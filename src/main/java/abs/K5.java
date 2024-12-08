package abs;

public class K5 extends RentCar {
    private static final int K5_FUEL = 13;

    public K5(int distance) {
        super(distance);
    }

    @Override
    int getFuelEfficiency() {
        return K5_FUEL;
    }

    @Override
    String getCarName() {
        return "K5";
    }
}
