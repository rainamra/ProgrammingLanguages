public class Hovercraft extends LandVehicle implements IsSeaVehicle {

    private int displacement;

    public Hovercraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels);
        this.displacement = displacement;
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void launch() {
        System.out.println("Initiating TurboFan ! Now launching your fancy boat !");
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void enterLand() {
        System.out.println("Vehicle preparing to enter land.");
    }

    public void enterSea() {
        System.out.println("Vehicle preparing to enter sea");
    }

}