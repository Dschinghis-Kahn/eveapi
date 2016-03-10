package net.dschinghiskahn.eveapi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.simpleframework.xml.transform.Transform;

import android.util.Log;
import net.dschinghiskahn.eveapi.Api;

public class DateValueTransformer implements Transform<Date> {

    private static final SimpleDateFormat DATE_FORMAT;

    static {
        DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override
    public Date read(String value) {
        Date result = null;
        if (value != null && value.length() > 0) {
            try {
                synchronized (DATE_FORMAT) {
                    result = DATE_FORMAT.parse(value);
                }
            } catch (ParseException e) {
                Log.w(Api.class.getSimpleName(), "Could not parse date \"" + value + "\".", e);
            }
        }
        return result;
    }

    @Override
    public String write(Date value) {
        String result = null;
        if (value != null) {
            synchronized (DATE_FORMAT) {
                result = DATE_FORMAT.format(value);
            }
        }
        return result;
    }

}
