package com.example.factoryDesignPattern.accountType;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AccountFactory {

    @Autowired
    private List<Account> accountList;
    private static final Map<String, Account> handler = new HashMap<>();

    @PostConstruct
    private void initInstance() {
        accountList.stream().forEach(accountType -> handler.put(accountType.getType(), accountType));
    }

    public static Account createInstance(String accountType) throws Exception {
        return Optional.ofNullable(handler.get(accountType)).orElseThrow(() -> new IllegalArgumentException("Invalid account"));
    }
}
