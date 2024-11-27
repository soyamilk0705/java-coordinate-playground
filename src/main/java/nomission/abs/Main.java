package nomission.abs;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.name = "Buddy"; // 추상 클래스 변수
        dog.eat();          // 추상 클래스 함수
        dog.makeSound();    // 추상 클래스 함수를 오버라이드해서 구현한 하위 클래스 함수
    }
}
