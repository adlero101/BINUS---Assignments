public class Jeep extends Vehicle implements LandVehicle{
    final int numWheels;

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving with 4WD");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    public void soundHorn() {
        System.out.println("BEEEEEEEP");
    }

}
