package net.dschinghiskahn.eveapi.character.standings;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class CharacterNpcStandings {

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
    @ElementList(type = NpcCorporation.class, required = false, inline = true)
    private List<NpcCorporation> npcCorporations = new ArrayList<>();

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
    @ElementList(type = Agent.class, required = false, inline = true)
    private List<Agent> agents = new ArrayList<>();

    @Path("rowset[3]")
    @Attribute(name = "name", required = false)
    private String rowsetName3;

    @Path("rowset[3]")
    @Attribute(name = "key", required = false)
    private String rowsetKey3;

    @Path("rowset[3]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns3;

    @Path("rowset[3]")
    @ElementList(type = Faction.class, required = false, inline = true)
    private List<Faction> factions = new ArrayList<>();

    public List<NpcCorporation> getNpcCorporations() {
        return npcCorporations;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    @Override
    public String toString() {
        return "CharacterNpcStandings ["
            + "npcCorporations = " + npcCorporations + ", "
            + "agents = " + agents + ", "
            + "factions = " + factions + ", "
            + "]";
    }

}
