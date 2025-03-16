public class methods2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

       boolean ans = isPalindrome("A man, a plan, a canal: Panama");

   /*     String name = "Abe";
        changename(name);
        System.out.println(name);  */

    }

    static void changename(String naam) {
        naam = "rahul tripati";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static boolean isPalindrome(String s) {
        String input  = s;
        String original = input.replaceAll("[^a-zA-Z0-9]", "");
        original = original.toLowerCase();
        System.out.println(original);
        StringBuilder input1 = new StringBuilder();
        input1.append(original);
        input1.reverse();
        System.out.println(input1);
        if (original.equals(input1.toString())) {
            return true;
        }else {
            return false;
        }
        }
}
