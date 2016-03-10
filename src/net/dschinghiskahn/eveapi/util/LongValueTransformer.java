package net.dschinghiskahn.eveapi.util;

import org.simpleframework.xml.transform.Transform;

public class LongValueTransformer implements Transform<Long> {

    @Override
    public Long read(String value) {
        Long result = 0L;
        if (value != null && value.length() > 0) {
            result = Long.valueOf(value);
        }
        return result;
    }

    @Override
    public String write(Long value) {
        return value.toString();
    }

}
