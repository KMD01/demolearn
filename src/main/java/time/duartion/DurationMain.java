package time.duartion;

import java.time.LocalDate;

public class DurationMain {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().minusMonths(1).minusDays(10);
        DurationMethods duration = new DurationMethods();
        duration.showDuration(date1, date2);
    }
}
