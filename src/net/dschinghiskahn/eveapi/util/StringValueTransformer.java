package net.dschinghiskahn.eveapi.util;

import org.simpleframework.xml.transform.Transform;

public class StringValueTransformer implements Transform<String> {

    @Override
    public String read(String value) {
        String result = "";
        if (value != null && value.length() > 0) {
            result = String.valueOf(value);
        }
        return result;
    }

    @Override
    public String write(String value) {
        return value.toString();
    }

}
