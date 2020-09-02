package module_2.homeWork6;

public abstract class Car extends Vehicle{
    private int maxSpeed;

    public Car(int size, int power, int maxSpeed) {
        super(size, power);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
