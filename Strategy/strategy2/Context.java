package strategy2;

public class Context {
    private Converting strategy;

    public Context(Converting strategy) {
        this.strategy = strategy;
    }

    public String convert(int number) {
        return strategy.convert(number);
    }
}
