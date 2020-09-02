package module_2.homeWork6;

public abstract class Vehicle {
    private int size;
    private int power;

    public Vehicle(int size, int power) {
        this.size = size;
        this.power = power;
    }

    public int getSize() {
        return size;
    }

    public int getPower() {
        return power;
    }
}
