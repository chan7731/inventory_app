package com.chan7731.inventory_app.query;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockSearchCondition {
    private String productName;
    private String warehouseName;
    private Integer minQuantity;
    private Integer maxQuantity;
}
