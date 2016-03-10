package net.dschinghiskahn.eveapi.character.bookmarks;

import java.lang.Double;
import java.lang.Long;
import java.lang.String;
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

    @Attribute(required = false)
    private Double x;

    @Attribute(required = false)
    private Double y;

    @Attribute(required = false)
    private Double z;

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

    public Double getX(){
        return x;
    }

    public Double getY(){
        return y;
    }

    public Double getZ(){
        return z;
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
            "x = " + x + ", " +
            "y = " + y + ", " +
            "z = " + z + ", " +
            "]";
    }

}
