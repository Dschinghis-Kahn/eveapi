package net.dschinghiskahn.eveapi.character.contactlist;

import java.lang.Long;
import java.lang.String;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class ContactLabel {

    @Attribute(name = "labelID", required = false)
    private Long labelId;

    @Attribute(required = false)
    private String name;

    public Long getLabelId(){
        return labelId;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "ContactLabel [" +
            "labelId = " + labelId + ", " +
            "name = " + name + ", " +
            "]";
    }

}
