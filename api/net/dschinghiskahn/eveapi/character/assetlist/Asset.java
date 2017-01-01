package net.dschinghiskahn.eveapi.character.assetlist;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Asset {

    @Path("rowset[1]")
    @Attribute(name = "name", required = false)
    private String rowsetName1;

    @Path("rowset[1]")
    @Attribute(name = "key", required = false)
    private String rowsetKey1;

    @Path("rowset[1]")
    @Attribute(name = "columns", required = false)
    private String rowsetColumns1;

    @Path("rowset[1]")
    @ElementList(type = Content.class, required = false, inline = true)
    private List<Content> contents = new ArrayList<>();

    @Attribute(required = false)
    private Long flag;

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(name = "locationID", required = false)
    private Long locationId;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(required = false)
    private Long rawQuantity;

    @Attribute(required = false)
    private Long singleton;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    public List<Content> getContents() {
        return contents;
    }

    public Long getFlag() {
        return flag;
    }

    public Long getItemId() {
        return itemId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getRawQuantity() {
        return rawQuantity;
    }

    public Long getSingleton() {
        return singleton;
    }

    public Long getTypeId() {
        return typeId;
    }

    @Override
    public String toString() {
        return "Asset ["
            + "contents = " + contents + ", "
            + "flag = " + flag + ", "
            + "itemId = " + itemId + ", "
            + "locationId = " + locationId + ", "
            + "quantity = " + quantity + ", "
            + "rawQuantity = " + rawQuantity + ", "
            + "singleton = " + singleton + ", "
            + "typeId = " + typeId + ", "
            + "]";
    }

}
