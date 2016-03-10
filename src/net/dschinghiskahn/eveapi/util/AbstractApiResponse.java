package net.dschinghiskahn.eveapi.util;

import java.util.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public abstract class AbstractApiResponse {

    @Attribute(required = false)
    private Long version;

    @Element(required = false)
    private Date currentTime, cachedUntil;

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
