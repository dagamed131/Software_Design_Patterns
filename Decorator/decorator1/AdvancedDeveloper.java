package Decorator.decorator1;

public class AdvancedDeveloper extends Decorator{

    public AdvancedDeveloper(GameDev developer){
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code Review";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + " " + makeCodeReview();
    }
}
