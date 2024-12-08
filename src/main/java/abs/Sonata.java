package abs;

public class Sonata extends RentCar{
    private static final int SONATA_FUEL = 10;

    public Sonata(int distance) {
        super(distance);
    }

    @Override
    int getFuelEfficiency() {
        return SONATA_FUEL;
    }

    @Override
    String getCarName() {
        return "Sonata";
    }


}
