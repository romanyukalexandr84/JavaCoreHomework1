package org.entrypoint;

import org.filehandler.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите заметку");
        Scanner scan = new Scanner(System.in);
        String note = scan.next();

        File file = new File("src/main/java/org/db/database.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        List<String> fileContent = FileHandler.readFile(file);
        FileHandler.writeFile(fileContent, file, note);
    }
}