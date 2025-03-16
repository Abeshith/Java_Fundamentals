package com.WriTer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\WriTer\\note1.txt";
        String contentToWrite = "Hello, This is appended from bufferedwriter😍";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter((filePath),true))){
            bw.write("Hello, This is appended from bufferedwriter😍");
            bw.newLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
