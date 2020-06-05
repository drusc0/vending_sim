package vending_sim.vending;

import javafx.util.Pair;
import vending_sim.model.Item;
import vending_sim.model.Price;
import vending_sim.model.impl.Money;

/**
 * public interface to use
 */
public interface VendingMachine {

    /**
     * Check the price of an item and return the value and currency.
     *
     * @param item
     * @return
     */
    public Price getPrice(Item item);

    /**
     * Purchase item with money. In case of exact change, no money back with item.
     *
     * @param item, money
     * @return
     */
    public Pair<Item, Money> purchaseItem(Item item);


    /**
     * Insert money to purchase
     *
     * @param money
     */
    public void insertMoney(Money money);


    /**
     * cancel purchase, makes a refund of the amount already inserted
     */
    public void cancelPurchase();

}
