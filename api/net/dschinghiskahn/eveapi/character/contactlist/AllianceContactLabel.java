package net.dschinghiskahn.eveapi.character.contactlist;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class AllianceContactLabel {

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
        return "AllianceContactLabel [" +
            "labelId = " + labelId + ", " +
            "name = " + name + ", " +
            "]";
    }

}
