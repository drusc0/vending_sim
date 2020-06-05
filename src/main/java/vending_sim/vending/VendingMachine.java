package vending_sim.vending;

import vending_sim.model.Bucket;
import vending_sim.model.Item;
import vending_sim.model.impl.Price;
import vending_sim.model.Money;

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
    public Bucket purchaseItem(Item item);


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
