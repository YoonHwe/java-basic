package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog); // Fly implements 안함.
        flyAnimal(bird);
        flyAnimal(chicken);
    }
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("SOUND ANIMAL");
        animal.sound();
    }

    private static void flyAnimal(Fly fly){
        System.out.println("FLY ANIMAL");
        fly.fly();
    }
}
