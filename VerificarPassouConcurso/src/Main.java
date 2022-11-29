import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Quanto você tirou na prova de portugues? ");
        final Integer notaPortugues = scanner.nextInt();
        System.out.print("Quanto você tirou na prova de matematica? ");
        final Integer notaMatematica = scanner.nextInt();
        final Integer somaNotas = notaMatematica + notaPortugues;
        if (somaNotas > 150 && notaPortugues > 60 && notaMatematica > 60){

            System.out.print("Você foi aprovado sua nota foi de " + notaPortugues +" em portugues e " + notaMatematica + " em matematica");
        }
        else {
            final String notaReprovado = ((somaNotas < 150)? " na media total": (notaPortugues < 60) ? " em portugues" : " em matematica");
            System.out.print("Você foi reprovado voce nao alcancou a nota suficiente " + ((somaNotas < 150) ? somaNotas : (notaPortugues < 60) ? notaPortugues : notaMatematica) + notaReprovado);
        };

    }
}