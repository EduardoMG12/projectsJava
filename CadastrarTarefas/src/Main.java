import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];

        Integer i= 0;

            while  (i != 5){
                System.out.print("Digite uma tarefa: ");
                tarefas[i] = scanner.next();
                i++;
            }
            for (i = 0; (i != 5); i++){

            System.out.println(tarefas[i]);
            }

    }
}