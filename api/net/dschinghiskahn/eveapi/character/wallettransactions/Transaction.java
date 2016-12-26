package net.dschinghiskahn.eveapi.character.wallettransactions;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Transaction {

    @Attribute(name = "clientID", required = false)
    private Long clientId;

    @Attribute(required = false)
    private String clientName;

    @Attribute(name = "clientTypeID", required = false)
    private Long clientTypeId;

    @Attribute(name = "journalTransactionID", required = false)
    private Long journalTransactionId;

    @Attribute(required = false)
    private Double price;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(name = "stationID", required = false)
    private Long stationId;

    @Attribute(required = false)
    private String stationName;

    @Attribute(required = false)
    private Date transactionDateTime;

    @Attribute(required = false)
    private String transactionFor;

    @Attribute(name = "transactionID", required = false)
    private Long transactionId;

    @Attribute(required = false)
    private String transactionType;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(required = false)
    private String typeName;

    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public Long getClientTypeId() {
        return clientTypeId;
    }

    public Long getJournalTransactionId() {
        return journalTransactionId;
    }

    public Double getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public String getTransactionFor() {
        return transactionFor;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Long getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "Transaction ["
            + "clientId = " + clientId + ", "
            + "clientName = " + clientName + ", "
            + "clientTypeId = " + clientTypeId + ", "
            + "journalTransactionId = " + journalTransactionId + ", "
            + "price = " + price + ", "
            + "quantity = " + quantity + ", "
            + "stationId = " + stationId + ", "
            + "stationName = " + stationName + ", "
            + "transactionDateTime = " + transactionDateTime + ", "
            + "transactionFor = " + transactionFor + ", "
            + "transactionId = " + transactionId + ", "
            + "transactionType = " + transactionType + ", "
            + "typeId = " + typeId + ", "
            + "typeName = " + typeName + ", "
            + "]";
    }

}
