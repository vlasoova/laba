package humans;

import food.*;
import interfaces.*;

import world.Drawing;

public class Louis extends Human implements Think, Resurrect, See, Remove, Eat {
    public Louis(String name){
        super(name);
    }
    public void think(String thought){
        System.out.printf( "%s thought %s",getName(), thought);
    }

    @Override
    public void cutTheThought(String thought) {
        System.out.printf("%s cut the thought %s", getName(), thought);
    }

    @Override
    public void see(Human human){

    }
    @Override
    public void look(String thing){
        System.out.printf("%s looked at %s.", getName(), thing);
    }
    public class Hands{
        public void HandsCondition(String condition){
            System.out.printf("%n%s now has %s hands.", getName(), condition);
        }

    }
    public void draw(String d){
        System.out.printf("%s drew figure on the ground.", getName());
    }
    public void wipeHands(){
        System.out.printf("%n%s wiped his hands.", getName());
    }
    public void remove(Drawing d){
        d.setDrawingAmount(0);

        System.out.printf("%nDrawing now doesn't exist.");
    }

     public void throwAway(Food f, String pizza_name){
         f.setAmount(0);
         System.out.printf("%s threw away %s.", getName(), pizza_name);
     }
     public void eat(int amount, int piece){
         amount -= piece;
         System.out.printf("%s ate %s piece. Now there are %s pieces in the box.%n", getName(), piece, amount);
    }
}