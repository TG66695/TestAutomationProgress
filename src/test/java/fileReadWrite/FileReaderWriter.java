package fileReadWrite;

import pages.ProductsPage;

import java.io.*;

public class FileReaderWriter {
    public static void saveTitleToFile(Integer number) {
        String fileName = "title.txt";
        String valueToSave = ProductsPage.getItemTitleOnProductPage(number);
        writeToFile(fileName, valueToSave);
    }

    private static void writeToFile(String fileName, String content) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readTitleFromFile() {
        String fileName = "title.txt";
        return readFromFile(fileName);
    }

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
            bufferedReader.close();
            if (content.length() == 0){
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void clearFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
