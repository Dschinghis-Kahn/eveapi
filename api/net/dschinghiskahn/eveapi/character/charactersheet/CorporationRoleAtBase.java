package net.dschinghiskahn.eveapi.character.charactersheet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class CorporationRoleAtBase {

    @Attribute(name = "roleID", required = false)
    private Long roleId;

    @Attribute(required = false)
    private String roleName;

    public Long getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return "CorporationRoleAtBase ["
            + "roleId = " + roleId + ", "
            + "roleName = " + roleName + ", "
            + "]";
    }

}
