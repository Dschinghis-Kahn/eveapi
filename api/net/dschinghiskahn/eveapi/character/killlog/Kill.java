package net.dschinghiskahn.eveapi.character.killlog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Kill {

    @Path("rowset[1]")
    @Attribute(name = "name", required = false)
    private String rowsetName1;

    @Path("rowset[1]")
    @Attribute(name = "key", required = false)
    private String rowsetKey1;

    @Path("rowset[1]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns1;

    @Path("rowset[1]")
    @ElementList(type = Attacker.class, required = false, inline = true)
    private List<Attacker> attackers = new ArrayList<>();

    @Path("rowset[2]")
    @Attribute(name = "name", required = false)
    private String rowsetName2;

    @Path("rowset[2]")
    @Attribute(name = "key", required = false)
    private String rowsetKey2;

    @Path("rowset[2]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns2;

    @Path("rowset[2]")
    @ElementList(type = Item.class, required = false, inline = true)
    private List<Item> items = new ArrayList<>();

    @Attribute(name = "killID", required = false)
    private Long killId;

    @Attribute(required = false)
    private Date killTime;

    @Attribute(name = "moonID", required = false)
    private Long moonId;

    @Attribute(name = "solarSystemID", required = false)
    private Long solarSystemId;

    @Element(required = false)
    private Victim victim;

    public List<Attacker> getAttackers() {
        return attackers;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getKillId() {
        return killId;
    }

    public Date getKillTime() {
        return killTime;
    }

    public Long getMoonId() {
        return moonId;
    }

    public Long getSolarSystemId() {
        return solarSystemId;
    }

    public Victim getVictim() {
        return victim;
    }

    @Override
    public String toString() {
        return "Kill ["
            + "attackers = " + attackers + ", "
            + "items = " + items + ", "
            + "killId = " + killId + ", "
            + "killTime = " + killTime + ", "
            + "moonId = " + moonId + ", "
            + "solarSystemId = " + solarSystemId + ", "
            + "victim = " + victim + ", "
            + "]";
    }

}
