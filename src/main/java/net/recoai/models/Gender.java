package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Gender {
    FEMALE, MALE, OTHER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FEMALE: return "Female";
            case MALE: return "Male";
            case OTHER: return "Other";
        }
        return null;
    }

    @JsonCreator
    public static Gender forValue(String value) throws IOException {
        if (value.equals("Female")) return FEMALE;
        if (value.equals("Male")) return MALE;
        if (value.equals("Other")) return OTHER;
        throw new IOException("Cannot deserialize Gender");
    }
}
