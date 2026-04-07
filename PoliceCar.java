public class PoliceCar extends Vehicle implements LandVehicle, IsEmergency {
    private final int numWheels;
    private final String unitId; // New Property: Unique identifier for the car

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, String unitId) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.unitId = unitId;
    }

    // New Method: Chase
    public void chase() {
        System.out.println("Unit " + unitId + " (" + name + ") is in high-speed pursuit!");
    }

    // New Method: Drift
    public void drift() {
        System.out.println(name + " performs a tactical 180-degree drift to block the road.");
    }

    @Override
    public void drive() {
        System.out.println("Unit " + unitId + " is patrolling the sector.");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Wail siren activated on Unit " + unitId + "!");
    }
}