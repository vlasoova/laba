package humans;
import interfaces.See;
import interfaces.Say;
import world.Location;

public class Policeman extends Human implements See, Say{
    public Policeman(String name, Location location){
        super(name);
    }
    public String arrest(Human h){
        h.setStat(Status.ARRESTED);
        return "Policeman arrested " + h.getName();
    }
    boolean isSeen;
    @Override
    public void see(Human human){
        isSeen = true;
        System.out.println("Policeman seen" + human);
    }
    public void look(String thing){
    }

    public String say(String words){
        return getName() + "said " + words;
    }
    public void ask(String words){
        System.out.printf("Policeman asked '%s'", words);
    }
}
