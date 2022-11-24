import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual nota voce tirou na prova: ");
        Integer note = scanner.nextInt();
       if (note >= 7 && note <= 10) {
            System.out.println("Parabens você foi aprovado!!");
        } else if (note < 0 || note > 10) {
           System.out.println("Valor invalido");
       }else{
            System.out.println("Voce foi reprovado!!");
        }

    }
}