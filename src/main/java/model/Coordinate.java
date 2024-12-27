package model;


import java.util.Objects;

public class Coordinate {
    private static final double MAX_COORDINATION = 24.0;
    private static final double MIN_COORDINATION = 0.0;

    private final double coordination;

    public Coordinate(double coordination){
        this.coordination = coordination;
    }

    public double getCoordination(){
        return coordination;
    }

    public boolean isCorrectRange() {
        return coordination <= MAX_COORDINATION && coordination >= MIN_COORDINATION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Double.compare(coordination, that.coordination) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coordination);
    }
}

