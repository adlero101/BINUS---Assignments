public class Frigate extends Vehicle implements SeaVessel {
    private int displacement;

    public Frigate(String name, int maxPassengers, int maxSpeed, int displacement) {
        super(name, maxPassengers, maxSpeed);
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println(name + " is departing to the open sea");
    }

    @Override
    public int getDisplacement(){
        return displacement;
    }

    public void fireGun() {
        System.out.println(name + " is shooting");
    }
}
