package Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDate;






public class datetimeformate {

    public static void main(String[] args) {

        DateTimeFormatter usdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        System.out.println("US Date: " + usdate.format(LocalDate.now()));

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        double amount = 123456.78;
        System.out.println("Japanese Currency: " + nf.format(amount));

        NumberFormat nfGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("German Currency: " + nfGermany.format(amount));

        NumberFormat uscurrentcy = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US Currency: " + uscurrentcy.format(amount));

    }
    
}