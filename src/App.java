import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner sc = Input.sn;
    public static void main(String[] args) throws Exception {
        System.out.println("=========================================");
        System.out.println("WELCOME TO TEAM #1 SCHOOL SYSTEM");
        System.out.println("=========================================");
        while (true) {
            System.out.println("1. Add Student      2. Add Instructor      3. Add Course");
            System.out.println("4. List All Students        5. List All Instructors");
            System.out.println("6. List All classes        7. List All subjects");
            System.out.println("8. Delete Student   9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: UserManger.createStudent();
                break;
                case 2: UserManger.createInstructor();
                break;
                case 3: CourseManger.createCourse();
                break;
                case 4: UserManger.previewStudents();
                break;
                case 5: UserManger.previewInstructors();
                break;
                case 6: CourseManger.previewClasses();
                break;
                case 7: CourseManger.previewCourses();
                break;
                case 8: UserManger.removeStudent();
                break;
                case 9: System.exit(0);
                default: System.out.println("Invalid choice!");
            }        
            System.out.println("=========================================");
        }

    }
}
