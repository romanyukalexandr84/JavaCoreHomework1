package org.filehandler;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


public class FileHandler {

    //Метод чтения файла
    public static List<String> readFile(File file) {
        List<String> lst = new ArrayList<>();
        try (FileReader fr = new FileReader(file); BufferedReader bf = new BufferedReader(fr)) {
            String line;
            while ((line = bf.readLine()) != null) {
                lst.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }


    //Метод записи данных в файл
    public static void writeFile(List<String> lst, File file, String note) {
        try (FileWriter fw = new FileWriter(file); BufferedWriter bf = new BufferedWriter(fw)) {
            for (String item : lst) {
                bf.write(item);
                bf.newLine();
            }
            bf.write(LocalDate.now() + " -> " + note);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}