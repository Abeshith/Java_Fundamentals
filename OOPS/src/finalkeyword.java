public class finalkeyword {
    public static void main(String[] args) {
        //Object Reference
        final Person1 alice = new Person1("Alice");
        System.out.println(alice.name);

        //we can modify final
        alice.name = "Bob";
        System.out.println(alice.name);

        //but can't do something like this
        //alice = new Person1("bob");


        // Instance Variable
        Person2 bob = new Person2(37);
        System.out.println(bob.id);

        //but we cant do something like this
        //bob.id = 355;

        //instead we can do this
        bob = new Person2(35);
        System.out.println(bob.id);

        // for primitive we cant able to even modify
        final int i = 200;
        //i = 2434;
    }
}
class Person1{
    String name;

    public Person1(String name){
        this.name = name;
    }
}

//Instance variable
class Person2{
    final int id;

    Person2(int id){
        this.id = id;
    }
}
