package strategy2;

import strategy2.strategies.BinaryConverter;
import strategy2.strategies.HexaConverter;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context(new HexaConverter());
        System.out.println(ctx.convert(1000));
    }
}
