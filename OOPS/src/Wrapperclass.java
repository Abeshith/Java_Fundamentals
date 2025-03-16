public class Wrapperclass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 25;

        System.out.println(a + " " + b);

        Person Abe = new Person();

        System.out.println(Abe.name);

    }

}
class Person {
    int age;
    int score;
    String name;

    Person (){
        this.age = 34;
        this.score = 334;
        this.name = "rtug";
    }
}
