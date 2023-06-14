package com.akkodis.java.tech.interview.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {
    public static LocalDateTime convertToLocalDateTime(String dateTimeString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
            return LocalDateTime.parse(dateTimeString, formatter);
        } catch (DateTimeParseException ex) {
            throw new DateTimeParseException(ex.getMessage(), ex.getParsedString(), ex.getErrorIndex());
        }
    }
}
