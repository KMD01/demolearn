package time.duartion;

import java.time.Duration;
import java.time.LocalDate;

public class DurationMethods {
    public void showDuration(LocalDate start, LocalDate end) {
        Duration duration = Duration.between(start, end);
    }
}
