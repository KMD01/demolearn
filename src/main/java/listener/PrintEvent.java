package listener;

import lombok.Builder;
import org.springframework.stereotype.Component;

@Builder
public class PrintEvent {

    String header;
    String body;

}
