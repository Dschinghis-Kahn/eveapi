package net.dschinghiskahn.eveapi.account.apikeyinfo;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Key {

    @Attribute(required = false)
    private Long accessMask;

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
    @ElementList(type = Character.class, required = false, inline = true)
    private List<Character> characters = new ArrayList<Character>();

    @Attribute(name = "expires", required = false)
    private String expire;

    @Attribute(required = false)
    private String type;

    public Long getAccessMask(){
        return accessMask;
    }

    public List<Character> getCharacters(){
        return characters;
    }

    public String getExpire(){
        return expire;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){
        return "Key [" +
            "accessMask = " + accessMask + ", " +
            "characters = " + characters + ", " +
            "expire = " + expire + ", " +
            "type = " + type + ", " +
            "]";
    }

}
