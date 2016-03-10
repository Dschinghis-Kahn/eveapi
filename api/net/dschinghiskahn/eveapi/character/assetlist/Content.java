package net.dschinghiskahn.eveapi.character.assetlist;

import java.lang.Long;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Content {

    @Attribute(required = false)
    private Long flag;

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(required = false)
    private Long rawQuantity;

    @Attribute(required = false)
    private Long singleton;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public Long getFlag(){
        return flag;
    }

    public Long getItemId(){
        return itemId;
    }

    public Long getQuantity(){
        return quantity;
    }

    public Long getRawQuantity(){
        return rawQuantity;
    }

    public Long getSingleton(){
        return singleton;
    }

    public Long getTypeId(){
        return typeId;
    }

    @Override
    public String toString(){
        return "Content [" +
            "flag = " + flag + ", " +
            "itemId = " + itemId + ", " +
            "quantity = " + quantity + ", " +
            "rawQuantity = " + rawQuantity + ", " +
            "singleton = " + singleton + ", " +
            "typeId = " + typeId + ", " +
            "]";
    }

}
