package Decorator.decorator1;

public class Tasks {
    public static void main(String[] args) {
        GameDev developer = new AdvancedDeveloper(new Developer());

        System.out.println(developer.makeJob());
    }
}
