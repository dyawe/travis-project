package io.turntabl;

public class Corporate extends Client {
    private String accountManager;

    public Corporate(String name, String id, ServiceLevel level,String accountManager) {
        super(name, id, level);
    }

    public String getAccountManager() {
        return accountManager;
    }

    @Override
    public String getContactName() {
        return getAccountManager();
    }
}
