package strategy2.strategies;

import strategy2.Converting;

public class BinaryConverter implements Converting {
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
