package Decorator.decorator2;

public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer){
        thie.developer = developer;
    }

    @Override
    public String makeJob(){
        return developer.makeJob();
    }
}
