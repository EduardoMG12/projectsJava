public class Main {
    public static void main(String[] args) {


        Integer[] arrayNumbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        for(int i = 0; i < arrayNumbers.length; i++){
            if (arrayNumbers[i] % 3 == 0) {
                System.out.println("O indice " + i +" do array que é " + arrayNumbers[i] + " é divisivel por 3");
            };
            }
    }
}