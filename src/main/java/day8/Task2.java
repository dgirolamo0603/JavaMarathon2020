package day8;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);

//        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d", airplane.getProducer(),
//                airplane.getYear(), airplane.getLength(), airplane.getWeight(), airplane.getFuel());
        System.out.println(airplane);

    }
}
