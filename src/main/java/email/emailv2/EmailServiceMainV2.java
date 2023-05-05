package email.emailv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan
public class EmailServiceMainV2 {

    @Autowired
    EmailServiceV2 emailService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmailServiceMainV2.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void test() throws Exception {
        emailService.sendEmail("dyk.krzysztof@gmail.com", "JAVA APP: email via java 3", "HI,\r\n This is via Java application by Chris :D");
    }
}
