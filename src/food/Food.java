package food;

import world.Location;

public abstract class Food {
    public String name;
    private Type type = Type.TASTY;
    private double temperature;
    private int amount;
    private Location location;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getTemperature() {
        return temperature;
    }
    public Location getLocation(){
        return location;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setLocation(Location location){
        this.location = location;
    }
}
