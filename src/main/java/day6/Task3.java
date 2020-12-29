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

        int random_mark = random.nextInt(4) + 2;
        if (random_mark == 2) {
            mark = "неудовлетворительно";
        } else if (random_mark == 3) {
            mark = "удовлетворительно";
        } else if (random_mark == 4) {
            mark = "хорошо";
        } else if (random_mark == 5) {
            mark = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + mark);


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
