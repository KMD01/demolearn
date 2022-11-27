package listener;

import org.springframework.context.ApplicationEventPublisher;


public class EmailService{

    ApplicationEventPublisher applicationEventPublisher;

    public PrintEvent generateEmail() {
        PrintEvent printEvent = PrintEvent.builder()
                .header("Wykaz przelewów")
                .body("Lista przelewów")
                .build();
        applicationEventPublisher.publishEvent(printEvent);
        return printEvent;
    }

}
