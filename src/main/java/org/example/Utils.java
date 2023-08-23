package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    
    public static String currentDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
