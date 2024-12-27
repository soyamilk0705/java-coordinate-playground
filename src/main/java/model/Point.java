package model;

import messages.ErrorMessages;

import java.util.Objects;

public class Point {
    private Coordinate x;
    private Coordinate y;

    public Point(Coordinate x, Coordinate y){
        this.x = x;
        this.y = y;
        validateRange();
    }

    public static Point from(double x, double y) {
        return new Point(
                new Coordinate(x),
                new Coordinate(y)
        );
    }

    public double minusX(Point other) {
        return this.x.minus(other.x);
    }

    public double minusY(Point other){
        return this.y.minus(other.y);
    }

    public void validateRange(){
        if(!x.isCorrectRange() || !y.isCorrectRange()){
            throw new IllegalArgumentException(ErrorMessages.INVALID_RANGE_INPUT);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
