package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setYear(1990);
        Motorbike motorbike1 = new Motorbike("Иж","зеленый",1995);
        motorbike1.info();
        motorbike1.yearDifference(1999);
        car1.yearDifference(1999);
    }
}
