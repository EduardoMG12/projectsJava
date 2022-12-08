package listCreate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class list {

    public static void main(String[] args) throws IOException {
        ArrayList<String> daskList = new ArrayList<>();
        FileWriter createFile = new FileWriter("exerciseList.txt");
        Scanner scanner = new Scanner(System.in);

        String message = "";

            Integer i = 0;

        while (!message.toLowerCase().equals("x")) {
            System.out.print("Escreva oque voce quer colocar na sua lista, para quebrar o programa digite X: ");
            message = scanner.nextLine();
            i++;

            if (message.toLowerCase().equals("x")) {
                break;
            }
            message = i +". " + message +" \n";
            daskList.add(message);
        }
        daskList.forEach((String messageList) -> {
            try {
                createFile.write(messageList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        scanner.close();
        createFile.close();
    }


}
