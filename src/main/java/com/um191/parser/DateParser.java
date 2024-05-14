package com.um191.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateParser {

    public Date getData(String lineData) throws ParseException {
        String[] parts = lineData.split("\\s+");

        int dateIndex = 3;
        int timeIndex = 4;
        String rawDate = parts[dateIndex];
        String rawTime = parts[timeIndex];

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SS");
        Date date = null;
        try {
            date = dateFormat.parse(rawDate + " " + rawTime);
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

        return date;
    }
}
