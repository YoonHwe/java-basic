package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); //인스턴스로 생성 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

    }
    private  static void soundAnimal(InterfaceAnimal animal){
        System.out.println("INTERFACE ANIMAL");
        animal.sound();
    }
}
