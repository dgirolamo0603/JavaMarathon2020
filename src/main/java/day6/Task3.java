package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Алексей", "Информатика");
        Student student = new Student("Влад");
        teacher1.evaluate(student);
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        String mark = "";
        Random random = new Random();
        int randomMark = random.nextInt(3) + 2;
        switch (randomMark) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету " + subject + " на оценку " + mark);


    }

}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
