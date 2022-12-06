package writearchive;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteArchive {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("Escreve algo para colocar no arquivo txt:");
        String message = scanner.nextLine();

        lines.add(message);

        Path archive = Paths.get("C:/Users/charl/Downloads/Documentos/arquivo.txt");
        FileWriter fileWriter = new FileWriter("JavaFileFirstArchive.txt");

        fileWriter.write(lines.get(0));
        fileWriter.close();
        scanner.close();

    }
}
