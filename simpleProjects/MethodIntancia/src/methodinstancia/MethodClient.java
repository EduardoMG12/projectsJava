package methodinstancia;

public class MethodClient {
    public static void main(String[] args) {
        Client client = new Client();

        client.firstName = "Eduardo";
        client.lastName = "Mello";
        client.cellPhone = "48999802165";
        client.email = "abcde@hotmail.com";
        client.birthdayDate = "2005-11-13";
        client.getCompleteName();

        Client client2 = new Client();

        client2.firstName = "Diogenes";
        client2.lastName = "Gorge";
        client2.cellPhone = "48999846165";
        client2.email = "abcdefg@hotmail.com";
        client2.birthdayDate = "2002-12-05";
        client2.getCompleteName();

        Client client3 = new Client();

        System.out.println(client.getCompleteName());
        System.out.println(client2.getCompleteName());
        System.out.println(client3.getCompleteName());
}
}
