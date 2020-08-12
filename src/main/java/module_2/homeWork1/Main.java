package module_2.homeWork1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Сэм", 33);

        Person deckardCain = new Person("Deckard Cain", 68);
        deckardCain.meditation();

        Cat cat = new Cat("Murzik", 5, Bread.NEBELUNG, new Person("Stepan", 30));
        System.out.println(cat);

        Person[] people = {new Person("Andrew", 30), new Person("Valera", 30),
                new Person("Marina", 28), new Person("Pavel", 23), new Person("John", 29),
                new Person("Vasya", 51)};

        sortByAge(people);
        System.out.println("After sorting by age:");
        System.out.println(Arrays.toString(people));

        sortByName(people);
        System.out.println("After sorting by name:");
        System.out.println(Arrays.toString(people));
    }

    private static void sortByName(Person[] people) {
        Arrays.sort(people, (a, b) -> a.getName().compareTo(b.getName()));
    }

    private static void sortByAge(Person[] people) {
        Arrays.sort(people, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
    }
}
