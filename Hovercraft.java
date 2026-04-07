public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    final int numWheels;
    final int displacement;

    public Hovercraft(String name, int maxPass, int maxSpeed, int wheels, int displacement) {
        super(name, maxPass, maxSpeed);
        this.numWheels = wheels;
        this.displacement = displacement;
    }

    @Override
    public void drive() {
        System.out.println(name + " is gliding over land.");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void launch() {
        System.out.println(name + " is launching into the water.");
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    public void enterLand() { System.out.println("Switching to land mode."); }
    public void enterSea() { System.out.println("Switching to sea mode."); }
}