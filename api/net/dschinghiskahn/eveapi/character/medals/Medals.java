package net.dschinghiskahn.eveapi.character.medals;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class Medals extends ApiResponse {

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
    @ElementList(type = Medal.class, required = false, inline = true)
    private List<Medal> currentCorporation = new ArrayList<Medal>();

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
    @ElementList(type = Medal.class, required = false, inline = true)
    private List<Medal> otherCorporations = new ArrayList<Medal>();

    public List<Medal> getCurrentCorporation(){
        return currentCorporation;
    }

    public List<Medal> getOtherCorporations(){
        return otherCorporations;
    }

    @Override
    public String toString(){
        return "Medals [" +
            "currentCorporation = " + currentCorporation + ", " +
            "otherCorporations = " + otherCorporations + ", " +
            "]";
    }

}
