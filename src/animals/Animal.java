package animals;

import humans.Status;

public abstract class Animal{
    public final String name;
    private Status stat = Status.ALIVE;
    public int age;
    public Animal(String name){
        this.name=name;
    }
    public Animal(String name, int age){
        this(name);
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public Status getStat() {
        return stat;
    }
    public void setStat(Status stat) {
        this.stat = stat;
        System.out.printf("%s now is %s.%n", getName(), stat);
    }
    public void die(){
        if (getStat() == Status.ALIVE){
            setStat(Status.DEAD);
        }
        else{
            System.out.println(getName() + "is already dead.");
        }
    }
}
