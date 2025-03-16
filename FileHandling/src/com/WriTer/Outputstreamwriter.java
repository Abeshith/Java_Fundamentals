package com.WriTer;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Outputstreamwriter {
    public static void main(String[] args) throws IOException {
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write("\n");
            osw.write(99);
            osw.write("\n");
            osw.write(Arrays.toString("Hello World".toCharArray()));
            osw.write("\n");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
