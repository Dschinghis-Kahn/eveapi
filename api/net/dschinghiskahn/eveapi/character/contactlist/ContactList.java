package net.dschinghiskahn.eveapi.character.contactlist;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class ContactList extends ApiResponse {

    @Path("result/rowset[6]")
    @Attribute(name="name", required = false)
    private String rowsetName6;

    @Path("result/rowset[6]")
    @Attribute(name="key", required = false)
    private String rowsetKey6;

    @Path("result/rowset[6]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns6;

    @Path("result/rowset[6]")
    @ElementList(type = AllianceContactLabel.class, required = false, inline = true)
    private List<AllianceContactLabel> allianceContactLabels = new ArrayList<AllianceContactLabel>();

    @Path("result/rowset[5]")
    @Attribute(name="name", required = false)
    private String rowsetName5;

    @Path("result/rowset[5]")
    @Attribute(name="key", required = false)
    private String rowsetKey5;

    @Path("result/rowset[5]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns5;

    @Path("result/rowset[5]")
    @ElementList(type = AllianceContact.class, required = false, inline = true)
    private List<AllianceContact> allianceContactList = new ArrayList<AllianceContact>();

    @Path("result/rowset[2]")
    @Attribute(name="name", required = false)
    private String rowsetName2;

    @Path("result/rowset[2]")
    @Attribute(name="key", required = false)
    private String rowsetKey2;

    @Path("result/rowset[2]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns2;

    @Path("result/rowset[2]")
    @ElementList(type = ContactLabel.class, required = false, inline = true)
    private List<ContactLabel> contactLabels = new ArrayList<ContactLabel>();

    @Path("result/rowset[1]")
    @Attribute(name="name", required = false)
    private String rowsetName1;

    @Path("result/rowset[1]")
    @Attribute(name="key", required = false)
    private String rowsetKey1;

    @Path("result/rowset[1]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns1;

    @Path("result/rowset[1]")
    @ElementList(type = Contact.class, required = false, inline = true)
    private List<Contact> contactList = new ArrayList<Contact>();

    @Path("result/rowset[4]")
    @Attribute(name="name", required = false)
    private String rowsetName4;

    @Path("result/rowset[4]")
    @Attribute(name="key", required = false)
    private String rowsetKey4;

    @Path("result/rowset[4]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns4;

    @Path("result/rowset[4]")
    @ElementList(type = CorporateContactLabel.class, required = false, inline = true)
    private List<CorporateContactLabel> corporateContactLabels = new ArrayList<CorporateContactLabel>();

    @Path("result/rowset[3]")
    @Attribute(name="name", required = false)
    private String rowsetName3;

    @Path("result/rowset[3]")
    @Attribute(name="key", required = false)
    private String rowsetKey3;

    @Path("result/rowset[3]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns3;

    @Path("result/rowset[3]")
    @ElementList(type = CorporateContact.class, required = false, inline = true)
    private List<CorporateContact> corporateContactList = new ArrayList<CorporateContact>();

    public List<AllianceContactLabel> getAllianceContactLabels(){
        return allianceContactLabels;
    }

    public List<AllianceContact> getAllianceContactList(){
        return allianceContactList;
    }

    public List<ContactLabel> getContactLabels(){
        return contactLabels;
    }

    public List<Contact> getContactList(){
        return contactList;
    }

    public List<CorporateContactLabel> getCorporateContactLabels(){
        return corporateContactLabels;
    }

    public List<CorporateContact> getCorporateContactList(){
        return corporateContactList;
    }

    @Override
    public String toString(){
        return "ContactList [" +
            "allianceContactLabels = " + allianceContactLabels + ", " +
            "allianceContactList = " + allianceContactList + ", " +
            "contactLabels = " + contactLabels + ", " +
            "contactList = " + contactList + ", " +
            "corporateContactLabels = " + corporateContactLabels + ", " +
            "corporateContactList = " + corporateContactList + ", " +
            "]";
    }

}
