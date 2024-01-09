package humans;

import interfaces.Bury;
import world.Location;

public class Bill extends Human implements Bury {
    public Bill(String name, String surname, Location location){
        super(name, surname);
    }
    public void bury(Human h) {
            System.out.printf("%n%s buried %s%n", getName(), h.getName());
    }

}
