package net.dschinghiskahn.eveapi.util;

import org.simpleframework.xml.transform.Transform;

public class DoubleValueTransformer implements Transform<Double> {

    @Override
    public Double read(String value) {
        Double result = 0.0;
        if (value != null && value.length() > 0) {
            result = Double.valueOf(value);
        }
        return result;
    }

    @Override
    public String write(Double value) {
        return value.toString();
    }

}
