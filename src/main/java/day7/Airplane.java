package day7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

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

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year
                + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }


    public static void compareAirplanes(Airplane airplane, Airplane airplane2) {
        if (airplane.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длинны самолетов равны");
        }

    }

}