package interfaces;
import exceptions.NotThatLocationException;
import humans.*;
public interface Bury {
    void bury(Human h) throws NotThatLocationException;
}
