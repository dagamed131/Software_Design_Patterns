package Observer.observer1;

public class MainPage {
    public static void main(String[] args) {
        GameSite site = new GameSite();

        site.addGame("Dark Souls 3");
        site.addGame("Dark Souls 2");

        Observer firstSubscriber = new Subscriber("Mark Pol");
        Observer secondSubscriber = new Subscriber("Henry Wall");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);
    }
}
