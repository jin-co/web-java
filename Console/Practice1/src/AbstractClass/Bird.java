package AbstractClass;

public abstract class Bird extends Animal implements Fly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "pecking");
    }

    @Override
    public void breathe() {
        System.out.println("breathe");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
