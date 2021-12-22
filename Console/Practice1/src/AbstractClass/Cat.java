package AbstractClass;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eat");
    }

    @Override
    public void breathe() {
        System.out.println("breathe");
    }
}
