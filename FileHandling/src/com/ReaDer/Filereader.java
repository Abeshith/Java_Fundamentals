package com.ReaDer;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {
    public static void main(String[] args) throws IOException {

        //reading a file
      /*  try(FileReader fr = new FileReader("C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters = fr.read();
            }
            //isr.close(); // try catch will automatically close it
            System.out.println();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
*/
        FileReader fr = new FileReader("C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\note.txt");
        int data;
        while((data = fr.read()) != -1){
            System.out.println((char)data);
        }
        fr.close();
    }
}
