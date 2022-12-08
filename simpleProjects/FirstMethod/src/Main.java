import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final String tittle = "[1] Add row \n[2] Break \nChange:";
        print(tittle);
        String text = scanner.next();
        switch (text) {
            case "1": printRow();
                break;
            case "2":
                final String breakText= "bye";
                print(breakText);
                break;
            default:
                final String invalid= "option invalid";
                print(invalid);
        }
    }
    static void printRow(){
        System.out.println("-----------------------------------------");

    }
    static void print(String text){
        System.out.print(text);

    }
}