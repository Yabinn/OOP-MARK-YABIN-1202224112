public class MainApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("V123", 120.0, 5);
        Car car = new Car("C456", 150.0, 4, 4);
        Bus bus = new Bus("B789", 100.0, 30, 40);

        System.out.println("Vehicle Information:\n" + vehicle.toString());
        System.out.println("\nCar Information:\n" + car.toString());
        System.out.println("\nBus Information:\n" + bus.toString());

        double distance = 500.0;
        System.out.println("\nTime to travel " + distance + " km in Vehicle: " + vehicle.countTravelledTime(distance) + " hours");
        System.out.println("Time to travel " + distance + " km in Car: " + car.countTravelledTime(distance) + " hours");
        System.out.println("Time to travel " + distance + " km in Bus: " + bus.countTravelledTime(distance) + " hours");
    }
}