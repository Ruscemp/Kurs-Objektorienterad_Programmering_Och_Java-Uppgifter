package Klasser.Objects.Animals;

public abstract class Animal {
    private String name;

    public abstract void Sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {    }
    public Animal(String name) {
        this.name = name;
    }
}
