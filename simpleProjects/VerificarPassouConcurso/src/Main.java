import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Integer metaFaturamento = 200000;
        final Integer faturamento = 190000;
        final Boolean bateuFaturamento = faturamento >= metaFaturamento;
        final Integer salario = 3000;

        if (bateuFaturamento){

            System.out.print("Você conseguiu bater as metas seu salario terá um adicional de " + salario +" você irá receber " + (salario*2) + " R$");
        } else if ((!bateuFaturamento) && (faturamento >= (faturamento / 5)* 4)) {
            System.out.print("Você nao conseguiu bater as metas mas chegou a 80% da meta, irá ganhar um bonus de " + ((salario / 5)* 4) +" você irá receber no total " + (salario+ ((salario / 5)* 4)) + " R$");
        } else {
            System.out.print("Infelizmente você nao ganhou bonus seu salário sera de " + salario);
        };

    }
}