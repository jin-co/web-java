package Inheritance;
// to inheritance child has to specify the constructor of its parent
public class Dog extends Animal {
    public Dog(String name, int size, int weight, int eyes, int teeth, int legs) {
        super(name, size, weight, "land");
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
    }

    private int eyes;
    private int teeth;
    private int legs;

    public int getEyes() {
        return eyes;
    }

    @Override //annotation is optional but it shows if there is an error regarding overriding rules
    public void eat() {
        System.out.println("dog ");
        super.eat();
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
