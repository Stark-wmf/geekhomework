package Level2;

import java.io.Serializable;

public class Address implements Serializable {
    private String address;

    @Override
    public String toString() {
        return address;
    }

    Address(String address) {
        this.address = address;
    }
}
