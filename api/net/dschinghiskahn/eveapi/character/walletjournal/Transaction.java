package net.dschinghiskahn.eveapi.character.walletjournal;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Transaction {

    @Attribute(required = false)
    private Double amount;

    @Attribute(name = "argID1", required = false)
    private Long argId1;

    @Attribute(required = false)
    private String argName1;

    @Attribute(required = false)
    private Double balance;

    @Attribute(required = false)
    private Date date;

    @Attribute(name = "owner1TypeID", required = false)
    private Long owner1TypeId;

    @Attribute(name = "owner2TypeID", required = false)
    private Long owner2TypeId;

    @Attribute(name = "ownerID1", required = false)
    private Long ownerId1;

    @Attribute(name = "ownerID2", required = false)
    private Long ownerId2;

    @Attribute(required = false)
    private String ownerName1;

    @Attribute(required = false)
    private String ownerName2;

    @Attribute(required = false)
    private String reason;

    @Attribute(name = "refID", required = false)
    private Long refId;

    @Attribute(name = "refTypeID", required = false)
    private Long refTypeId;

    @Attribute(required = false)
    private Double taxAmount;

    @Attribute(name = "taxReceiverID", required = false)
    private Long taxReceiverId;

    public Double getAmount(){
        return amount;
    }

    public Long getArgId1(){
        return argId1;
    }

    public String getArgName1(){
        return argName1;
    }

    public Double getBalance(){
        return balance;
    }

    public Date getDate(){
        return date;
    }

    public Long getOwner1TypeId(){
        return owner1TypeId;
    }

    public Long getOwner2TypeId(){
        return owner2TypeId;
    }

    public Long getOwnerId1(){
        return ownerId1;
    }

    public Long getOwnerId2(){
        return ownerId2;
    }

    public String getOwnerName1(){
        return ownerName1;
    }

    public String getOwnerName2(){
        return ownerName2;
    }

    public String getReason(){
        return reason;
    }

    public Long getRefId(){
        return refId;
    }

    public Long getRefTypeId(){
        return refTypeId;
    }

    public Double getTaxAmount(){
        return taxAmount;
    }

    public Long getTaxReceiverId(){
        return taxReceiverId;
    }

    @Override
    public String toString(){
        return "Transaction [" +
            "amount = " + amount + ", " +
            "argId1 = " + argId1 + ", " +
            "argName1 = " + argName1 + ", " +
            "balance = " + balance + ", " +
            "date = " + date + ", " +
            "owner1TypeId = " + owner1TypeId + ", " +
            "owner2TypeId = " + owner2TypeId + ", " +
            "ownerId1 = " + ownerId1 + ", " +
            "ownerId2 = " + ownerId2 + ", " +
            "ownerName1 = " + ownerName1 + ", " +
            "ownerName2 = " + ownerName2 + ", " +
            "reason = " + reason + ", " +
            "refId = " + refId + ", " +
            "refTypeId = " + refTypeId + ", " +
            "taxAmount = " + taxAmount + ", " +
            "taxReceiverId = " + taxReceiverId + ", " +
            "]";
    }

}
