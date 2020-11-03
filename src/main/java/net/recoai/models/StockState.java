package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StockState {
    BACK_ORDER, IN_STOCK, OUT_OF_STOCK, PRE_ORDER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BACK_ORDER: return "BackOrder";
            case IN_STOCK: return "InStock";
            case OUT_OF_STOCK: return "OutOfStock";
            case PRE_ORDER: return "PreOrder";
        }
        return null;
    }

    @JsonCreator
    public static StockState forValue(String value) throws IOException {
        if (value.equals("BackOrder")) return BACK_ORDER;
        if (value.equals("InStock")) return IN_STOCK;
        if (value.equals("OutOfStock")) return OUT_OF_STOCK;
        if (value.equals("PreOrder")) return PRE_ORDER;
        throw new IOException("Cannot deserialize StockState");
    }
}
