package module_2.homeWork6;

public class Main {
    public static void main(String[] args) {
        MiniGarage miniGarage = new MiniGarage();
        miniGarage.enter(new MazdaThree(20,40,170));
        miniGarage.leave();
        miniGarage.enter(new MazdaSix(20,40,170));
        miniGarage.enter(new MazdaThree(20,40,170));

        Garage garage = new Garage();
        garage.enter(new YutongZK(100,50,180));
        garage.enter(new MazdaSix(100,50,180));
        garage.leave();
        garage.enter(new Man(100,59,190));

        BigGarage bigGarage = new BigGarage();
        bigGarage.enter(new Nefaz(100,80,90));
        bigGarage.enter(new MazdaSix(100,80,90));
        bigGarage.leave();
        bigGarage.enter(new Man(100,80,90));
        bigGarage.enter(new Iveco(100,80,90));

    }
}
