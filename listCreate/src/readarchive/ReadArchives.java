package readarchive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadArchives {
    public static void main(String[] args) throws IOException {
        Path archive = Paths.get("exerciseList.txt");
        List<String> readArchive = Files.readAllLines(archive);
        System.out.println(readArchive);

        System.out.println("--------------------------------------");

        for (int i = 0; i < readArchive.size(); i++) {
            String archiveItem = readArchive.get(i);
            System.out.println(archiveItem);
        }

    }
}
