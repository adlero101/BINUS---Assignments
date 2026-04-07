import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> myList = new ArrayList<>();

        
        // Parameters: name, maxPassengers, maxSpeed, numWheels, unitId
        PoliceCar interceptor = new PoliceCar("Toyota Supra Cop Car", 2, 160, 4, "L2BC");

        
        myList.add(interceptor);

        
        myList.add(new Jeep("Wrangler", 4, 110, 4));
        myList.add(new Hovercraft("Yacht", 6, 80, 0, 500));

        
        System.out.println("--- Vehicle Status Update---");
        for (Vehicle v : myList) {
            System.out.println("Vehicle: " + v.getName() + " | Max Speed: " + v.getMaxSpeed());
            
            // police car specials
            if (v instanceof PoliceCar) {
                PoliceCar pc = (PoliceCar) v;
                pc.soundSiren();
                pc.chase();
                pc.drift();
            }
            System.out.println("----------------------------");
        }
    }
}