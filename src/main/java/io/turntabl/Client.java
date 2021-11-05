package io.turntabl;

public abstract class Client {
    private String name;
    private int id;
    private ServiceLevel level;
    private static int counter = 0;

    public abstract String getContactName();

    public Client(String name, ServiceLevel level) {
        this.name = name;
        this.id = calcId();
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int calcId(){
          counter++;
          return counter;
    }

    public int getId() {
        return id;
    }

    public ServiceLevel getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", level=" + level +
                ", counter=" + counter +
                '}';
    }
}
