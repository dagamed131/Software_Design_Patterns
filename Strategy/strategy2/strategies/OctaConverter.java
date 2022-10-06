package strategy2.strategies;

import strategy2.Converting;

public class OctaConverter implements Converting {
    public String convert(int number) {
        return Integer.toOctalString(number);
    }
}
