package AbstractClass;
// abstract class: can have fields and method that are not abstract unlike the interface
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
