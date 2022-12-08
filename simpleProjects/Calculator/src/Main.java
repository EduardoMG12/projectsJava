import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n[1]Somar\n[2]Subtrair\n[3]Dividir\n[4]Multiplicar\n[5]Resto da divisão");
        System.out.println("\n------------------------");
        System.out.print("Insira a opção: ");
        final Integer sumEqua = scanner.nextInt();
        System.out.print("Digite um número:");
        final Double firstNumberSum = scanner.nextDouble();
        System.out.print("Digite outro número:");
        final Double lastNumberSum = scanner.nextDouble();
        switch (sumEqua) {
            case 1: System.out.println( firstNumberSum + lastNumberSum);
                break;
            case 2: System.out.println( firstNumberSum - lastNumberSum);
                break;
            case 3: System.out.println( firstNumberSum / lastNumberSum);
                break;
            case 4: System.out.println( firstNumberSum * lastNumberSum);
                break;
            case 5: System.out.println( firstNumberSum % lastNumberSum);
                break;
            default:
                System.out.println("error number invalid");
        }

    }
}