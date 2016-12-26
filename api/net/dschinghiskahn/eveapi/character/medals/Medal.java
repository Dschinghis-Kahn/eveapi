package net.dschinghiskahn.eveapi.character.medals;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Medal {

    @Attribute(name = "corporationID", required = false)
    private Long corporationId;

    @Attribute(required = false)
    private String description;

    @Attribute(required = false)
    private Date issued;

    @Attribute(name = "issuerID", required = false)
    private Long issuerId;

    @Attribute(name = "medalID", required = false)
    private Long medalId;

    @Attribute(required = false)
    private String reason;

    @Attribute(required = false)
    private String status;

    @Attribute(required = false)
    private String title;

    public Long getCorporationId() {
        return corporationId;
    }

    public String getDescription() {
        return description;
    }

    public Date getIssued() {
        return issued;
    }

    public Long getIssuerId() {
        return issuerId;
    }

    public Long getMedalId() {
        return medalId;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Medal ["
            + "corporationId = " + corporationId + ", "
            + "description = " + description + ", "
            + "issued = " + issued + ", "
            + "issuerId = " + issuerId + ", "
            + "medalId = " + medalId + ", "
            + "reason = " + reason + ", "
            + "status = " + status + ", "
            + "title = " + title + ", "
            + "]";
    }

}
