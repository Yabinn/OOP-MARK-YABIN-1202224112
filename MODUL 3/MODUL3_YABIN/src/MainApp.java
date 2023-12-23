import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Registration");
        // TO DO : Create Bioskop and Cashier objects
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("Please enter your name: ");
        String nama = input.nextLine();
        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.println("Please enter your phone number: ");
        try {
        int noHandphone = input.nextInt();
        // TO DO : Create a code for ticket order
        System.out.println(nama);
        System.out.println(noHandphone);
        // TO DO : Create a exception if user enter not number

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        // TO DO : Create a exception if user enter number is out of range
        // TO DO : Call the method to reserve seats in the cinema
        // TO DO : Close the Scanner object when the user is finished   
        input.close();
    }
}

}