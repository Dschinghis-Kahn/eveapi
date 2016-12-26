package net.dschinghiskahn.eveapi.character.planetaryroutes;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "row")
public class Route {

    @Attribute(name = "contentTypeID", required = false)
    private Long contentTypeId;

    @Attribute(required = false)
    private String contentTypeName;

    @Attribute(name = "destinationPinID", required = false)
    private Long destinationPinId;

    @Attribute(required = false)
    private Long quantity;

    @Attribute(name = "routeID", required = false)
    private Long routeId;

    @Attribute(name = "sourcePinID", required = false)
    private Long sourcePinId;

    @Attribute(required = false)
    private Long waypoint1;

    @Attribute(required = false)
    private Long waypoint2;

    @Attribute(required = false)
    private Long waypoint3;

    @Attribute(required = false)
    private Long waypoint4;

    @Attribute(required = false)
    private Long waypoint5;

    public Long getContentTypeId() {
        return contentTypeId;
    }

    public String getContentTypeName() {
        return contentTypeName;
    }

    public Long getDestinationPinId() {
        return destinationPinId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getRouteId() {
        return routeId;
    }

    public Long getSourcePinId() {
        return sourcePinId;
    }

    public Long getWaypoint1() {
        return waypoint1;
    }

    public Long getWaypoint2() {
        return waypoint2;
    }

    public Long getWaypoint3() {
        return waypoint3;
    }

    public Long getWaypoint4() {
        return waypoint4;
    }

    public Long getWaypoint5() {
        return waypoint5;
    }

    @Override
    public String toString() {
        return "Route ["
            + "contentTypeId = " + contentTypeId + ", "
            + "contentTypeName = " + contentTypeName + ", "
            + "destinationPinId = " + destinationPinId + ", "
            + "quantity = " + quantity + ", "
            + "routeId = " + routeId + ", "
            + "sourcePinId = " + sourcePinId + ", "
            + "waypoint1 = " + waypoint1 + ", "
            + "waypoint2 = " + waypoint2 + ", "
            + "waypoint3 = " + waypoint3 + ", "
            + "waypoint4 = " + waypoint4 + ", "
            + "waypoint5 = " + waypoint5 + ", "
            + "]";
    }

}
