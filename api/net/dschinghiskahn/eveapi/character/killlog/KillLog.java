package net.dschinghiskahn.eveapi.character.killlog;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class KillLog extends AbstractApiResponse {

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
    @ElementList(type = Kill.class, required = false, inline = true)
    private List<Kill> kills = new ArrayList<Kill>();

    public List<Kill> getKills(){
        return kills;
    }

    @Override
    public String toString(){
        return "KillLog [" +
            "kills = " + kills + ", " +
            "]";
    }

}
