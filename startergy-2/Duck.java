package stratergypattern;

public abstract class Duck {
    FlyBehaviour flybehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flybehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println ("All ducks float, even decoys!");
    }
}