package net.dschinghiskahn.eveapi.character.clones;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class JumpCloneImplant {

    @Attribute(name = "jumpCloneID", required = false)
    private Long jumpCloneId;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(required = false)
    private String typeName;

    public Long getJumpCloneId() {
        return jumpCloneId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "JumpCloneImplant ["
            + "jumpCloneId = " + jumpCloneId + ", "
            + "typeId = " + typeId + ", "
            + "typeName = " + typeName + ", "
            + "]";
    }

}
