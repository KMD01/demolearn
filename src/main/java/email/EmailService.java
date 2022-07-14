package email;

import lombok.extern.slf4j.Slf4j;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Slf4j // Logs
public class EmailService {

    private static final String SENDER = "mariusz.kowalski5000@gmail.com";
    private static final String SENDER_PASSWORD = "shcmhqpukutgaulz";

    public void sendEmail(String receiver, String title, String body) throws Exception {
        log.info("EMAIL SENDING: start.");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "*");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SENDER, SENDER_PASSWORD);
            }};

        Session session = Session.getInstance(properties,authenticator);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setSession(session);
        emailMessage.setSender(SENDER);
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

    private Message prepareMessage(EmailMessage emailMessage) {
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






