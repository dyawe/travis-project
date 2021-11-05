package io.turntabl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Register {
    private HashMap<Integer,Client> register;

    public Register(HashMap<Integer, Client> new_register) {
        this.register = new_register;
    }

    public HashMap<Integer, Client> getRegister() {
        return register;
    }

    public List<String> goldContactNames(){
        return register.values()
                .stream()
                .filter(c->c.getLevel() == ServiceLevel.GOLD)
                .map(c->c.getContactName())
                .collect(Collectors.toList());
    }

    public Optional<String> getClientNameById(int id){
        return Optional.ofNullable(register.values()
                .stream()
                .filter(c->c.getId()==id)
                .map(c->c.getContactName()).findFirst()
                .orElse(null));
    }

    public Map<ServiceLevel, Long> countLevelClients(){
        return register.values()
                .stream()
                .collect(groupingBy(Client::getLevel,Collectors.counting()));
    }

    @Override
    public String toString() {
        return "Register{" +
                "register=" + register +
                '}';
    }
}
