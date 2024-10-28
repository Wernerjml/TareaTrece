public class Cat extends Animal{
    String cat;

    public Cat() {
        sound = new Meow();
    }

    @Override
    public void display() {
        cat = "This a cat";
    }

    @Override
    public String toString() {
        return cat;
    }
}