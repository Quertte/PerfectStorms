package module_2.homeWork6;

public class BigGarage implements Garageable {
    private static final int CAPACITY = 2;
    private static int count;

    public static int getCAPACITY() {
        return CAPACITY;
    }

    @Override
    public boolean enter(Vehicle vehicle) {
        boolean result = false;
        count++;
        if (count <= CAPACITY) {
            System.out.println("Машина припаркована, количество машин в гараже: " + count);
            result = true;
        } else {
            System.out.println("Гараж переполнен");
        }
        return result;
    }

    @Override
    public boolean leave() {
        if (count == 0) {
            System.out.println("В гараже машин нет, вы можете припарковать машину!");
        } else {
            count--;
            System.out.println("Машина освободила гараж, количетсов машин в гараже: " + count);
        }
        return true;
    }
}
