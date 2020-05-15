public class PoliceCar extends LandVehicle implements IsEmergency {

    private int sportMode;

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, int sportMode) {
        super(name, maxPassengers, maxSpeed, numWheels);
        this.sportMode = sportMode;
    }

    public void useTurbo() {
        System.out.println("Turn on Sport Mode. Now speed is " + (sportMode + this.getMaxSpeed()));
    }

    public int getSportMode() {
        return sportMode;
    }

    public void setSportMode(int sportMode) {
        this.sportMode = sportMode;
    }

    @Override
    public void soundSiren() {
        System.out.println("niu niu niu");

    }

}