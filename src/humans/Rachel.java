package humans;

import interfaces.Think;
import food.*;

public class Rachel extends Human implements Think {
    public Rachel(String name){
        super(name);
    }
    public void think(String thought){
        System.out.println("Rachel thought" + thought);
    }
    @Override
    public void cutTheThought(String thought) {
    }
}
