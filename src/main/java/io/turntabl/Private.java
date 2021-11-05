package io.turntabl;

public class Private extends Client {

    public Private(String name,  ServiceLevel level) {
        super(name, level);
    }

    @Override
    public String getContactName() {
        return getName();
    }

}
