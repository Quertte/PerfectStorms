package module_2.homeWork4;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private static int count;

    public Cat(){
        count++;
    }


    // Для доступа геттеры (1 задание)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    //2 Задание
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println("Количество котов " + count);
    }
}
