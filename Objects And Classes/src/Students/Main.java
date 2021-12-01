package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] parts = input.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String city = parts[3];

            boolean isStudentExisting = false;

            for (Student currentStudent : students) {
                if (currentStudent.getFirstName().equals(firstName)
                        && currentStudent.getLastName().equals(lastName)) {

                    currentStudent.setAge(age);
                    currentStudent.setCity(city);
                    isStudentExisting = true;
                }

                break;

            }

            if (!isStudentExisting) {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if (city.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old.%n",
                        student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }
    }
}
