package First25;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateProgram {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC+3"));
        String dateInUtcPlus6 = sdf.format(currentDate);
        System.out.println("Current Date and Time in UTC+3: " + dateInUtcPlus6);
    }
}
