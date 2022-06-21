package methods;


import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;


public class TimeMethod {



    public void showDuration(LocalDate start, LocalDate end){
        Duration periodOfVacations = Duration.between(start,end);
    }



    Duration d1 = Duration.ofDays(5);





}
