import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        functionGetCurse();

    }
    static void functionGetMethodPaymentAndFinishProcess(String[] cursos, Integer posicaoCursoEscolhido){
        Scanner scanner = new Scanner(System.in);

        String[] formasPagamento = new String[] {"Cartao", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        forArrayPrintOptions(formasPagamento);

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        Boolean posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento. length;

        validationPosition(posicaoValida);

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida] ;

        imprimirRow();

        System.out.println("0 curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

    }
    static void functionGetCurse(){
        Scanner scanner = new Scanner(System.in);

        imprimirRow();
        String[] cursos = new String[] {"Java EE", "Spring", "Java 00 Avancado"};
        System.out.println("Escolha dentre os cursos abaixo: ");

        forArrayPrintOptions(cursos);

        System.out.print("O curso que vocé deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 & posicaoCursoEscolhido < cursos. length;

        validationPosition(posicaoValida);

        imprimirRow();

        functionGetMethodPaymentAndFinishProcess(cursos, posicaoCursoEscolhido);
    }
    static void imprimirRow(){
        System.out.println("-----------------------------------");


    }
    static void forArrayPrintOptions(String[] array){
        for(int i = 0; i < array.length; i++) {

            System.out.println("[" + i + "] "+ array[i]);

        }


    }

    static void validationPosition(Boolean validation){

        if (!validation) {
            errorMessage();

        }
    }
    static void errorMessage(){

        System.err.println("Posicdo inválida!");

        System.exit(1);

    }
}