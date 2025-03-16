package com.ReaDer;
import java.io.IOException;
import java.io.StringReader;

public class Stringreader {
    public static void main(String[] args) throws IOException {
        String str = "Hey! This is Me :-)";
        StringReader sr = new StringReader(str);
        int line;
        while((line = sr.read())!= -1){
            System.out.print((char)line);
        }
        sr.close();
    }
}
