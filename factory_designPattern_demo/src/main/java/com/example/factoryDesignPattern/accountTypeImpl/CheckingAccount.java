package com.example.factoryDesignPattern.accountTypeImpl;

import com.example.factoryDesignPattern.accountType.Account;
import org.springframework.stereotype.Component;

@Component
public class CheckingAccount implements Account {
    @Override
    public String showAccountType() {
        return "This is a Checking Account";
    }

    @Override
    public String getType() {
        return "checking";
    }
}
