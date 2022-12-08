public class Main {
    public static void main(String[] args) {

        Integer number= 0;

        String[] namesStudents = new String[]{"Joao", "Charles","Diogo","Arnaldo", "Roberto"};

        printNamesStudents(namesStudents, number);
    }
    static void printNamesStudents (String[] namesStudents, Integer number){


        System.out.println(number + "-aluno, com nome: "+ namesStudents[number]);

        if (number < (namesStudents.length - 1)) {
            printNamesStudents(namesStudents, ++number);
        }
    }
}
