package vending_sim.vending.impl;

import vending_sim.model.Bucket;
import vending_sim.model.Item;
import vending_sim.model.impl.Price;
import vending_sim.model.Money;
import vending_sim.vending.VendingMachine;

public class SodaVendingMachine implements VendingMachine {

    @Override
    public Price getPrice(Item item) {
        return null;
    }

    @Override
    public Bucket purchaseItem(Item item) {
        return null;
    }

    @Override
    public void insertMoney(Money money) {

    }

    @Override
    public void cancelPurchase() {

    }
}
