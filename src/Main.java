public class Main {
    public static void main(String[] args) {

        // create drivers
        Driver d1 = new Driver("Alex", "12345");
        Driver d2 = new Driver("Anna", "67890");

        // create vehicles
        Car car = new Car("Toyota", 2020, d1, 4, "Petrol");
        Motorcycle moto = new Motorcycle("Yamaha", 2019, d2, false);
        Truck truck = new Truck("Volvo", 2018, d1, 10.0, 4);

        // store vehicles in an array
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = moto;
        vehicles[2] = truck;

        // loop through all vehicles
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            vehicles[i].stopEngine();
            System.out.println();
        }
    }
}
