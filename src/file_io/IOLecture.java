package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class IOLecture {

    public static void main(String[] args) throws IOException {
        String directory = "js";
        String filename = "madeByJava.js";

        // When writing multi-lined content you will use a collection to hold each line.
        ArrayList<String> fileContents = new ArrayList<String>();

        // Each string that we add to the fileContents Collection will represent a line to write on the file
//        fileContents.add("const message = \"Hello World\"");
//        fileContents.add("// written by Java file system");
        fileContents.add("const message = new message");

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        // Check if a directory exists
        if (Files.notExists(dataDirectory)) {
            // If the directory does not exist, we will create it
            Files.createDirectories(dataDirectory);
        }

        // Check if a file exists
        if (! Files.exists(dataFile)) {
            // If the file does not exist, we will create it
            Files.createFile(dataFile);
        }

        // This will write the contents to the file
        Files.write(dataFile, fileContents, StandardOpenOption.APPEND);

        // This is how you will read a file's contents and store it in a collection
        List<String> contentsReadFromFile = Files.readAllLines(dataFile);


        for (String line : contentsReadFromFile) {
            System.out.println(line);
        }
    }
}
