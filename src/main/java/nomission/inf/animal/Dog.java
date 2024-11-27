package nomission.inf.animal;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
