package methodinstancia;

import java.util.Date;

public class Client {
    String firstName;
    String lastName;
    String birthdayDate;
    String email;
    String cellPhone;

    String getCompleteName() {
        String completeName = firstName + " " + lastName;

        if (firstName == null || lastName == null){

            completeName = "Não consta no sistema";

        }
        return completeName;
    }
}


