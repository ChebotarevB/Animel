import extenders.Cat;
import extenders.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.giveAVoice();
        cat.giveAVoice();
        cat.getSomeFood();
        dog.getSomeFood();
        dog.run();
        cat.jump();
    }
}
