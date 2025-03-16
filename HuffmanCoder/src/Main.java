import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String a = "abbcca";
        HuffmanCoder hf = new HuffmanCoder(a);
        String cs = hf.encode(a);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);
    }
}