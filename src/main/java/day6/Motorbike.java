package day6;


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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public void yearDifference(int inputYear) {

        if (inputYear < this.year) {
            System.out.println("Ошибка");

        } else {

            System.out.println(inputYear - year);


        }

    }

}
