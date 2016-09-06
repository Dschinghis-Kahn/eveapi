package net.dschinghiskahn.eveapi.util;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class ApiResponse {

    @Attribute(required = false)
    private transient Long version;

    @Element(required = false)
    private transient Date currentTime, cachedUntil;

    public Date getCachedUntil() {
        return cachedUntil;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public Long getVersion() {
        return version;
    }
}
