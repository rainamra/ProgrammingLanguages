public abstract class Vehicle {

    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Vehicle(String name, int maxPassengers, int maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}