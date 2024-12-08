package abs;

public abstract class RentCar {
    private final int distance;

    public RentCar(int distance) {
        this.distance = distance;
    }

    abstract int getFuelEfficiency();
    abstract String getCarName();

    public int calculate(){
        return distance / getFuelEfficiency();
    }

}
