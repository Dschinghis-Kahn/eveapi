package net.dschinghiskahn.eveapi.character.charactersheet;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Certificate {

    @Attribute(name = "certificateID", required = false)
    private Long certificateId;

    public Long getCertificateId() {
        return certificateId;
    }

    @Override
    public String toString() {
        return "Certificate ["
            + "certificateId = " + certificateId + ", "
            + "]";
    }

}
