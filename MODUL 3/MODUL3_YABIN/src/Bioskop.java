public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int ROWS = 5;
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int SEATS_PER_ROW = 10;
    // TO DO: Create 2 dimensional array to store seat reservation status
    int array[][] = new int[ROWS][SEATS_PER_ROW];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        array[2][8] = 1;
        array[1][7] = 1;
        array[5][5] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Seating Layout: ");
        System.out.print(array);
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        
    }
}