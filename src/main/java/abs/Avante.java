package abs;

public class Avante extends RentCar {
    private static final int AVANTE_FUEL = 15;

    public Avante(int distance) {
        super(distance);
    }

    @Override
    int getFuelEfficiency() {
        return AVANTE_FUEL;
    }

    @Override
    String getCarName() {
        return "Avante";
    }
}
