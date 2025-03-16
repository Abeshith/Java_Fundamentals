package com.file;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class file {
    public static void main(String[] args) throws IOException {
        //Creating a file
        String filePath = "C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\file\\newFile.txt";

        // Step 1: Create the file
        try {
            File file = new File(filePath);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

        // Step 2: Write to the file
        try (FileWriter fw = new FileWriter((filePath),true)) { // Using try-with-resources
            fw.write("Hello! This is appended from FileWriter after creating the file.\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Step 3 : Read the file's contents
        try(FileReader fr = new FileReader(filePath)) {
            while (fr.ready()) {
                System.out.print((char)fr.read());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //creating and deleting a file
        String newfilePath = "C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\file\\random.txt";
        try{
            File fo = new File(newfilePath);
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName() + " is deleted.");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
