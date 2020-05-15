public class Jeep extends LandVehicle {

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed, numWheels);
    }

    public void soundHorn() {
        System.out.println("honkk honkk");
    }

}
