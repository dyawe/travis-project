package io.turntabl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    HashMap<Integer,Client> register = new HashMap<>();
    HashMap<Integer,Client> val = new HashMap<>();
    Client morgan = new Corporate("Morgan Stanley", ServiceLevel.PREMIUM, "Morgan");
    Client yawe = new Private("yawenam", ServiceLevel.GOLD);


    @Test
    void registerIsNotNullTest(){
        register.put(morgan.getId(), morgan);
        register.put(yawe.getId(), yawe);

        Register reg = new Register(register);
        System.out.println(register);
        assertNotNull(reg.getRegister(), "register is empty unfortunately");
        //assertNotNull(register, "register is empty unfortunately");

    }

    @Test
    void getGoldClientContactNamesTest(){
        register.put(morgan.getId(), morgan);
        register.put(yawe.getId(), yawe);

        Register reg = new Register(register);



        var actual = reg.goldContactNames().get(0);
        var expected = "morgan";

        assertEquals(expected,actual);

    }




}