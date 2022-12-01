import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        changeCurse();

        }
        static void changeCurse(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("-----------------------------------");
            String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};
            System.out.println("Escolha dentre os cursos abaixo: ");
            for(int i = 0; i < cursos.length; i++) {

                System.out.println("[" + i + "] "+ cursos[i]);

            }

            System.out.print("O curso que vocé deseja é o: ");
            Integer posicaoCursoEscolhido = scanner.nextInt();
            Boolean posicaoValida = posicaoCursoEscolhido >= 0 & posicaoCursoEscolhido < cursos. length;
            if (!posicaoValida) {

                System.err.println("Posicdo inválida!");

                System.exit(1);
            }
            System.out.println("-----------------------------------");

            String[] formasPagamento = new String[] {"Cartao", "Boleto"};

            System.out.println("Escolha dentre as formas de pagamento abaixo: ");

            for(int i = 0; i < formasPagamento.length; i++) {
                System.out.println("[" + i + "] " + formasPagamento[i]);
            }

            System.out.print("Sua forma de pagamento escolhida é: ");
            Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

            posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento. length;

            if (!posicaoValida) {
                System.err.println("Posicado invalida!");
                System.exit(1);

            }

            String cursoEscolhido = cursos[posicaoCursoEscolhido];
            String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida] ;

            System.out.println("-----------------------------------");

            System.out.println("0 curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
        }

}