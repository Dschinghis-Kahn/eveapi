package net.dschinghiskahn.eveapi.account.apikeyinfo;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class ApiKeyInfo extends ApiResponse {

    @Path("result")
    @Element(required = false)
    private Key key;

    public Key getKey(){
        return key;
    }

    @Override
    public String toString(){
        return "ApiKeyInfo [" +
            "key = " + key + ", " +
            "]";
    }

}
