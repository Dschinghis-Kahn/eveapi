package net.dschinghiskahn.eveapi.character.contractitems;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Item {

    @Attribute(required = false)
    private Long included;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(required = false)
    private Long rawQuantity;

    @Attribute(name = "recordID", required = false)
    private Long recordId;

    @Attribute(required = false)
    private Long singleton;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getIncluded(){
        return included;
    }

    public Long getQuantity(){
        return quantity;
    }

    public Long getRawQuantity(){
        return rawQuantity;
    }

    public Long getRecordId(){
        return recordId;
    }

    public Long getSingleton(){
        return singleton;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "Item [" +
            "included = " + included + ", " +
            "quantity = " + quantity + ", " +
            "rawQuantity = " + rawQuantity + ", " +
            "recordId = " + recordId + ", " +
            "singleton = " + singleton + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
