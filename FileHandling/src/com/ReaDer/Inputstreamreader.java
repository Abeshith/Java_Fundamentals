package com.ReaDer;

import java.io.IOException;
import java.io.InputStreamReader;

public class Inputstreamreader {
    public static void main(String[] args) {

        //InputStreamReader
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters = isr.read();
            }
            //isr.close(); // try catch will automatically close it
            System.out.println();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
