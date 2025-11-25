package Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class datetime {
    public static void main(String[] args) {
        System.out.println("Date and Time Module");

        LocalDateTime now = LocalDateTime.now();
        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date and Time: " + now);

        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTimeFormatted = now.format(fd);
        System.out.println("Formatted Date: " + dateTimeFormatted);

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Date and Time in New York: " + zdt);
    }
}