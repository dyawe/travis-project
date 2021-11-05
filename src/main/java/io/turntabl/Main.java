package io.turntabl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {




        HashMap<Integer,Client> register = new HashMap<>();
        HashMap<Integer,Client> val = new HashMap<>();

        Client morgan = new Corporate("Morgan Stanley", ServiceLevel.PREMIUM, "Morgan");
        Client yawe = new Private("yawenam", ServiceLevel.GOLD);

        register.put(morgan.getId(), morgan);
        register.put(yawe.getId(), yawe);

        Register reg = new Register(register);
        System.out.println(reg.getRegister());
        System.out.println(register);
    }
}
