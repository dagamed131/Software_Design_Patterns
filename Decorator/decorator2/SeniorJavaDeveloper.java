package Decorator.decorator2;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer){
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
