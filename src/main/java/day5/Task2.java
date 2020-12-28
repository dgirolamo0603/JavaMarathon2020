package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("ява", "красный", 1990);
        System.out.println(motorbike1.getModel());
        System.out.println(motorbike1.getColor());
        System.out.println(motorbike1.getYear());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;

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
