package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1=new Airplane();
        airplane1.setYear(1999);
        airplane1.setProducer("Airbus");
        airplane1.setLength(60);
        airplane1.setWeight(100000);
        airplane1.setFuel(450);
        airplane1.info();
        airplane1.setYear(2001);
        airplane1.setLength(67);
        airplane1.info();
        airplane1.fillUp(230);
        airplane1.fillUp(330);
        airplane1.info();


    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int n) {
        this.fuel = n;
        return fuel;
    }

}
