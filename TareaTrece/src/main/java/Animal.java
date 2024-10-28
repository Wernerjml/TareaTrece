public abstract class Animal {
    protected ISound sound;
    public void setSound(ISound newSound) {
        sound = newSound;
    }

    public void makeSound() {
        sound.sound();
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Animal{" +
                "sound=" + sound +
                '}';
    }
}
