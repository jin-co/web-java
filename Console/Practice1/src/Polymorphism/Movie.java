package Polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

