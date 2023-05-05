package email.email;

import lombok.Data;

import javax.mail.Session;

@Data // Lombok creates constructor, getters, setters
public class EmailBody {
    private Session session;
    private String sender;
    private String receiver;
    private String title;
    private String body;
}

