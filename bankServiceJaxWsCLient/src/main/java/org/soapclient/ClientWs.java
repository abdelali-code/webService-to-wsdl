package org.soapclient;

import org.bankservice.services.Account;
import org.bankservice.services.BankAccountServiceService;
import org.bankservice.services.BankWs;

import java.util.List;

public class ClientWs {

    public static void main(String[] args) {

        BankWs proxy = new BankAccountServiceService().getBankWsPort();
        System.out.println(proxy.convertToDr(10));
        System.out.println(proxy.addAccount(9000));
        System.out.println(proxy.addAccount(10000));
        System.out.println(proxy.addAccount(10000));
        System.out.println(proxy.addAccount(10000));
        System.out.println(proxy.addAccount(10000));
        System.out.println(proxy.getAccount(23));
        List<Account> accountList = proxy.getAllAccount();

        for (Account account : accountList) {
            System.out.println(account.getCode());
        }
    }
}
