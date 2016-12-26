package net.dschinghiskahn.eveapi.account.accountstatus;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class MultiCharacterTraining {

    @Attribute(required = false)
    private Date trainingEnd;

    public Date getTrainingEnd() {
        return trainingEnd;
    }

    @Override
    public String toString() {
        return "MultiCharacterTraining ["
            + "trainingEnd = " + trainingEnd + ", "
            + "]";
    }

}
