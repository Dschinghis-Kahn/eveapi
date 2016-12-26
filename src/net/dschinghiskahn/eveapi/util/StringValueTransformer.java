package net.dschinghiskahn.eveapi.util;

import org.simpleframework.xml.transform.Transform;

public class StringValueTransformer implements Transform<String> {

    @Override
    public String read(final String value) {
        String result = value;
        if (value == null) {
            result = "";
        }
        return result;
    }

    @Override
    public String write(final String value) {
        return value;
    }

}
