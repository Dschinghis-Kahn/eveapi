package net.dschinghiskahn.eveapi.eve.characterinfo;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class EmploymentHistory {

    @Attribute(name = "corporationID", required = false)
    private Long corporationId;

    @Attribute(required = false)
    private String corporationName;

    @Attribute(name = "recordID", required = false)
    private Long recordId;

    @Attribute(required = false)
    private Date startDate;

    public Long getCorporationId(){
        return corporationId;
    }

    public String getCorporationName(){
        return corporationName;
    }

    public Long getRecordId(){
        return recordId;
    }

    public Date getStartDate(){
        return startDate;
    }

    @Override
    public String toString(){
        return "EmploymentHistory [" +
            "corporationId = " + corporationId + ", " +
            "corporationName = " + corporationName + ", " +
            "recordId = " + recordId + ", " +
            "startDate = " + startDate + ", " +
            "]";
    }

}
