package vending_sim.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bucket {
    private Item item;
    private Money money;
}
