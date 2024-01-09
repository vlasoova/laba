package humans;

import interfaces.See;

public class Margory extends Human implements See {
    public Margory(String name, String surname){
        super(name, surname);
    }
    public void see(Human human){
        System.out.printf("%n%s %s saw %s was going along the street.", getName(), getSurname(), human.getName());
    }
    public void look(String thing){

    }
}
