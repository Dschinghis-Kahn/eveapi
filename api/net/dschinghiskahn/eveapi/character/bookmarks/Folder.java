package net.dschinghiskahn.eveapi.character.bookmarks;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Folder {

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
    @ElementList(type = Bookmark.class, required = false, inline = true)
    private List<Bookmark> bookmarks = new ArrayList<Bookmark>();

    @Attribute(name = "folderID", required = false)
    private Long folderId;

    @Attribute(required = false)
    private String folderName;

    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public Long getFolderId() {
        return folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    @Override
    public String toString() {
        return "Folder ["
            + "bookmarks = " + bookmarks + ", "
            + "folderId = " + folderId + ", "
            + "folderName = " + folderName + ", "
            + "]";
    }

}
