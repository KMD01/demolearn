package listener;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.transaction.event.TransactionalEventListener;

public class EmailListener {

    @TransactionalEventListener
    public void sendEmail(PayloadApplicationEvent<PrintEvent> event){
        PrintEvent printEvent = event.getPayload();
        System.out.println(printEvent.header);
        System.out.println(printEvent.body);
    }
}
