package vending_sim.model.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import vending_sim.model.Currency;
import vending_sim.model.Money;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;

public class ChangeTest {

    private static final Double VALUE = 2.0;
    private static final Currency CURRENCY = Currency.DOLLAR;

    private Money change;

    @Before
    public void setup() {
        change = new Change(CURRENCY, VALUE);
    }

    @Test
    public void testGetCurrency() {
        assertThat(change.getCurrency(), equalTo(CURRENCY));
    }

    @Test
    public void testGetMoney() {
        assertThat(change.getMoney(), equalTo(VALUE));
    }
}
