import java.util.Scanner;

public class TUKStudent {
    //properties
    String name, course, password;
    int age;

    //methods

    public static void main(String[] args) {
        TUKStudent student = new TUKStudent();

        try(Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter your name");
            student.name = myScanner.nextLine();
            System.out.println("enter the course you are studying");
            student.course = myScanner.nextLine();
            System.out.println("enter new password");
            student.password = myScanner.nextLine();
            System.out.println("What is your age nigga");
            student.age = myScanner.nextInt();

        }

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.course);
        System.out.println(student.password);
    }
    
}