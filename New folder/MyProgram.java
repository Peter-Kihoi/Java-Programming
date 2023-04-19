import java.util.Scanner;

public class MyProgram {
    //properties

    String name;
    String course;
    private String secret;

    //method

    public static void main(String [] stud) {

        MyProgram student = new MyProgram();
        // student.name = "Peter";
        // student.secret = "Password123";
        // student.course = "Info Tech";

        // System.out.println(student.name);
        // System.out.println(student.secret);
        // System.out.println(student.course);

        try (Scanner myScanner = new Scanner(System.in)) {
            // Code to read input using myScanner
            System.out.println("Enter Your Name");
            student.name = myScanner.nextLine();
            System.out.println("Enter Your course");
            student.course = myScanner.nextLine();
            System.out.println("Enter Your Secret");
            student.secret = myScanner.nextLine();
        } // Scanner will be automatically closed after this block

        
        System.out.println("Your name is " +student.name);
        System.out.println("Your course is " + student.course);
        System.out.println("This is your secret " + student.secret);

        
    }
}