package m.dev.practice;

abstract class Animal {
    abstract void sound();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            void sound() {
                System.out.println("dev p");
            }
        };
        animal.sound();
    }
}
