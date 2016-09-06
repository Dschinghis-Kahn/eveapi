package net.dschinghiskahn.eveapi.api.calllist;

import java.util.ArrayList;
import java.util.List;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class CallList extends ApiResponse {

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
    @ElementList(type = CallGroup.class, required = false, inline = true)
    private List<CallGroup> callGroups = new ArrayList<CallGroup>();

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
    @ElementList(type = Call.class, required = false, inline = true)
    private List<Call> calls = new ArrayList<Call>();

    public List<CallGroup> getCallGroups(){
        return callGroups;
    }

    public List<Call> getCalls(){
        return calls;
    }

    @Override
    public String toString(){
        return "CallList [" +
            "callGroups = " + callGroups + ", " +
            "calls = " + calls + ", " +
            "]";
    }

}
