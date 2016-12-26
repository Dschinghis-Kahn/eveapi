package net.dschinghiskahn.eveapi.character.mailinglists;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class MailingLists extends ApiResponse {

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
    @ElementList(type = MailingList.class, required = false, inline = true)
    private List<MailingList> mailingLists = new ArrayList<MailingList>();

    public List<MailingList> getMailingLists() {
        return mailingLists;
    }

    @Override
    public String toString() {
        return "MailingLists ["
            + "mailingLists = " + mailingLists + ", "
            + "]";
    }

}
