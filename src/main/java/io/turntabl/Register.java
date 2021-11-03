package io.turntabl;

import java.util.HashMap;
import java.util.List;

public class Register {
    private HashMap<String,Client> register;

    public Register(HashMap<String, Client> register) {
        this.register = register;
    }

    public HashMap<String, Client> getRegister() {
        return register;
    }

    @Override
    public String toString() {
        return "Register{" +
                "register=" + register +
                '}';
    }
}
