package module_2.homeWork2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Marco", 4, "siam");
        Cat cat1 = new Cat("Gulya", 5, "sphinx");
        Cat cat2 = new Cat("Pifa", 9, "norvish");

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

        Human human = new Human("Andrew");

        System.out.println(human.hashCode());

        Dog dog = new Dog("Persik");
        Dog dog1 = new Dog("Pers");
        Dog dog2 = new Dog("Basya");
        Dog dog3 = new Dog("Basya");
        System.out.println(dog.equals(dog1));
        System.out.println(dog2.equals(dog3));

        // 4 задание
        // Объект new Integer(100) Будет удален сборщиком мусора.
    }
}
