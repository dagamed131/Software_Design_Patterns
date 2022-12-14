package Observer.observer1;

import java.util.ArrayList;
import java.util.List;

public class GameSite implements Observed {
    List<String> games = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addGame(String game){
        this.games.add(game);
        notifyObservers();
    }

    public void removeGame(String game){
        this.games.remove(game);
        notifyObservers();
    }

    public void addObserver(Observer observer){
        this.subscribers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.subscribers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: subscribers){
            observer.handleEvent(this.games);
        }
    }
}
