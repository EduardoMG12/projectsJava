import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What your name? ");
        String name = scanner.nextLine();
        String message = " Hello World learning Java!";
        System.out.print("My name is " + name + "," + message);

        scanner.close();
    }
}