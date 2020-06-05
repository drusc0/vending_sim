package vending_sim.model.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import vending_sim.model.Currency;
import vending_sim.model.Money;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PriceTest {
    private static final Double VALUE = 2.0;
    private static final Currency CURRENCY = Currency.DOLLAR;

    private Money price;

    @Before
    public void setup() {
        price = new Price(CURRENCY, VALUE);
    }

    @Test
    public void testGetCurrency() {
        assertThat(price.getCurrency(), equalTo(CURRENCY));
    }

    @Test
    public void testGetMoney() {
        assertThat(price.getMoney(), equalTo(VALUE));
    }
}
