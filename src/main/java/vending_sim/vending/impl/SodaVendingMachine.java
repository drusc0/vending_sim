package vending_sim.vending.impl;

import javafx.util.Pair;
import vending_sim.model.Item;
import vending_sim.model.Price;
import vending_sim.model.impl.Money;
import vending_sim.vending.VendingMachine;

public class SodaVendingMachine implements VendingMachine {

    @Override
    public Price getPrice(Item item) {
        return null;
    }

    @Override
    public Pair<Item, Money> purchaseItem(Item item) {
        return null;
    }

    @Override
    public void insertMoney(Money money) {

    }

    @Override
    public void cancelPurchase() {

    }
}
