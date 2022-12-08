package console;

import java.util.Scanner;

public class Iteration {

    Scanner scanner = new Scanner(System.in);

    public Integer writeInt(String text){
        System.out.print(text);
        return scanner.nextInt();
    }
    public Double writeDouble(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }
    public String writeString(String text){
        System.out.print(text);
        return scanner.nextLine();
    }
    public void close(){
        scanner.close();
    }
    public void print(String text){
        System.out.print(text);
    }

    public void error(String text){
        System.err.print(text);
    }


}
