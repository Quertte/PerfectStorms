package module_2.homeWork1;

public class Cat {
    private String name;
    private int age;
    private Bread bread;
    private Person owner;

    public Cat(String name, int age, Bread bread, Person owner) {
        this.name = name;
        this.age = age;
        this.bread = bread;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bread=" + bread +
                ", owner=" + owner +
                '}';
    }
}
