package net.dschinghiskahn.eveapi.character.contactnotifications;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class ContactNotifications extends ApiResponse {

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
    @ElementList(type = ContactNotification.class, required = false, inline = true)
    private List<ContactNotification> contactNotifications = new ArrayList<>();

    public List<ContactNotification> getContactNotifications() {
        return contactNotifications;
    }

    @Override
    public String toString() {
        return "ContactNotifications ["
            + "contactNotifications = " + contactNotifications + ", "
            + "]";
    }

}
