package io.turntabl;

public abstract class Client {
    private String name;
    private String id;
    private ServiceLevel level;

    public abstract String getContactName();

    public Client(String name, String id, ServiceLevel level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ServiceLevel getLevel() {
        return level;
    }
}
