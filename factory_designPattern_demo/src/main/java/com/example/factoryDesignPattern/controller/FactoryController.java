package com.example.factoryDesignPattern.controller;

import com.example.factoryDesignPattern.accountType.Account;
import com.example.factoryDesignPattern.accountType.AccountFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {
    @GetMapping("/bankApp/account/{account-type}")
    public String getAccountTypeInfo(@PathVariable("account-type") String accountType) throws Exception {
        Account accountFactory= AccountFactory.createInstance(accountType);
        return accountFactory.showAccountType();
    }
}
