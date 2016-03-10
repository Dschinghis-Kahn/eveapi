package net.dschinghiskahn.eveapi.util;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "eveapi", strict = false)
public class ErrorResponse extends AbstractApiResponse {

    @Path("error")
    @Attribute(required = false)
    private Long code;

    @Path("error")
    @Text(required = false)
    private String message;

    public Long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Error [code = " + code + ", error = " + message + "]";
    }

}
