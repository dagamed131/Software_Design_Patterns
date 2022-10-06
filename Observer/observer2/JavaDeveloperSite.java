package Observer.observer2;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String game){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String game){
        this.vacancies.remove(vacancy);
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
            observer.handleEvent(this.vacancies);
        }
    }
}
