package nomission.inf.animal;

public class Cat implements Animal, Animal2{
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleep.");
    }
}
