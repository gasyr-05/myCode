package Lecture15;

public class Animal {
    public void feed(){
        System.out.println("Animal.feed()");
    }
}

class Pet extends Animal {
    public void call(){
        System.out.println("Pet.call()");
    }
}
class Pet1 extends Animal {
    public void drink() {
        System.out.println("Pet1.drink()");
    }
}



