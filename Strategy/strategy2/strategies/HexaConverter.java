package strategy2.strategies;

import strategy2.Converting;

public class HexaConverter implements Converting {
    public String convert(int number) {
        return Integer.toHexString(number);
    }
}
