package fr.lacombe;

import java.time.LocalDateTime;

public class DateFormatter {
    private LocalDateTime date;

    public DateFormatter(LocalDateTime date) {
        this.date = date;
    }

    public String format() {
        StringBuilder result = new StringBuilder();

        result.append(date.getMonthValue()).append("/");
        result.append(date.getDayOfMonth()).append("/");
        result.append(date.getYear()).append(" at ");

        result.append(date.getHour()).append("h");
        result.append(date.getMinute()).append("mn");

        return result.toString();
    }
}
