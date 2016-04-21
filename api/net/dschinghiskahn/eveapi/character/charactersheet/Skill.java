package net.dschinghiskahn.eveapi.character.charactersheet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Skill {

    @Attribute(required = false)
    private Long level;

    @Attribute(required = false)
    private Long published;

    @Attribute(required = false)
    private Long skillpoints;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getLevel(){
        return level;
    }

    public Long getPublished(){
        return published;
    }

    public Long getSkillpoints(){
        return skillpoints;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "Skill [" +
            "level = " + level + ", " +
            "published = " + published + ", " +
            "skillpoints = " + skillpoints + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
