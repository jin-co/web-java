package Inheritance;
// inheritance: is relationship
public class Animal {
    private String name;
    private int size;
    private int weight;
    private String habitat;

    public Animal(String name, int size, int weight, String habitat) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.habitat = habitat;
    }

    public void eat() {
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
