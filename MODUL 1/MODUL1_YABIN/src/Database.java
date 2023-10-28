import java.util.List;
import java.util.ArrayList;

public class Database {
    public static void main(String[] args) {
    //TODO: Create List of Konser Object to Store Konser from Konser Class
        ArrayList <String> konser = new ArrayList<String>();

    // TODO: Create Method to insert Konser to Database
        konser.add("Konser1");
        konser.add("Konser2");
        konser.add("Konser3");
    
    // TODO: Create Method to Show Konser from Database
        for (int i = 0; i < konser.size(); i++){
            System.out.println("Concert List: ");
            System.out.println(konser.get(i));
        }

    // TODO: Create Method to Buy Ticket and Show the Total Price
         

    }
}
