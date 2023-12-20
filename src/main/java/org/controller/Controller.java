package org.controller;

import org.filehandler.FileHandler;

import java.io.*;
import java.util.*;

public class Controller {
    public static void workWithNotes() throws IOException {
        System.out.println("Введите заметку");
        Scanner scan = new Scanner(System.in);
        String note = scan.nextLine();
        File file = new File("src/main/java/org/db/database.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        List<String> fileContent = FileHandler.readFile(file);
        FileHandler.writeFile(fileContent, file, note);
    }
}
