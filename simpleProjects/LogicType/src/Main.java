import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//   Boolean variableTrue = true;
//   Boolean variableFalse = false;
//  System.out.println(variableFalse + " or " + variableTrue);
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("quantos anos voce tem? ");

        Integer yearsOld = scanner.nextInt();

        System.out.println("-------------------------------------");

        String CSI = "\u001B[";

        System.out.println("você tem " + yearsOld + " anos de idade ");

        if (yearsOld < 18){
            System.out.println(CSI + "31" + "m" + "não pode tirar a carteira");
        } else if (yearsOld >= 18){
            System.out.println( CSI + "32" + "m" + "você tem já pode tirar a carteira");
        };
    }
}