package lesson1.example8_autowiring_options;

import org.springframework.beans.factory.annotation.Autowired;

abstract public class Appliance {

    final private String serialNr;

    @Autowired
    Appliance( String serialNr) {
        this.serialNr = serialNr;
    }

    public String getSerialNr() {
        return serialNr;
    }
}
