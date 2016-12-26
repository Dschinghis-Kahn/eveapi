package net.dschinghiskahn.eveapi.character.contractbids;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Bid {

    @Attribute(required = false)
    private Double amount;

    @Attribute(name = "bidID", required = false)
    private Long bidId;

    @Attribute(name = "bidderID", required = false)
    private Long bidderId;

    @Attribute(name = "contractID", required = false)
    private Long contractId;

    @Attribute(required = false)
    private Date dateBid;

    public Double getAmount() {
        return amount;
    }

    public Long getBidId() {
        return bidId;
    }

    public Long getBidderId() {
        return bidderId;
    }

    public Long getContractId() {
        return contractId;
    }

    public Date getDateBid() {
        return dateBid;
    }

    @Override
    public String toString() {
        return "Bid ["
            + "amount = " + amount + ", "
            + "bidId = " + bidId + ", "
            + "bidderId = " + bidderId + ", "
            + "contractId = " + contractId + ", "
            + "dateBid = " + dateBid + ", "
            + "]";
    }

}
