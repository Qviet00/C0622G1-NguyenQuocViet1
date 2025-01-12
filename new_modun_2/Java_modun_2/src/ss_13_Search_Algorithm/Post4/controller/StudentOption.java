package ss_13_Search_Algorithm.Post4.controller;
import ss_13_Search_Algorithm.Post4.serives.IStudentService;
import ss_13_Search_Algorithm.Post4.serives.impl.StudentService;

import java.util.Scanner;

public class StudentOption {
    private static Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = new StudentService();

    public void OptionStudent() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Hello");
            System.out.println("1. Display student");
            System.out.println("2. Add student");
            System.out.println("3. Aetele student: ");
            System.out.println("4. Search student: ");
            System.out.println("5. Exit");
            System.out.print("Enter option 1 -> 5: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:
                    studentService.removeStudent();
                    break;
                case 4:
                    studentService.searchStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("No");
            }

        }
    }
}
