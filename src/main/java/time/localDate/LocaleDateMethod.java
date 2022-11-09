package time.localDate;


import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class LocaleDateMethod {

    public void showLastDayOfTheMonth(int month, int year) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.with(TemporalAdjusters.lastDayOfMonth());
    }

    private void countTheNumberOfTheDays(LocalDate from, LocalDate to) {
        long amountOfDays = ChronoUnit.DAYS.between(from, to);
    }

}
