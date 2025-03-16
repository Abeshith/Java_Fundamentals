package com.ReaDer;

import java.io.*;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Typed : " + bfr.readLine());
        bfr.close();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abhes\\IdeaProjects\\Recursions\\FileHandling\\src\\com\\note.txt"));
        while(br.ready()){
            System.out.println(br.readLine());
        }
        br.close();
    }
}
