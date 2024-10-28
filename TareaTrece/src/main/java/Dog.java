public class Dog extends Animal {
    String dog;
    public Dog() {
        sound = new Bark();
    }

    @Override
    public void display() {
        dog = "This a dog";
    }

    @Override
    public String toString() {
        return dog;
    }
}

