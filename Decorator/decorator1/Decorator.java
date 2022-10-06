package Decorator.decorator1;

public class Decorator implements GameDev{
    GameDev developer;

    public Decorator(GameDev developer){
        thie.developer = developer;
    }

    @Override
    public String makeJob(){
        return developer.makeJob();
    }
}
