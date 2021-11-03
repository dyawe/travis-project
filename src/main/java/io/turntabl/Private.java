package io.turntabl;

public class Private extends Client {

    public Private(String name, String id, ServiceLevel level) {
        super(name, id, level);
    }

    @Override
    public String getContactName() {
        return getName();
    }

}
