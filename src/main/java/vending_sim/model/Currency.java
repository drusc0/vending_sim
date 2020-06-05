package vending_sim.model;

/**
 * Currency enum
 *
 * just a way to allow for a type of currency in case of usage anywhere
 * that is not the US.
 */
public enum Currency {
    DOLLAR("dollar");

    private String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return this.currency;
    }
}
