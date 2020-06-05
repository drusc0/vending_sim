package vending_sim.model;

import vending_sim.model.impl.Money;

public class Price extends Money {
    public Price(Currency currency, Double value) {
        super(currency, value);
    }
}
