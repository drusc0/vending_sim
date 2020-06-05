package vending_sim.model.impl;

import vending_sim.model.Currency;
import vending_sim.model.Money;

public class Price extends Money {
    public Price(Currency currency, Double value) {
        super(currency, value);
    }
}
