package Observer.observer1;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Overrride
    public void handleEvent(List<String> games){
        System.out.println("Dear " + name + "\nWe have changed the game list:\n" + games);
    }
}
