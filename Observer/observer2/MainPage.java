package Observer.observer2;

public class MainPage {
    public static void main(String[] args) {
        JavaDeveloperSite jobsite = new JavaDeveloperSite();

        jobsite.addVacancy("Junior Java Developer");
        jobsite.addVacancy("Senior Java Developer");

        Observer firstSubscriber = new Subscriber("Mark Pol");
        Observer secondSubscriber = new Subscriber("Henry Wall");

        jobsite.addObserver(firstSubscriber);
        jobsite.addObserver(secondSubscriber);
    }
}
