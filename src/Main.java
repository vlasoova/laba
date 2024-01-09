import exceptions.NotThatLocationException;
import humans.*;
import world.*;
import food.*;
import animals.Cherch;

public class Main {
    public static void main(String[] args) {
        Days day = new Days();
        Louis Louis = new Louis("Louis");
        Rachel Rachel = new Rachel("Rachel");
        Timmy Timmy = new Timmy("Timmy", "Butterman");
        Bill Bill = new Bill("Bill", "Butterman", Location.STANDARD);
        Policeman Policeman = new Policeman("Policeman", Location.STANDARD);
        Margory Margory = new Margory("Margory", "Washburn");
        Gadge Gadge = new Gadge("Gadge");
        Jud Jud = new Jud("Jud");
        Cherch Cherch = new Cherch("Cherch");

        Louis.cutTheThought("about other people.");
        Louis.look("ground");
        Louis.setFeeling(Feeling.SCARED);
        Drawing drawing = new Drawing(1, Shape.SPIRAL);
        Louis.Hands hands = new Louis("Louis").new Hands();
        Louis.draw(drawing.toString());
        Louis.wipeHands();
        hands.HandsCondition("clean");


        Louis.remove(drawing);
        Louis.setLocation(Location.STANDARD);
         if (Policeman.getLocation() == Location.GRAVEYARD && Louis.getLocation() == Location.GRAVEYARD){
            Policeman.ask("What are you doing here so late?");
            Policeman.arrest(Louis);
        } else {
        System.out.println("No one seen Louis.");
        }
        Pizza pizza = new Pizza("Margarita", 15, Location.BANGOR);
        pizza.setType(Type.TRASH);
        Louis.eat(8, 1);
        Louis.think("'The pizza was horrible.'");
        Louis.throwAway(pizza, "Margarita");
        Louis.setLocation(Location.LADLOW);
         if (pizza.getLocation() == Location.LADLOW) {
             Rachel.think("that Louis didn't go to Bangor for that");
        } else {
            System.out.println("Rachel didn't suspect anything");
        }
        Louis.setFeeling(Feeling.THINKING);
        Louis.think("about time.");

        int a = 0;
        while (a<=10) {
            System.out.printf("%nDAY %s%n", day.days.get(a));
            a++;

            switch (a) {
                case 0 -> {}
                case 1 -> {
                    Timmy.die();
                }
                case 2 -> {
                    Cherch.die();
                }
                case 3 -> {
                    Bill.setLocation(Location.GRAVEYARD);
                    Timmy.setLocation(Location.GRAVEYARD);
                    if(Bill.getLocation() == Location.GRAVEYARD){
                        Bill.bury(Timmy);
                    } else try {
                        throw new NotThatLocationException("Bill cannot bury not in the graveyard.");
                    } catch (NotThatLocationException e) {
                        throw new RuntimeException(e);
                    }

                }
                case 4 -> {
                    Gadge.die();
                }
                case 5 -> {}
                case 6 -> {
                    Bill.resurrect(Timmy);
                    Bill.setLocation(Location.STANDARD);
                }
                case 7 -> {
                    Jud.setLocation(Location.LADLOW);
                }
                case 8 -> {
                    Margory.see(Timmy);
                }
                case 9 -> {
                    Rachel.setLocation(Location.CHICAGO);
                }
                case 10 -> {
                    if (Rachel.getLocation() == Location.CHICAGO && Jud.getLocation() == Location.LADLOW) {
                        Louis.resurrect(Cherch);
                    } else {
                        System.out.println("Resurrecting of Cherch is impossible");
                    }
                }
                case 11 -> {
                    Louis.think("if only he could resurrect Gadge.");
                }
            }
        }
    }
}