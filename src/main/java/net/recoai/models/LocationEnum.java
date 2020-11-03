package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LocationEnum {
    CHECKOUT_PAGE, ERROR404, HOME_PAGE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CHECKOUT_PAGE: return "CheckoutPage";
            case ERROR404: return "Error404";
            case HOME_PAGE: return "HomePage";
        }
        return null;
    }

    @JsonCreator
    public static LocationEnum forValue(String value) throws IOException {
        if (value.equals("CheckoutPage")) return CHECKOUT_PAGE;
        if (value.equals("Error404")) return ERROR404;
        if (value.equals("HomePage")) return HOME_PAGE;
        throw new IOException("Cannot deserialize LocationEnum");
    }
}
