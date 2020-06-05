package vending_sim.model;

import lombok.AllArgsConstructor;
import vending_sim.model.Currency;

@AllArgsConstructor
public abstract class Money {
    private Currency currency;
    private Double value;

    public Double getMoney() {
        return this.value;
    }

    public Currency getCurrency() {
        return this.currency;
    }
}
