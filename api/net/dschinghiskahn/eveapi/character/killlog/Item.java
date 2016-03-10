package net.dschinghiskahn.eveapi.character.killlog;

import java.lang.Long;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Item {

    @Attribute(required = false)
    private Long flag;

    @Attribute(required = false)
    private Long qtyDestroyed;

    @Attribute(required = false)
    private Long qtyDropped;

    @Attribute(required = false)
    private Long singleton;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getFlag(){
        return flag;
    }

    public Long getQtyDestroyed(){
        return qtyDestroyed;
    }

    public Long getQtyDropped(){
        return qtyDropped;
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
            "flag = " + flag + ", " +
            "qtyDestroyed = " + qtyDestroyed + ", " +
            "qtyDropped = " + qtyDropped + ", " +
            "singleton = " + singleton + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
