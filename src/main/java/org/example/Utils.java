package org.example;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    private final Clock clock;

    public Utils() {
        clock = Clock.systemDefaultZone();
    }

    public Utils(Clock clock) {
        this.clock = clock;
    }

    public String currentDate() {
        LocalDate date = LocalDate.now(clock);
        //return date.getYear() + "-" + String.format("%02d",date.getMonthValue()) + "-" + String.format("%02d",date.getDayOfMonth());
        return LocalDateTime.now(clock).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
