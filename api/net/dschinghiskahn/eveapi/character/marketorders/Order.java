package net.dschinghiskahn.eveapi.character.marketorders;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Order {

    @Attribute(required = false)
    private Long accountKey;

    @Attribute(required = false)
    private Long bid;

    @Attribute(name = "charID", required = false)
    private Long charId;

    @Attribute(required = false)
    private Long duration;

    @Attribute(required = false)
    private Double escrow;

    @Attribute(required = false)
    private Date issued;

    @Attribute(required = false)
    private Long minVolume;

    @Attribute(name = "orderID", required = false)
    private Long orderId;

    @Attribute(required = false)
    private Long orderState;

    @Attribute(required = false)
    private Double price;

    @Attribute(required = false)
    private Long range;

    @Attribute(name = "stationID", required = false)
    private Long stationId;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(required = false)
    private Long volEntered;

    @Attribute(required = false)
    private Long volRemaining;

    public Long getAccountKey() {
        return accountKey;
    }

    public Long getBid() {
        return bid;
    }

    public Long getCharId() {
        return charId;
    }

    public Long getDuration() {
        return duration;
    }

    public Double getEscrow() {
        return escrow;
    }

    public Date getIssued() {
        return issued;
    }

    public Long getMinVolume() {
        return minVolume;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getOrderState() {
        return orderState;
    }

    public Double getPrice() {
        return price;
    }

    public Long getRange() {
        return range;
    }

    public Long getStationId() {
        return stationId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public Long getVolEntered() {
        return volEntered;
    }

    public Long getVolRemaining() {
        return volRemaining;
    }

    @Override
    public String toString() {
        return "Order ["
            + "accountKey = " + accountKey + ", "
            + "bid = " + bid + ", "
            + "charId = " + charId + ", "
            + "duration = " + duration + ", "
            + "escrow = " + escrow + ", "
            + "issued = " + issued + ", "
            + "minVolume = " + minVolume + ", "
            + "orderId = " + orderId + ", "
            + "orderState = " + orderState + ", "
            + "price = " + price + ", "
            + "range = " + range + ", "
            + "stationId = " + stationId + ", "
            + "typeId = " + typeId + ", "
            + "volEntered = " + volEntered + ", "
            + "volRemaining = " + volRemaining + ", "
            + "]";
    }

}
