package net.dschinghiskahn.eveapi.character.blueprints;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class Blueprints extends AbstractApiResponse {

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
    @ElementList(type = Blueprint.class, required = false, inline = true)
    private List<Blueprint> blueprints = new ArrayList<Blueprint>();

    public List<Blueprint> getBlueprints(){
        return blueprints;
    }

    @Override
    public String toString(){
        return "Blueprints [" +
            "blueprints = " + blueprints + ", " +
            "]";
    }

}
