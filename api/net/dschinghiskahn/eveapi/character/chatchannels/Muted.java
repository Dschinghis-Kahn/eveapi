package net.dschinghiskahn.eveapi.character.chatchannels;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Muted {

    @Attribute(name = "accessorID", required = false)
    private Long accessorId;

    @Attribute(required = false)
    private String accessorName;

    @Attribute(required = false)
    private String reason;

    @Attribute(required = false)
    private Date untilWhen;

    public Long getAccessorId() {
        return accessorId;
    }

    public String getAccessorName() {
        return accessorName;
    }

    public String getReason() {
        return reason;
    }

    public Date getUntilWhen() {
        return untilWhen;
    }

    @Override
    public String toString() {
        return "Muted ["
            + "accessorId = " + accessorId + ", "
            + "accessorName = " + accessorName + ", "
            + "reason = " + reason + ", "
            + "untilWhen = " + untilWhen + ", "
            + "]";
    }

}
