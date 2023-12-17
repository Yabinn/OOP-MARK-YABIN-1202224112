import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Enter name for user " + (i + 1) + ": ");
            String name = scanner.nextLine();
            
            int id = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter ID for user " + (i + 1) + ": ");
                    id = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer for ID.");
                }
            }

            System.out.print("Enter role for user " + (i + 1) + " (Student/Teacher/Admin): ");
            String role = scanner.nextLine();

            if (role.equalsIgnoreCase("Student")) {
                users.add(new Student(name, id));
            } else if (role.equalsIgnoreCase("Teacher")) {
                users.add(new Teacher(name, id));
            } else if (role.equalsIgnoreCase("Admin")) {
                users.add(new Admin(name, id));
            } else {
                System.out.println("Invalid role. User not created.");
            }
        }

        for (User user : users) {
            System.out.println("\nUser Details:\n" + user.getUserDetails());

            if (user instanceof Student) {
                Student student = (Student) user;
                System.out.print("Enter a course to enroll in: ");
                String course = scanner.nextLine();
                student.enrollInCourse(course);
                System.out.println("Enrolled in " + course);
            } else if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                System.out.print("Enter a course to teach: ");
                String course = scanner.nextLine();
                teacher.teachClass(course);
            } else if (user instanceof Admin) {
                Admin admin = (Admin) user;
                System.out.print("Enter a course to manage: ");
                String course = scanner.nextLine();
                admin.manageSystem(course);
            }
        }

        scanner.close();
    }
}