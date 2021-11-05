package io.turntabl;

public class Corporate extends Client {
    private String accountManager;

    public Corporate(String name, ServiceLevel level,String accountManager) {
        super(name, level);
    }

    public String getAccountManager() {
        return accountManager;
    }

    @Override
    public String getContactName() {
        return getAccountManager();
    }


}
