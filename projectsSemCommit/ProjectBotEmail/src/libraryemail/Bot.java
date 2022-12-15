package libraryemail;

import javax.mail.search.StringTerm;
import java.util.ArrayList;

public class Bot {

    String email;
    String password;
    public static ArrayList<Bot> bots = new ArrayList<>();


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public void add(){
        bots.add(this);
    }
}
