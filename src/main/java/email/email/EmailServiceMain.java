package email.email;

public class EmailServiceMain {

    public static void main(String[] args) throws Exception {
        EmailService emailService = new EmailService();
        emailService.sendEmail("dyk.krzysztof@gmail.com", "JAVA APP: email via java 3", "HI,\r\n This is via Java application by Chris :D");
    }
}
