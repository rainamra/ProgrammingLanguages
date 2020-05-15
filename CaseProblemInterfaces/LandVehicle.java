public abstract class LandVehicle extends Vehicle implements IsLandVehicle {

    int numWheels;

    public LandVehicle(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Car has started");

    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numOfWheels) {
        this.numWheels = numOfWheels;

    }
}
