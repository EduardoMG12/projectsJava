import console.Iteration;

import java.lang.reflect.Type;

public class Main {


    public static void main(String[] args) {
        Iteration myLibrary= new Iteration();
        myLibrary.print("teste");


        String variableStr = myLibrary.writeString("\nDigite algo: ");
        myLibrary.print(variableStr);
        System.out.println("\n" + variableStr.getClass());

        Double variableDouble = myLibrary.writeDouble("\nDigite um valor decimal: ");
        System.out.println("\n" + variableDouble.getClass());

        Double variableInt = myLibrary.writeDouble("\nDigite um valor inteiro: ");
        System.out.println("\n" + variableInt.getClass());
    }
}