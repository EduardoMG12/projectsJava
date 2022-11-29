import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1]Domingo\n[2]Segunda\n[3Terca\n[4]Quarta\n[5]Quinta\n[6]Sexta\n[7]Sabado");
        System.out.print("Digite um numero para dizer que dia da semana é: ");
        final Integer day = scanner.nextInt();
    switch (day){
        case 1:
            System.out.print("Domingo");
        break;
        case 2:
            System.out.print("Segunda");
        break;
        case 3:
            System.out.print("Terca");
        break;
        case 4:
            System.out.print("Quarta");
        break;
        case 5:
            System.out.print("Quinta");
        break;
        case 6:
            System.out.print("Sexta");
            break;
        case 7:
            System.out.print("Sabado");
        break;
    }


    }
}