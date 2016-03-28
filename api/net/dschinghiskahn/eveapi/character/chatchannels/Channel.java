package net.dschinghiskahn.eveapi.character.chatchannels;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Channel {

    @Path("rowset[1]")
    @Attribute(name="name", required = false)
    private String rowsetName1;

    @Path("rowset[1]")
    @Attribute(name="key", required = false)
    private String rowsetKey1;

    @Path("rowset[1]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns1;

    @Path("rowset[1]")
    @ElementList(type = Allowed.class, required = false, inline = true)
    private List<Allowed> allowed = new ArrayList<Allowed>();

    @Path("rowset[2]")
    @Attribute(name="name", required = false)
    private String rowsetName2;

    @Path("rowset[2]")
    @Attribute(name="key", required = false)
    private String rowsetKey2;

    @Path("rowset[2]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns2;

    @Path("rowset[2]")
    @ElementList(type = Blocked.class, required = false, inline = true)
    private List<Blocked> blocked = new ArrayList<Blocked>();

    @Attribute(name = "channelID", required = false)
    private Long channelId;

    @Attribute(required = false)
    private String comparisonKey;

    @Attribute(required = false)
    private String displayName;

    @Attribute(required = false)
    private String hasPassword;

    @Attribute(required = false)
    private String motd;

    @Path("rowset[3]")
    @Attribute(name="name", required = false)
    private String rowsetName3;

    @Path("rowset[3]")
    @Attribute(name="key", required = false)
    private String rowsetKey3;

    @Path("rowset[3]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns3;

    @Path("rowset[3]")
    @ElementList(type = Muted.class, required = false, inline = true)
    private List<Muted> muted = new ArrayList<Muted>();

    @Path("rowset[4]")
    @Attribute(name="name", required = false)
    private String rowsetName4;

    @Path("rowset[4]")
    @Attribute(name="key", required = false)
    private String rowsetKey4;

    @Path("rowset[4]")
    @Attribute(name="columns", required = false)
    private String rowsetColumns4;

    @Path("rowset[4]")
    @ElementList(type = Operator.class, required = false, inline = true)
    private List<Operator> operators = new ArrayList<Operator>();

    @Attribute(name = "ownerID", required = false)
    private Long ownerId;

    @Attribute(required = false)
    private String ownerName;

    public List<Allowed> getAllowed(){
        return allowed;
    }

    public List<Blocked> getBlocked(){
        return blocked;
    }

    public Long getChannelId(){
        return channelId;
    }

    public String getComparisonKey(){
        return comparisonKey;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getHasPassword(){
        return hasPassword;
    }

    public String getMotd(){
        return motd;
    }

    public List<Muted> getMuted(){
        return muted;
    }

    public List<Operator> getOperators(){
        return operators;
    }

    public Long getOwnerId(){
        return ownerId;
    }

    public String getOwnerName(){
        return ownerName;
    }

    @Override
    public String toString(){
        return "Channel [" +
            "allowed = " + allowed + ", " +
            "blocked = " + blocked + ", " +
            "channelId = " + channelId + ", " +
            "comparisonKey = " + comparisonKey + ", " +
            "displayName = " + displayName + ", " +
            "hasPassword = " + hasPassword + ", " +
            "motd = " + motd + ", " +
            "muted = " + muted + ", " +
            "operators = " + operators + ", " +
            "ownerId = " + ownerId + ", " +
            "ownerName = " + ownerName + ", " +
            "]";
    }

}
