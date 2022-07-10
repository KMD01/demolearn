package email;

public class EmailServiceMain {

    public static void main(String[] args) throws Exception {
        //EmailService emailService = new EmailService();
        //emailService.sendEmail("mariusz.kowalski5000@gmail.com");
        EmailServiceImpl emailService1 = new EmailServiceImpl();
        emailService1.sendSimpleMessage("mariusz.kowalski5000@gmail.com", "title", "text");
    }
}
