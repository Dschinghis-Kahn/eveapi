package net.dschinghiskahn.eveapi.character.accountbalance;

import java.lang.Double;
import java.lang.Long;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Account {

    @Attribute(name = "accountID", required = false)
    private Long accountId;

    @Attribute(required = false)
    private Long accountKey;

    @Attribute(required = false)
    private Double balance;

    public Long getAccountId(){
        return accountId;
    }

    public Long getAccountKey(){
        return accountKey;
    }

    public Double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return "Account [" +
            "accountId = " + accountId + ", " +
            "accountKey = " + accountKey + ", " +
            "balance = " + balance + ", " +
            "]";
    }

}
