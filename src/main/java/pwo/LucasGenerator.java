package pwo;

import java.math.BigDecimal;

public class LucasGenerator {

    private int lastIndex = 0;
    private BigDecimal current = new BigDecimal(2);

    private BigDecimal l_1 = new BigDecimal(1),
            l_2 = new BigDecimal(2);

    public LucasGenerator() {
        // Konstruktor bez argumentów
    }

    public void reset() {
        lastIndex = 0;
        current = new BigDecimal(2);
        l_1 = new BigDecimal(1);
        l_2 = new BigDecimal(2);
    }

    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = l_1.add(l_2);
            l_2 = l_1;
            l_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(2);
        }
        lastIndex++;
        return current;
    }

    public BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}