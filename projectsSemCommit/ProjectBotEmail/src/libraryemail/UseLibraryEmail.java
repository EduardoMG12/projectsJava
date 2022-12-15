package libraryemail;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.ArrayList;

public class UseLibraryEmail {
public static void main(String[] args) throws EmailException, EmailException {
    Bot bot1 = new Bot();
    bot1.setEmail("simmanoeissoaimesmoconfiavaidarcerto@outlook.com");
    bot1.setPassword("vaiDarCertoPoConfia!");
    bot1.add();

    Bot bot2 = new Bot();
    bot2.setEmail("joaopereirarasilvasaurocomHYPE@outlook.com");
    bot2.setPassword("tenhomuitohypeEuSouOLUCASHYPE");
    bot2.add();

    Bot bot3 = new Bot();
    bot3.setEmail("LucasHypeeeee@outlook.com");
    bot3.setPassword("LucasHype912389139854891234");
    bot3.add();

    Bot bot4 = new Bot();
    bot3.setEmail("");
    bot3.setPassword("");
    bot3.add();

    for(int i = 0; i < Bot.bots.size(); i++) {
        String username = Bot.bots.get(i).email;
        String password = Bot.bots.get(i).password;
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator(username, password));
            email.setFrom(username);
            email.setSubject("Um email teste para fins educativos");
            email.setMsg(MessageSend.messageSend[i]);
            email.addTo("zamuplays@gmail.com");
            email.setStartTLSEnabled(true);
            email.send();
            System.out.println("Email enviado com sucesso!!");

        }catch (Exception e){
            System.out.println("Erro o email não foi enviado " + e);
        }
    }

 }
}
