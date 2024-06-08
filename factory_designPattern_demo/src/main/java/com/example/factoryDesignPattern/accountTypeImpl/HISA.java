package com.example.factoryDesignPattern.accountTypeImpl;

import com.example.factoryDesignPattern.accountType.Account;
import org.springframework.stereotype.Component;

@Component
public class HISA implements Account {
    @Override
    public String showAccountType() {
        return "This is a High Interest Savings Account";
    }

    @Override
    public String getType() {
        return "hisa";
    }
}
