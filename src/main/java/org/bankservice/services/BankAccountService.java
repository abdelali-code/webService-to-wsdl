package org.bankservice.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.bankservice.model.Account;

import java.util.Date;
import java.util.List;



@WebService(name = "bankWs")
public class BankAccountService {

    @WebMethod(operationName = "convertToDr")
    public double converterToDr(double euro) {
        return euro * 11;
    }


    @WebMethod(operationName = "getAccount")
    public Account getAccount(int code) {
        return new Account(code, 2000, new Date());
    }


    @WebMethod(operationName = "getAllAccount")
    public List<Account> getAllAccount() {
        return List.of(
                new Account(1, 2000, new Date()),
                new Account(2, 2000, new Date()),
                new Account(3, 2000, new Date())
        );
    }
}
