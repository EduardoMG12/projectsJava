import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number for multiplication: ");
        Integer numberMultiplication = scanner.nextInt();

        multiplicationForRecursividade(numberMultiplication, 0);

    }
    static void multiplicationForRecursividade(Integer numberSum, Integer number){
        Integer resultSum = numberSum * number;
        System.out.println(number + " X " + numberSum + " = " + resultSum);
        number++;
        if(number <= 10){
            multiplicationForRecursividade(numberSum, number);
        }

    }
}