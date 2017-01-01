package net.dschinghiskahn.eveapi.account.accountstatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class AccountStatus extends ApiResponse {

    @Path("result")
    @Element(required = false)
    private Date createDate;

    @Path("result")
    @Element(required = false)
    private Long logonCount;

    @Path("result")
    @Element(required = false)
    private Long logonMinutes;

    @Path("result/rowset[1]")
    @Attribute(name = "name", required = false)
    private String rowsetName1;

    @Path("result/rowset[1]")
    @Attribute(name = "key", required = false)
    private String rowsetKey1;

    @Path("result/rowset[1]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns1;

    @Path("result/rowset[1]")
    @ElementList(type = MultiCharacterTraining.class, required = false, inline = true)
    private List<MultiCharacterTraining> multiCharacterTraining = new ArrayList<>();

    @Path("result")
    @Element(required = false)
    private Date paidUntil;

    public Date getCreateDate() {
        return createDate;
    }

    public Long getLogonCount() {
        return logonCount;
    }

    public Long getLogonMinutes() {
        return logonMinutes;
    }

    public List<MultiCharacterTraining> getMultiCharacterTraining() {
        return multiCharacterTraining;
    }

    public Date getPaidUntil() {
        return paidUntil;
    }

    @Override
    public String toString() {
        return "AccountStatus ["
            + "createDate = " + createDate + ", "
            + "logonCount = " + logonCount + ", "
            + "logonMinutes = " + logonMinutes + ", "
            + "multiCharacterTraining = " + multiCharacterTraining + ", "
            + "paidUntil = " + paidUntil + ", "
            + "]";
    }

}
