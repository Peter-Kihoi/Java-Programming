import java.util.Scanner;

public class MyProgram {

    // properties
    String owner;
    private String secret;

    // methodspeter
    public static void main(String [] argv) {
        MyProgram myPrg = new MyProgram();
        // myPrg.owner = "Soi Peter";
        // System.out.println(myPrg.owner);

        // myPrg.secret = "Password";
        // System.out.println(myPrg.secret);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        myPrg.owner =  myScanner.nextLine();
        System.out.println(myPrg.owner);

        System.out.println("Enter your Secret");
        myPrg.secret = myScanner.nextLine();
        System.out.println(myPrg.secret);
        
    }
    
}
