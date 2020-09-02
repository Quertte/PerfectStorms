package module_2.homeWork6;

public class Garage implements Garageable{
    private static  final int CAPACITY = 1;
    private static int count;

    public static int getCAPACITY() {
        return CAPACITY;
    }

    @Override
    public boolean enter(Vehicle vehicle) {
        boolean result = false;
        if((vehicle instanceof Car || vehicle instanceof Truck) && count < CAPACITY){
            System.out.println("Машина припаркована");
            count++;
            result = true;
        }else {
            System.out.println("Вы пытаетесь припарковать не ту машину, или гараж переполнен");
        }
        return result;
    }

    @Override
    public boolean leave() {
        System.out.println("Машина освободила гараж");
        count--;
        return true;
    }
}
