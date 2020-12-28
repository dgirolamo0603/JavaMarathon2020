package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2015);
        car1.setColor("красный");
        car1.setModel("жигуль");

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());

    }
}

class Car {
    private int year;
    private String color;
    private String model;


    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }


}
