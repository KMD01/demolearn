package emailv2;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.mail.Session;

@Data //Lombok creates constructor, getters, setter
@Component
public class EmailBodyV2 {
   private Session session;
   private String sender;
   private String receiver;
   private String title;
   private String body;
}



