package humans;

import animals.Animal;
import interfaces.Resurrect;
import jdk.javadoc.doclet.StandardDoclet;
import world.Location;
import java.util.Objects;

public abstract class Human implements Resurrect {
    private final String name;
    private String surname;
    private Status stat = Status.ALIVE;
    private Location location;
    private Feeling feeling;

    public Human(String name){
        this.name = name;
    }

    public Human(String name, String surname){
        this(name);
        this.surname = surname;
    }

    public Human(String name, String surname, Status stat){
        this(name, surname);
        this.stat = stat;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Location getLocation(){
        return location;
    }

    public Feeling getFeeling(){
        return feeling;
    }

    public Status getStat() {
        return stat;
    }

    public void setStat(Status stat) {
        this.stat = stat;
        System.out.printf("%n%s now is %s.%n", getName(), stat);
    }

    public void setLocation(Location location){
        this.location = location;
        switch (location) {

            case LADLOW -> {
                System.out.printf("%n%s returned to the Ladlow.", getName());
            }
            case BANGOR -> {
                System.out.printf("%n%s drove to the Bangor to go to the graveyard.", getName());
            }
            case CHICAGO -> {
                System.out.printf("%n%s was in Chicago.%n", getName());
            }
            case STANDARD -> {
                switch (name) {
                    case "Louis" -> {
                        System.out.printf("%n%s leaved graveyard crawling.%n", getName());
                    }
                    case "Bill" -> {
                        System.out.printf("%n%s leaved graveyard.", getName());
                    }
                }
            }
            case GRAVEYARD -> {
                System.out.printf("%n%s went to the graveyard", getName());
            }
        }
    }

    public void setFeeling(Feeling feeling) {
        this.feeling = feeling;
        System.out.printf("%n%s now is %s.%n", getName(), feeling);
    }

    @Override
    public String toString(){
        return  name + surname + "is in" + location + "and" + stat;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname, location);
    }

    public void die(){
        if (getStat() == Status.ALIVE){
        setStat(Status.DEAD);
    }
        else{
            System.out.println(getName() + "is already dead.");
        }
    }

    public void resurrect(Human h) {
        if (h.getStat() == Status.DEAD) {
            h.setStat(Status.ALIVE);
        }
        else{
            System.out.println(h.getName() + " is already alive.");
        }
    }
    public void resurrect(Animal a) {
        if (a.getStat() == Status.DEAD) {
            a.setStat(Status.ALIVE);
        }
        else{
            System.out.println(a + " is already alive.");
        }
    }
}