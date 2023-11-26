class Bus extends Vehicle {
    private int seatAmount;

    public Bus(String idNumber, double maxSpeed, int passengerCapacity, int seatAmount) {
        super(idNumber, maxSpeed, passengerCapacity);
        this.seatAmount = seatAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeat Amount: " + seatAmount;
    }
}
