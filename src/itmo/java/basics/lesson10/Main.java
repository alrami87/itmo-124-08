package itmo.java.basics.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File fileOut = new File("files/output.txt");
        File fileOut2 = new File("files/output2.txt");

        System.out.println(fileToListOfStrings(file));

        writeStringToFile("Это - тестовая строка для записи в 11111 файл, который задан в качестве аргумента.", fileOut);

        writeTwoFilesToThird(file, fileOut, fileOut2);

        changePatternInFile(fileOut2, "\\$");
    }

    public static List<String> fileToListOfStrings(File file) {
        List<String> strings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String input;

            while ((input = reader.readLine()) != null) {
                strings.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return strings;
    }

    public static void writeStringToFile(String string, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write(string);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeTwoFilesToThird(File fileIn1, File fileIn2, File fileOut) {

        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileIn1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileIn2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut))) {

            String input;

            while ((input = reader1.readLine()) != null) {
                writer.write(input + "\n");
            }

            while ((input = reader2.readLine()) != null) {
                writer.write(input + "\n");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void changePatternInFile(File file, String pattern) {

        List<String> strings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String input;

            while ((input = reader.readLine()) != null) {
                strings.add(input);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (String input : strings) {
                input = input.replaceAll("[\\p{Punct}\\p{Blank}]", pattern);
                writer.write(input + "\n");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
