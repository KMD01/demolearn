package emailv2;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Slf4j //Logs
@Service
@Data // Lombok creates constructor, getters, setters
public class EmailServiceV2 {

    @Value("${sender}")
    private String sender;

    @Value("${senderPassword}")
    private String senderPassword;

    public void sendEmail(String receiver, String title, String body) throws Exception {
        log.info("EMAIL SENDING: start.");

        if (sender!=null){
            log.info("EMAIL SENDING: Sender is not null.");
        } else{
            log.info("EMAIL SENDING: Sender is null.");
        }
        if (senderPassword!=null){
            log.info("EMAIL SENDING: SenderPassword is not null.");
        } else{
            log.info("EMAIL SENDING: SenderPassword is null.");
        }



        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "*");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("sender","mariusz.kowalski5000@gmail.com");
        properties.put("senderPassword","shcmhqpukutgaulz");

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, senderPassword);
            }};

        Session session = Session.getInstance(properties,authenticator);

        EmailMessageV2 emailMessage = new EmailMessageV2();
        emailMessage.setSession(session);
        emailMessage.setSender(sender);
        emailMessage.setReceiver(receiver);
        emailMessage.setTitle(title);
        emailMessage.setBody(body);

        Message message = prepareMessage(emailMessage);
        log.info("EMAIL SENDING: processing.");
        if (message!=null) {
            Transport.send(message);
            log.info("EMAIL SENDING: done.");
        } else{
            log.info("EMAIL SENDING: error while transporting email. ");
        }
    }

    private Message prepareMessage(EmailMessageV2 emailMessage) {
        try {
            Message message = new MimeMessage(emailMessage.getSession());
            message.setFrom(new InternetAddress(emailMessage.getSender()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailMessage.getReceiver()));
            message.setSubject(emailMessage.getTitle());
            message.setText(emailMessage.getBody());
            return message;
        } catch (Exception ex) {
            log.info("EMAIL SENDING: error while 'prepareMessage'. ");
        }
        return null;
    }
}






