class Car extends Vehicle {
    private int doorAmount;

    public Car(String idNumber, double maxSpeed, int passengerCapacity, int doorAmount) {
        super(idNumber, maxSpeed, passengerCapacity);
        this.doorAmount = doorAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDoor Amount: " + doorAmount;
    }
}