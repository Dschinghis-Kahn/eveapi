package net.dschinghiskahn.eveapi.character.clones;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Attributes {

    @Element(required = false)
    private Long charisma;

    @Element(required = false)
    private Long intelligence;

    @Element(required = false)
    private Long memory;

    @Element(required = false)
    private Long perception;

    @Element(required = false)
    private Long willpower;

    public Long getCharisma() {
        return charisma;
    }

    public Long getIntelligence() {
        return intelligence;
    }

    public Long getMemory() {
        return memory;
    }

    public Long getPerception() {
        return perception;
    }

    public Long getWillpower() {
        return willpower;
    }

    @Override
    public String toString() {
        return "Attributes ["
            + "charisma = " + charisma + ", "
            + "intelligence = " + intelligence + ", "
            + "memory = " + memory + ", "
            + "perception = " + perception + ", "
            + "willpower = " + willpower + ", "
            + "]";
    }

}
