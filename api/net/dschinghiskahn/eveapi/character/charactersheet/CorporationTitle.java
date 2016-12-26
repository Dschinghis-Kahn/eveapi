package net.dschinghiskahn.eveapi.character.charactersheet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class CorporationTitle {

    @Attribute(name = "titleID", required = false)
    private Long titleId;

    @Attribute(required = false)
    private String titleName;

    public Long getTitleId() {
        return titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    @Override
    public String toString() {
        return "CorporationTitle ["
            + "titleId = " + titleId + ", "
            + "titleName = " + titleName + ", "
            + "]";
    }

}
