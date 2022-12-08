import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice the number for sum: ");
        Integer firstNumber = scanner.nextInt();
        System.out.print("Choice the number for sum: ");
        Integer lastNumber = scanner.nextInt();
        System.out.print("[1]subtraction\n[2]addition\nChage for sum: ");
        Integer sum = scanner.nextInt();
        switch (sum){
            case 1:
                System.out.print(subtraction(firstNumber, lastNumber));
                break;
            case 2:
                System.out.print(addition(firstNumber, lastNumber));
                break;
            default: System.err.print("Invalid number choice ");
        }
    }
        static Integer subtraction(Integer firstNumber, Integer lastNumber){
            return (firstNumber - lastNumber);
        }
        static Integer addition(Integer firstNumber, Integer lastNumber){
            return (firstNumber + lastNumber);
        }
}