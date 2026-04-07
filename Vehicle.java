public abstract class Vehicle {
    protected String name;
    protected int maxPassengers;
    protected int maxSpeed;

    public Vehicle(String name, int maxPassengers, int maxSpeed) {
    this.name = name;
    this.maxPassengers = maxPassengers;
    this.maxSpeed = maxSpeed;
}
public String getName() {
    return name;
}

public int getMaxSpeed() {
    return maxSpeed;
}


}

