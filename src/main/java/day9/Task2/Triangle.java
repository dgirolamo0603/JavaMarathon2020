package day9.Task2;

public class Triangle extends Figure {
    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }



    @Override
    public double perimeter() {
        return x + y + z;
    }

    @Override
    public double area() {
        double p = perimeter()/ 2;

        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }


}
