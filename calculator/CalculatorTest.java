package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() throws Exception {
        c = new Calculator();
    }
    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void sub() {
    }

    @org.junit.jupiter.api.Test
    void div() {
        Assertions.assertThrows(ArithmeticException.class,
                () -> {c.div(42,0);
        });
    }
}