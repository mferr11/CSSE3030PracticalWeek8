package csse3030.week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceCalculatorTest {

    private final InvoiceCalculator calculator = new InvoiceCalculator();

    @Test
    void standardOrderProducesPositiveTotal() {
        double total = calculator.calculateTotal(5, 10.0, false);
        assertTrue(total > 0);
    }

    @Test
    void bulkOrderProducesPositiveTotal() {
        double total = calculator.calculateTotal(15, 10.0, false);
        assertTrue(total > 0);
    }

    @Test
    void expressOrderProducesPositiveTotal() {
        double total = calculator.calculateTotal(5, 10.0, true);
        assertTrue(total > 0);
    }
}
