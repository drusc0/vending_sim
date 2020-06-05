package vending_sim.model.impl;

import vending_sim.model.Currency;
import vending_sim.model.Price;

public class Change extends Price {
    public Change(Currency currency, Double value) {
        super(currency, value);
    }
}
