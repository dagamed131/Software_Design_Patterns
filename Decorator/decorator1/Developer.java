package Decorator.decorator1;

public class Developer implements GameDev {
    @Override
    public String makeJob() {
        return "Write Game code.";
    }
}
