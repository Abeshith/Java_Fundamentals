package com.Polymorphism;

public class StaticMethodOverride {
    public static void main(String[] args) {
        Contry cn = new Contry();
        cn.Greeting(); // Calls the Greeting method in Contry

        // Static methods do not depend on object instances, so we can use the class name instead of an object name.
        // This will also work:
        // cn.greeting(); // This will also work, but using class name is preferable.
        Contry.greeting(); // Calls the static greeting method in Contry

        Contry ind = new India(); // Upcasting: a Contry reference pointing to an India object.
        // Overridden method
        ind.Greeting(); // Calls the overridden Greeting method in India

        // Even though the right-hand side determines what value to return,
        // the parent class's static method will be called because of parent class reference.
        ind.greeting(); // Calls the static greeting method in Contry because of static method behavior

        // We can access the static method of India directly using the class name.
        India.greeting(); // Calls the static greeting method in India

        // Now it is referencing its own class and method
        India india = new India(); // Creating an instance of India
        india.greeting(); // Calls the static greeting method in India
    }
}
class Contry{
    void Greeting(){
        System.out.println("I am in Unknown Contry");
    }
    static void greeting(){
        System.out.println("I am in a static Contry");
    }
}
class India extends Contry{
    @Override
    void Greeting(){
        System.out.println("I am in India");
    }
    // @Override -- raise error bcz static are not overridden -- to check whether its is overriding or not
    static void greeting(){
        System.out.println("I am in static India");
    }
}
