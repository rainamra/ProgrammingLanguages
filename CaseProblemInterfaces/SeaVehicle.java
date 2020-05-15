public abstract class SeaVehicle extends Vehicle implements IsSeaVehicle {

    int displacement;

    public SeaVehicle(String name, int maxPassengers, int maxSpeed, int displacement) {
        super(name, maxPassengers, maxSpeed);
        this.displacement = displacement;
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void launch() {
        System.out.println("Launching boat in three, two, one!");
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

}
