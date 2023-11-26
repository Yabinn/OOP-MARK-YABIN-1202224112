class Vehicle {
    private String idNumber;
    private double maxSpeed;
    private int passengerCapacity;

    public Vehicle(String idNumber, double maxSpeed, int passengerCapacity) {
        this.idNumber = idNumber;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
    }

    public String toString() {
        return "Vehicle ID: " + idNumber + "\nMax Speed: " + maxSpeed + " km/h" + "\nPassenger Capacity: " + passengerCapacity + " persons";
    }

    public double countTravelledTime(double distance) {
        return distance / maxSpeed;
    }
}