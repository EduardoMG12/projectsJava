import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What your first name: ");
        String name = scanner.nextLine();
        System.out.print("What your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Your complete name is " + name + " " + lastName);
    }
}