package com.WriTer;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) throws IOException {
        try(FileWriter fw  = new FileWriter(("C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\WriTer\\note.txt"),true)){
            //this overrides the previous message
            // for not overriding use true
            fw.write("Hello! This is From FileWriter Class \n This is only for practicing of FileHandling.\n So please consider this a info✨.");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
