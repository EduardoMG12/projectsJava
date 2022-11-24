import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Enter a number to perform the calculation: ");
        Integer number = getNumber.nextInt();
        Integer result = number * number;
        System.out.println("The result is: " + result);
    }
}