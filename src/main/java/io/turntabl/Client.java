package io.turntabl;

public abstract class Client {
    private String name;
    private String id;
    private ServiceLevel level;

    public abstract String getContactName();
}
