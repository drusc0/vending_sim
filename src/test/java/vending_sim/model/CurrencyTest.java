package vending_sim.model;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CurrencyTest {
    private static final String DOLLAR = "dollar";

    @InjectMocks
    private Currency currency;

    @Test
    public void testDollar() {
        assertThat(currency.DOLLAR.getCurrency(), is(DOLLAR));
    }
}
