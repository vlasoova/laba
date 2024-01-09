package food;

import world.Location;

public class Pizza extends Food{
    public Pizza(String pizza_name, double temperature, Location location){
        this.name = pizza_name;
        setType(Type.TASTY);
        setTemperature(25);
    }
}
