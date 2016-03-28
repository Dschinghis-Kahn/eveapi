package net.dschinghiskahn.eveapi.character.bookmarks;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Bookmark {

    @Attribute(name = "bookmarkID", required = false)
    private Long bookmarkId;

    @Attribute(required = false)
    private Date created;

    @Attribute(name = "creatorID", required = false)
    private Long creatorId;

    @Attribute(name = "itemID", required = false)
    private Long itemId;

    @Attribute(name = "locationID", required = false)
    private Long locationId;

    @Attribute(required = false)
    private String memo;

    @Attribute(required = false)
    private String note;

    @Attribute(name = "typeID", required = false)
    private Long typeId;

    @Attribute(name = "x", required = false)
    private Double xx;

    @Attribute(name = "y", required = false)
    private Double yy;

    @Attribute(name = "z", required = false)
    private Double zz;

    public Long getBookmarkId(){
        return bookmarkId;
    }

    public Date getCreated(){
        return created;
    }

    public Long getCreatorId(){
        return creatorId;
    }

    public Long getItemId(){
        return itemId;
    }

    public Long getLocationId(){
        return locationId;
    }

    public String getMemo(){
        return memo;
    }

    public String getNote(){
        return note;
    }

    public Long getTypeId(){
        return typeId;
    }

    public Double getXx(){
        return xx;
    }

    public Double getYy(){
        return yy;
    }

    public Double getZz(){
        return zz;
    }

    @Override
    public String toString(){
        return "Bookmark [" +
            "bookmarkId = " + bookmarkId + ", " +
            "created = " + created + ", " +
            "creatorId = " + creatorId + ", " +
            "itemId = " + itemId + ", " +
            "locationId = " + locationId + ", " +
            "memo = " + memo + ", " +
            "note = " + note + ", " +
            "typeId = " + typeId + ", " +
            "xx = " + xx + ", " +
            "yy = " + yy + ", " +
            "zz = " + zz + ", " +
            "]";
    }

}
