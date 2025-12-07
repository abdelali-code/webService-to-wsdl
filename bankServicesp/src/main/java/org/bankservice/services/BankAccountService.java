package org.bankservice.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.bankservice.model.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@WebService(name = "bankWs")
public class BankAccountService {

    private List<Account> accounts = new ArrayList<>();
    private static int code = 1;

    @WebMethod(operationName = "convertToDr")
    public double converterToDr(@WebParam(name = "montant") double euro) {
        return euro * 11;
    }


    @WebMethod(operationName = "getAccount")
    public Account getAccount(@WebParam(name = "code") int code) {
        return accounts.stream().filter(acc -> acc.getCode() == code)
                .findFirst()
                .orElse(new Account());
    }


    @WebMethod(operationName = "getAllAccount")
    public List<Account> getAllAccount() {
        return accounts;
    }

    @WebMethod(operationName = "addAccount")
    public Account addAccount(@WebParam(name = "montant") double montant) {
        Account account = new Account(code++, montant, new Date());
        accounts.add(account);
        return account;
    }
}
