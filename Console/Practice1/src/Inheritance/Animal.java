package Inheritance;

public class Animal {
    private String name;
    private int size;
    private int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
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
