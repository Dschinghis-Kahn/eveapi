package net.dschinghiskahn.eveapi.character.contracts;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Contract {

    @Attribute(name = "acceptorID", required = false)
    private Long acceptorId;

    @Attribute(name = "assigneeID", required = false)
    private Long assigneeId;

    @Attribute(required = false)
    private String availability;

    @Attribute(required = false)
    private Double buyout;

    @Attribute(required = false)
    private Long collateral;

    @Attribute(name = "contractID", required = false)
    private Long contractId;

    @Attribute(required = false)
    private Date dateAccepted;

    @Attribute(required = false)
    private Date dateCompleted;

    @Attribute(required = false)
    private Date dateExpired;

    @Attribute(required = false)
    private Date dateIssued;

    @Attribute(name = "endStationID", required = false)
    private Long endStationId;

    @Attribute(required = false)
    private Long forCorp;

    @Attribute(name = "issuerCorpID", required = false)
    private Long issuerCorpId;

    @Attribute(name = "issuerID", required = false)
    private Long issuerId;

    @Attribute(required = false)
    private Long numDays;

    @Attribute(required = false)
    private Double price;

    @Attribute(required = false)
    private Long reward;

    @Attribute(name = "startStationID", required = false)
    private Long startStationId;

    @Attribute(required = false)
    private String status;

    @Attribute(required = false)
    private String title;

    @Attribute(required = false)
    private String type;

    @Attribute(required = false)
    private Long volume;

    public Long getAcceptorId() {
        return acceptorId;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public String getAvailability() {
        return availability;
    }

    public Double getBuyout() {
        return buyout;
    }

    public Long getCollateral() {
        return collateral;
    }

    public Long getContractId() {
        return contractId;
    }

    public Date getDateAccepted() {
        return dateAccepted;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public Long getEndStationId() {
        return endStationId;
    }

    public Long getForCorp() {
        return forCorp;
    }

    public Long getIssuerCorpId() {
        return issuerCorpId;
    }

    public Long getIssuerId() {
        return issuerId;
    }

    public Long getNumDays() {
        return numDays;
    }

    public Double getPrice() {
        return price;
    }

    public Long getReward() {
        return reward;
    }

    public Long getStartStationId() {
        return startStationId;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Long getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Contract ["
            + "acceptorId = " + acceptorId + ", "
            + "assigneeId = " + assigneeId + ", "
            + "availability = " + availability + ", "
            + "buyout = " + buyout + ", "
            + "collateral = " + collateral + ", "
            + "contractId = " + contractId + ", "
            + "dateAccepted = " + dateAccepted + ", "
            + "dateCompleted = " + dateCompleted + ", "
            + "dateExpired = " + dateExpired + ", "
            + "dateIssued = " + dateIssued + ", "
            + "endStationId = " + endStationId + ", "
            + "forCorp = " + forCorp + ", "
            + "issuerCorpId = " + issuerCorpId + ", "
            + "issuerId = " + issuerId + ", "
            + "numDays = " + numDays + ", "
            + "price = " + price + ", "
            + "reward = " + reward + ", "
            + "startStationId = " + startStationId + ", "
            + "status = " + status + ", "
            + "title = " + title + ", "
            + "type = " + type + ", "
            + "volume = " + volume + ", "
            + "]";
    }

}
